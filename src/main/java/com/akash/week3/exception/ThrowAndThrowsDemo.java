/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception;

/**
 *
 * @author sky
 */
public class ThrowAndThrowsDemo {
    public void addition1(Object o1,Object o2){
      if(!((o1 instanceof Integer)&&(o2 instanceof Integer))){
         throw new IllegalArgumentException("Not valid Number");
      }
    
    }
     public void addition2(Object o1,Object o2) throws InterruptedException,ClassNotFoundException{
      if(!((o1 instanceof Integer)&&(o2 instanceof Integer))){
         throw new InterruptedException("Not valid Number");
      }
      throw new ClassNotFoundException("Class not found");

    }
}
