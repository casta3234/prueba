/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
//import java.util.Stack;

/**
 *
 * @author USUARIO
 */
public class InversoArray {

//    public static Stack inversa (int[] a){
//        Stack in = new Stack();
//        for (int i = 0; i<a.length;i++){
//            in.add(a[i]);
//        }
//        return in;
//    }
    public static void printInversa (int[] a){
        for(int i = 1; i <= a.length; i++){
            System.out.println(a[a.length - i]);
        }
    }
    public static void main(String[] args) {
        int [] a;
        Scanner s = new Scanner(System.in);
        a = new int [s.nextInt()];
        for(int i = 0; i < a.length; i++){
            a[i] = s.nextInt();
        }
//        Stack in = inversa(a);
//        System.out.println("inverso 1");
//        for(int i = 0; i < a.length; i ++){
//            System.out.println(in.pop());            
//        }
//        System.out.println("inverso 2");
        printInversa(a);      
    }
    
}
