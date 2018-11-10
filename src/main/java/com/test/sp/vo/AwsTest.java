package com.test.sp.vo;

import org.apache.ibatis.type.Alias;

import lombok.Data;

@Alias("aws")
@Data
public class AwsTest {

	private Integer atnum;
	private String atname;
	private Integer atage;
}
