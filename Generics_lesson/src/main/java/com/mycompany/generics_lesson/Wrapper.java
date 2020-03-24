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
public class Wrapper<T,E,Z > {//generic compile time type safety verir 
private T obj1;
private E obj2;
private Z obj3;
   

    public void print(T user) {
        System.out.println(user);
    }

    

}
