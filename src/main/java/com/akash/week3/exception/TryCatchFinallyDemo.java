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
public class TryCatchFinallyDemo {

    public void tryBlockc() {

        try {
            Double.valueOf("abc");
        } finally {

        }

    }

    public void tryCatchBlock() {
        try {

            Double.valueOf("-ab.99");

        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
        }
    }

    public void multipleCatch() {
        try {
            Double.valueOf("10");
            Class.forName("A");
        } catch (NullPointerException ex) {
            ex.printStackTrace();

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
    public void singlemultipleCatch() {
        try {
            Double.valueOf("10");
            Class.forName("A");
        } catch (NullPointerException | NumberFormatException | ClassNotFoundException ex) {
            ex.printStackTrace();

        } 
    }
    public void FinallyDemo(){
       try{
       Double.valueOf("10");
       
       
       }catch(NumberFormatException ex){
           ex.printStackTrace();
       
       
       }finally{
       
       
        System.out.println("I AM FINAL BLOCk");
    }

     try{
       Double.valueOf("10.ab");
       
       
       }catch(NumberFormatException ex){
           ex.printStackTrace();
       
       
       }finally{
       
       
        System.out.println("I AM FINAL BLOCk");
    }
}
}