package com.zandili.demo.mongo.common.page;

import java.io.Serializable;
import java.util.List;

/**
 * 分页工具类
 *
 * @ClassName: PageWithData
 * @author: airfey 2013-11-8 下午12:19:54 
 * @param <E>  
 * @version V1.0   
 *
 */
public class PageWithData<E extends Serializable> implements Serializable {

	private static final long serialVersionUID = 1153863153214796311L;
    /**
     * 当前页数据list
     */
	private List<E> data;
    /**
     * 当前页码
     */
	private int currentPage;
	/**
	 * 首条记录
	 */
	private int firstResult;
	/**
	 * 总记录条数
	 */
	private int totalResults;
	/**
	 * 每页条数
	 */
	private int onePageSize;
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 下一页页码
	 */
	private int nextPage;
	/**
	 * 上一页页码
	 */
	private int previousPage;

	public PageWithData(int currentPage, int onePageSize) {
		if (currentPage > 1)
			this.currentPage = currentPage;
		else
			this.currentPage = 1;
		this.onePageSize = onePageSize;
		this.firstResult = (this.currentPage - 1) * this.onePageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
		if (currentPage <= 0)
			this.currentPage = 1;
		if (currentPage > this.totalPage)
			this.currentPage = totalPage;
		this.firstResult = (this.currentPage - 1) * this.onePageSize;

	}

	public int getOnePageSize() {
		return onePageSize;
	}

	public void setOnePageSize(int onePageSize) {
		this.onePageSize = onePageSize;
	}

	public int getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(int totalResults) {
		this.totalResults = totalResults;
		if (totalResults % this.onePageSize == 0) {
			this.totalPage = totalResults / this.onePageSize;
		} else {
			this.totalPage = (int) Math.floor(totalResults / this.onePageSize) + 1;
		}

		if (this.totalPage == 0) {
			this.totalPage = 1;
		}
		if (this.currentPage > totalPage) {
			this.currentPage = totalPage;
			this.firstResult = (this.currentPage - 1) * this.onePageSize;

		}
		if (this.currentPage > 1) {
			this.previousPage = this.currentPage - 1;
		} else {
			this.previousPage = 1;
		}
	}

	public int getFirstResult() {
		return firstResult;
	}

	public int getNextPage() {
		if (this.currentPage < this.totalPage) {
			this.nextPage = this.currentPage + 1;
		} else {
			this.nextPage = this.totalPage;
		}
		return nextPage;
	}

	public int getPreviousPage() {
		return previousPage;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public List<E> getData() {
		return data;
	}

	public void setData(List<E> data) {
		this.data = data;
	}

}
