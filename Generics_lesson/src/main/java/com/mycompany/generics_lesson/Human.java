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
public class Human extends Person{
    private String name;
   private String surname;
   private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", surname=" + surname + ", age=" + age + '}';
    }
   
   
    
   
   
}
