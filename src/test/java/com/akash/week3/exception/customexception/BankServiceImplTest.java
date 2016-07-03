/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception.customexception;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sky
 */
public class BankServiceImplTest {
    BankService bankService =new BankServiceImpl();
    public BankServiceImplTest() {
    }

    @Test
    public void testIsLoginAndAtmAvailable() {
    }

    @Test
    public void testDoPayment() throws Exception {
        bankService.doPayment(14.0, 10.0);
    }

    @Test
    public void testDoWithdraw() throws Exception {
        bankService.doWithdraw(8d, 7d);
    }
    
}
