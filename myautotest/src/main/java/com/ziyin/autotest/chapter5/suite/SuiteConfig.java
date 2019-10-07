package com.ziyin.autotest.chapter5.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @author ziyin
 * @create 2019-10-06 21:17
 *
 */
public class SuiteConfig {

	@BeforeSuite
	public void beforeSuit(){
		System.out.println("beforeSuit");
	}

	@AfterSuite
	public void afterSuit(){
		System.out.println("afterSuit");
	}

	@BeforeTest
	public void beforeTest(){
		System.out.println("beforeTest");
	}

	@AfterTest
	public void afterTest(){
		System.out.println("afterTest");
	}
}
