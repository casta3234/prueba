/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class MicroAndArrayUpdate {
    public static int minimo(int[]a){
        int m = a[0];
        for (int i = 1;i < a.length;i++){
            if (m > a[i]){
                m = a[i];
            }
        }
        return m;
    }
    
    public static void update (int[] a,int k){
        System.out.println(k - minimo(a));
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(int i = 0; i < t;i++){ 
            int[] a = new int[s.nextInt()];
            int k = s.nextInt();
            for (int o = 0;o < a.length; o++){
                a[i] = s.nextInt();
            }
            update(a, k);            
        }
        
    }
}
