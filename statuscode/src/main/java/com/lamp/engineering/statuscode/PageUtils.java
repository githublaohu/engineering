package com.lamp.engineering.statuscode;

public class PageUtils {

	private static final ThreadLocal<ResultOjbect<String>> LOCAL_RESULT_OJBECT = new ThreadLocal<>();

	// 转变code就行了，spring mvc spring feing dubbo
	public static final void setPageInfo(int currentPage, int pageNum) {
		ResultOjbect<String> object = LOCAL_RESULT_OJBECT.get();
		if (object == null) {
			object = new ResultOjbect<String>();
			LOCAL_RESULT_OJBECT.set(object);
		}
		object.setCurrentPage(currentPage);
		object.setPageNum(pageNum);
	}

	public static final ResultOjbect<String> getPageInfo() {
		return LOCAL_RESULT_OJBECT.get();
	}
}
