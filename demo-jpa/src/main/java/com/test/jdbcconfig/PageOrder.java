package com.test.jdbcconfig;

public class PageOrder {

	private String key;

	/** asc desc */
	private String direction;

	public PageOrder(String key, String direction) {
		this.key = key;
		this.direction = direction;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}
}
