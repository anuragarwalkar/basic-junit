package com.testingexample.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
// import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AssertTest {

    @Test
    public void test() {
        boolean cond = true;
        assertEquals(true, cond);
        assertTrue(cond);
        assertFalse(cond);
        // assertNotNull(object);
    }
}
