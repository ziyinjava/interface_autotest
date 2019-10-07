package com.ziyin.autotest.chapter5;

import org.testng.annotations.Test;

public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();

    }

    // test1运行失败了, test2不会运行, 这样就是依赖
    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }

}
