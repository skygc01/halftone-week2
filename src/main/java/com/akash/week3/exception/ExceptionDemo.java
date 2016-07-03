/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception;

public class ExceptionDemo {

    public void nullPointerException(student student) {
        System.out.println("Name=" + student.getName());

    }
public void classNotFoundException() throws ClassNotFoundException{
  Class.forName("IamDone");
} 
}

class student {

    private final String name = "RAM";

    public String getName() {
        return name;
    }

}
