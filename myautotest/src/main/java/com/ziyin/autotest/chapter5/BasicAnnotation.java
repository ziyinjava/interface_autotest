package com.ziyin.autotest.chapter5;

import org.testng.annotations.*;

/**
 * @author ziyin
 * @create 2019-10-06 21:07
 */
public class BasicAnnotation {

	// 把方法标记为测试的一部分
	@Test
	public void testCase1() {
		System.out.println("测试用例1");
	}
	@Test
	public void testCase2() {
		System.out.println("测试用例2");
	}

	/**
	 * 每个测试用例运行之前都会运行
	 */
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod是在测试方法之前运行");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod在测试方法之后运行");
	}

	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass这是在类运行之前运行的方法");
	}

	@AfterClass
	public void afterClass(){
		System.out.println("afterClass这是在类运行之后运行的方法");
	}

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("BeforeSuite测试套件");
	}

	@AfterSuite
	public void afterSuite(){
		System.out.println("AfterSuite测试套件");
	}


}
