package com.test.config;

import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@NoRepositoryBean
public interface BaseRepository<T>
		extends JpaRepository<T, ID> {

	boolean support(String modelType);

	List<T> queryListByProperties(String[] properties, Object[] values);

	T findByProperties(String[] properties, Object[] values);

	int excute(String sql, Map<String, Object> param);

	<S extends T> S encrySave(S entity);

	T encryFindByProperties(String[] properties, Object[] values);
}
