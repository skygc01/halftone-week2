/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception.customexception;

/**
 *
 * @author sky
 */
public class AtmSystemError  extends Error{
    public AtmSystemError(){
       super("Atm error");
    }
    public AtmSystemError(String message){
    super(message);
    
    }
}
