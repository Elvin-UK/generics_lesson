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
public class Main {

    public static void main(String[] args) {

        Wrapper<Human,Person,User>w=new Wrapper<>();
        accept(w);
        
        
    }
        public static void accept(Wrapper<?,Person,User> wrapper){
            
        }
    }
//        Wrapper<Human> wrapper = new Wrapper<>();
////        wrapper.print(new Teacher("asasji", "asdauhysa", 65485125));
////        CustomWrapper cw = new CustomWrapper();
////        User u = cw.printAsIWant(new User("elvin", "salam", 0));
//        acceptWrapper(wrapper);
//        acceptWrapper2(wrapper);
//    }
//
//    public static void acceptWrapper(Wrapper<? extends Person> wrapper) {
//        //bura ele bir tip gelmelidirki o tip persondan extends etsin  upperbound
//    }
//
//    public static void acceptWrapper2(Wrapper<? super Teacher> wrapper) {
//        //bura ise ele bir tip gelmelidir ki,teacher o clasdan extends etsin  lower bound
//    }
//}

/*1.generic nece elan olunur nece istifade olunur class seviyyesinde
*      2.  diamond operator java 1.7 den sonra gelib,obyektin sol terefinde yazilirsa classin adi sagda sadece diamond qoymagimiz bes eder
     3.sadece humanlara xidmet eden generic classlar nece yaranir,,classin yaninda evvelceden teyin etdiyimiz generice extends edirik meselen human classini 
        bundan sonra obyekti cagiranda ancag extends olmuslari cagira bileceyik,
        4.genericin metodlarda birbasa istifadesi
      5.generic bize compile time type safety verir
      
      6.wildcard ? lower bound -->(  ?   super Human)upper bound-->(  ?   extends Human)
      7.type erasuer  and Rraw type?--->tipin silinmesi--->>decompiler zamani tipin silinmesi
 *     8.unbound(?)---> yeni serhedsiz,,,,yeniki ne istesen gonder 
       9.Bir neche tipin istifade olunmasi

 */
