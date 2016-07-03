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
public class ThrowAndThrowsDemoTest {
    private final ThrowAndThrowsDemo demo =new ThrowAndThrowsDemo();
    public ThrowAndThrowsDemoTest() {
    }

    

    @Test
    public void testAddition1_1() {
        demo.addition1(10, 12);
        assertTrue(true);
    }
    
     @Test(expected = IllegalArgumentException.class)
    public void testAddition1_2() {
        
        demo.addition1("23", 12);
       
    }
     @Test(expected = ClassNotFoundException.class)
    public void testAddition2_1() throws Exception {
      
      demo.addition2(12, 12);
    }
    
      @Test(expected = InterruptedException.class)
    public void testAddition2_2() throws Exception {
      demo.addition2("a", "a");
     
    }
    
}
