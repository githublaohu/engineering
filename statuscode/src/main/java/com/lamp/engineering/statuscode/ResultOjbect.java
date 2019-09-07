package com.lamp.engineering.statuscode;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResultOjbect<T> {

	private int code;

	private String message;

	private T data;

	private String errorMessages;

	private int currentPage;

	private int count;

	private int pageNum;
}
