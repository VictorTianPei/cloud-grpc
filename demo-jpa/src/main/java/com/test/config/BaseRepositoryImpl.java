package com.test.config;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class BaseRepositoryImpl<T>
		extends SimpleJpaRepository<T, ID>
		implements BaseRepository<T> {

	private final Class<T> domainClass;

	private final EntityManager entityManager;

	public BaseRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
		super(domainClass, entityManager);
		this.domainClass = domainClass;
		this.entityManager = entityManager;
	}

	@Override
	public boolean support(String modelType) {
		return domainClass.getName().equals(modelType);
	}

	/**
	 * 拼接查询条件
	 * @param properties
	 * @param values
	 * @return
	 */
	private Specification<T> getSpec(String[] properties, Object[] values) {
		return (root, query, cb) -> {
			int length = properties.length;
			Predicate[] p = new Predicate[length];
			for (int i = 0; i < length; i++){
				if (values[i] instanceof Object[]) {
					CriteriaBuilder.In<Object> in = cb.in(root.get(properties[i]));
					for(Object ob : (Object[])values[i]) {
						in.value(ob);
					}
					p[i] = in;
				} else {
					p[i] = cb.equal(root.get(properties[i]), values[i]);
				}
			}
			return cb.and(p);
		};
	}

	@Override
	public List<T> queryListByProperties(String[] properties, Object[] values) {
		if (properties == null || values == null || properties.length != values.length) {
			throw new RuntimeException("error-----------");
		}
		return findAll(getSpec(properties, values));
	}

	@Override
	public T findByProperties(String[] properties, Object[] values) {
		if (properties == null || values == null || properties.length != values.length) {
			throw new RuntimeException("error-----------");
		}
		return findOne(getSpec(properties, values)).orElse(null);
	}

	@Override
	@Transactional
	public <S extends T> S save(S entity) {
		if (entity instanceof BaseEntity) {
			((BaseEntity) entity).setCreateDate(new Date());
		}
		return super.save(entity);
	}

	@Override
	@Transactional
	public int excute(String sql, Map<String, Object> param) {
		Query query = entityManager.createNativeQuery(sql);
		if (param != null && !param.isEmpty()) {
			param.forEach((k, v) -> query.setParameter(k, v));
		}
		return query.executeUpdate();
	}

	@Override
	@Transactional
	public <S extends T> S encrySave(S entity) {
		Field[] declaredFields = entity.getClass().getDeclaredFields();
		for (Field field : declaredFields) {
			if (field.isAnnotationPresent(Encryption.class)) {
				field.setAccessible(true);
				try {
					field.set(entity, field.get(entity) + "-----");
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
			}
		}
		return save(entity);
	}

	@Override
	public T encryFindByProperties(String[] properties, Object[] values) {
		Field[] declaredFields = domainClass.getDeclaredFields();
		List<Field> encryFieldList = new ArrayList<>(4);
		List<String> encryFieldNameList = new ArrayList<>(4);
		for (Field field : declaredFields) {
			if (field.isAnnotationPresent(Encryption.class)) {
				encryFieldList.add(field);
				encryFieldNameList.add(field.getName());
			}
		}
		// TODO 查询条件中带有加密字段
		for (String property : properties) {
			if (encryFieldNameList.contains(property)) {

			}
		}
		T entity = findByProperties(properties, values);
		//Field[] retrunFields = entity.getClass().getDeclaredFields();
		for (Field field : encryFieldList) {
			try {
				field.setAccessible(true);
				field.set(entity, field.get(entity) + "++++++");
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return entity;
	}
}