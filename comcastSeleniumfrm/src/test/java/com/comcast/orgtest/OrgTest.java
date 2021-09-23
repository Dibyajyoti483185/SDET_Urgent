package com.comcast.orgtest;

import org.testng.annotations.Test;

public class OrgTest {

	@Test(groups = "SmokeTest")
	public void createOrgTest() {
		System.out.println("execute createOrgTest");
		
	}
	@Test(groups = "RegressionTest")
	public void createOrgWithIndusTest() {
		System.out.println("execute createOrgWithIndusTest");
	}
	@Test(groups = "RegressionTest")
	public void deleteOrgTest() {
		System.out.println("execute deleteOrgTest");
	}
}
