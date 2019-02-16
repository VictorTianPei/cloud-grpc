package com.test.jdbcconfig;

import java.util.List;
import java.util.Map;

public interface jdbcDao {

	List<Map<String, Object>> query(String sql);

	List<Map<String, Object>> query(String sql, Map<String, Object> params);

	List<Map<String, Object>> query(String sql, Page page);

	List<Map<String, Object>> query(String sql, Map<String, Object> params, Page page);

	int getTotalCount(String sql);

	int getTotalCount(String sql, Map<String, Object> params);

}
