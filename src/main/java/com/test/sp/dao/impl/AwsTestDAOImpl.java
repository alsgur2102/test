package com.test.sp.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.sp.dao.AwsTestDAO;
import com.test.sp.vo.AwsTest;

@Repository
public class AwsTestDAOImpl implements AwsTestDAO { 

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<AwsTest> selectTestList() {
		return ss.selectList("com.test.sp.TEST.selectTESTList");
	}

	@Override
	public AwsTest selectTest(int atnum) {
		return ss.selectOne("com.test.sp.TEST.selectTEST",atnum);
	}

	@Override
	public Integer insertTest(AwsTest aws) {
		return ss.insert("com.test.sp.TEST.insertTEST",aws);
	}

	@Override
	public Integer updateTest(AwsTest aws) {
		return ss.update("com.test.sp.TEST.updateTEST",aws);
	}

	@Override
	public Integer deleteTest(int atnum) {
		return ss.delete("com.test.sp.TEST.updateTEST",atnum); 
	}

}
