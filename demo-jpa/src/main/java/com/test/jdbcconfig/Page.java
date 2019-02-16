package com.test.jdbcconfig;

import java.util.List;

public class Page {

	private Integer currentPage;

	private Integer totalPage;

	private Integer pageSize;

	private Integer totalCount;

	private List<PageOrder> pageOrderList;

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<PageOrder> getPageOrderList() {
		return pageOrderList;
	}

	public void setPageOrderList(List<PageOrder> pageOrderList) {
		this.pageOrderList = pageOrderList;
	}
}
