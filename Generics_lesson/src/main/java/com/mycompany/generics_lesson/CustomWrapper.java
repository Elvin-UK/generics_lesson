/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.generics_lesson;

/**
 *
 * @author User
 */
public class CustomWrapper {
    
    public<T> T printAsIWant(T obj){
        System.out.println(obj);
        return obj;
    }
}
