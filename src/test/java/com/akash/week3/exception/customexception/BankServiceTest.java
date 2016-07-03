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
public class BankServiceTest {
    
    public BankServiceTest() {
    }

    @Test
    public void testDoPayment() throws Exception {
    }

    @Test
    public void testDoWithdraw() throws Exception {
    }

    public class BankServiceImpl implements BankService {

        public void doPayment(Double custPayment, Double actualpayment) throws NotSufficentBalanceException {
        }

        public void doWithdraw(Double withdrawAmount, Double balance) throws NotSufficentBalanceException, DailyAmountExceedMoney {
        }
    }
    
}
