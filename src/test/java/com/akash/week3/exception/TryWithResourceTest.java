/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception;

import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sky
 */
public class TryWithResourceTest {

    private final TryWithResource tryWithResourceTest = new TryWithResource();

    public TryWithResourceTest() {

    }

    @Test(expected = IOException.class)
    public void testTryWithResource() throws Exception {
        tryWithResourceTest.tryWithResource();
    }

}
