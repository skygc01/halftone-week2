/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akash.week3.exception;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author sky
 */
public class TryWithResource {

    public void tryWithResource() throws IOException {
        //TRY WITH RESOURCE ->Closable or AutoCloseable
        try (InputStream inputStream = new FileInputStream("/home/sky/Documents/hello.txt")) {
            int read;
            while ((read = inputStream.read()) != -1) {
                System.out.print((char) read + " ");

            }

        }

    }
}
