package com.testingexample.demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {

    MyMath myMath = new MyMath();

    @Before
    public void before() {
        System.out.println("before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    // MyMath.sum
    // 1,2,3 => 6
    @Test
    public void sumWithThreeNumers() {
        System.out.println("test 1");
        int result = myMath.sum(new int[] { 1, 2, 3 });
        // Check the result is 6
        assertEquals("Testing my math add with 6", 6, result);
    }

    @Test
    public void sumWithOneNumber() {
        System.out.println("test 2");
        int result = myMath.sum(new int[] { 3 });
        assertEquals("Testing my math add", 3, result);
    }
}