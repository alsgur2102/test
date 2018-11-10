package com.test.sp.dao;

import java.util.List;

import com.test.sp.vo.AwsTest;

public interface AwsTestDAO {

	public List<AwsTest> selectTestList();
	public AwsTest selectTest(int atnum);
	public Integer insertTest(AwsTest aws);
	public Integer updateTest(AwsTest aws);
	public Integer deleteTest(int atnum);
}
