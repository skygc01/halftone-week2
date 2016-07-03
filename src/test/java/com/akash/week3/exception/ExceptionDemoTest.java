/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sky
 */
public class ExceptionDemoTest {
     private final ExceptionDemo exceptionDemo = new ExceptionDemo();
    public ExceptionDemoTest() {
    }

    @org.junit.Test(expected = NullPointerException.class)
    public void testNullPointerException() {
        exceptionDemo.nullPointerException(null);
    }

    @Test
    public void testClassNotFoundException() throws Exception{
        exceptionDemo.classNotFoundException();
    }
    
}
