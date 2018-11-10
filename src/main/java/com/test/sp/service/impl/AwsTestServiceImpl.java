package com.test.sp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.sp.dao.AwsTestDAO;
import com.test.sp.service.AwsTestService;
import com.test.sp.vo.AwsTest;

@Service
public class AwsTestServiceImpl implements AwsTestService {

	@Autowired
	private AwsTestDAO atdao;
	
	@Override
	public List<AwsTest> selectTestList() {
		return atdao.selectTestList();
	}

	@Override
	public AwsTest selectTest(int atnum) {
		return atdao.selectTest(atnum);
	}

	@Override
	public Integer insertTest(AwsTest aws) {
		return atdao.insertTest(aws);
	}

	@Override
	public Integer updateTest(AwsTest aws) {
		return atdao.updateTest(aws);
	}

	@Override
	public Integer deleteTest(int atnum) {
		return atdao.deleteTest(atnum); 
	}

}
