/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception.customexception;

import java.util.Random;

/**
 *
 * @author sky
 */


interface BankService {

    void doPayment(Double custPayment, Double actualpayment) throws NotSufficentBalanceException;

    void doWithdraw(Double withdrawAmount, Double balance) throws NotSufficentBalanceException, DailyAmountExceedMoney;
}

public class BankServiceImpl implements BankService {
    Random random = new Random(100);
    
    
    public boolean isLoginAndAtmAvailable(){
    return random.nextInt(100)%2==0;
   
    }
    @Override
    public void doPayment(Double custPayment, Double actualpayment) throws NotSufficentBalanceException {

        if(isLoginAndAtmAvailable()){
        throw new InvalidAccessException();
        }
        
        if (custPayment == null || actualpayment == null) {
            throw new IllegalArgumentException("Invalid amount.[CustPayment=" + custPayment + ",actualPayment=" + actualpayment + "]");
        }
        if (custPayment < actualpayment) {
            throw new NotSufficentBalanceException();
        }
        if(isLoginAndAtmAvailable()){
        throw new AtmSystemError();
                }
    }

    @Override
    public void doWithdraw(Double withdrawAmount, Double balance) throws NotSufficentBalanceException, DailyAmountExceedMoney {
     
        if(isLoginAndAtmAvailable()){
        throw new InvalidAccessException();
        }
        
        if (withdrawAmount == null || balance == null) {
            throw new IllegalArgumentException("Invalid amount.[withdraw=" + withdrawAmount + ",balance=" + balance);

        }
        if (withdrawAmount > 30000) {
            throw new DailyAmountExceedMoney();
        }
    
    if(withdrawAmount >balance){
        throw new NotSufficentBalanceException();
    }
    if(isLoginAndAtmAvailable()){
    throw  new AtmSystemError();
    }

    }


}


