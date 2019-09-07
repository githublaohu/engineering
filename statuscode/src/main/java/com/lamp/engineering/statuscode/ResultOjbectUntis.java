package com.lamp.engineering.statuscode;

public class ResultOjbectUntis {

	private static final ResultOjbect<String> DEFAULT_SUCCESS = ResultOjbect.<String>builder().code(10000)
			.message("执行成功").build();

	private static final ResultOjbect<String> DEFAULT_FAIL = ResultOjbect.<String>builder().code(20000).message("执行失败")
			.build();

	public static ResultOjbect<String> defaultSuccess() {
		return DEFAULT_SUCCESS;
	}

	public static <T> ResultOjbect<T> defaultSuccess(T data) {
		return ResultOjbect.<T>builder().code(10000).message("执行成功").data(data).build();
	}

	public static ResultOjbect<String> defaultFail() {
		return DEFAULT_FAIL;
	}

	public static ResultOjbect<String> defaultFail(String errerMessage) {
		return ResultOjbect.<String>builder().code(20000).message("执行失败").errorMessages(errerMessage).build();
	}

	public static ResultOjbect<String> defaultFail(int code, String message, String errerMessage) {
		return ResultOjbect.<String>builder().code(code).message(message).errorMessages(errerMessage).build();
	}

}
