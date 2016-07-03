/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author sky
 */
public class TryCatchFinallyDemoTest {
   private final TryCatchFinallyDemo demo = new TryCatchFinallyDemo();
    public TryCatchFinallyDemoTest() {
        
    }

    @Test
    @Ignore
    public void testTryBlockc() {
        demo.tryBlockc();
    }

    @Test
    @Ignore
    public void testTryCatchBlock() {
        demo.tryCatchBlock();
    }

    @Test
    @Ignore
    public void testMultipleCatch() {
       demo.multipleCatch();
    }

    @Test
    @Ignore
    public void testSinglemultipleCatch() {
        demo.singlemultipleCatch();
    }

    @Test
    public void testFinallyDemo() {
    }
    
}
