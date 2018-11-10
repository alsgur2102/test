package com.test.sp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.sp.dao.AwsTestDAO;
import com.test.sp.service.AwsTestService;
import com.test.sp.vo.AwsTest;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Slf4j
public class DBTest {
	/*
	@Autowired
	private AwsTestDAO atdao;
	
	@Autowired
	private AwsTestService ats;
	
	@Test
	public void test() throws SQLException {
		assertEquals(1, atdao.selectTestList().size()); 
	}

	@Test
	public void tests() throws SQLException {
		assertEquals(1, ats.selectTestList().size());
	}
	*/
	/*@Autowired
	private SqlSession ss;
	
	@Test
	public void testss() throws SQLException {
		AwsTest aws = ss.selectOne("com.test.sp.TEST.selectTEST",2);
		assertNotNull(aws);
		
		aws.setAtname("변경");
		aws.setAtage(22);
		assertEquals(1, ss.update("com.test.sp.TEST.updateTEST",aws));
		
		aws = ss.selectOne("com.test.sp.TEST.selectTEST",2);
		assertEquals("변경", aws.getAtname());
		
		assertEquals(1, ss.delete("com.test.sp.TEST.deleteTEST",2));
		
		assertEquals(1, ss.insert("com.test.sp.TEST.insertTEST",aws));
		
		List<AwsTest> atList = ss.selectList("com.test.sp.TEST.selectTESTList");
		
		assertEquals(1, atList.size()); 
		log.info("atList=>{}",atList);
	}*/
}
