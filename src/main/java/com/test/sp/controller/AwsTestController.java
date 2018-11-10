package com.test.sp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.sp.service.AwsTestService;
import com.test.sp.vo.AwsTest;

@Controller
public class AwsTestController {

	@Autowired
	private AwsTestService ats;
	
	@GetMapping("/awstests")
	public @ResponseBody List<AwsTest> getAwsTestList() {
		return ats.selectTestList();
	}
}