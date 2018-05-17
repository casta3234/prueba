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
    public static int minimo(Integer[]a){       
        int m = a[0];       
        for (int u = 1;u < a.length;u++){
            if (m > a[u]){
                m = a[u];                
            }            
        }        
        return m;
    }
        
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int a;
        for(int i = 0; i < t;i++){ 
            int n = s.nextInt();
            int k = s.nextInt();
            a = s.nextInt();
            for (int o = 1;o < n; o++){
                int ai = s.nextInt();
                if (a > ai){
                    a = ai;
                }
            }
            if (k - a<0){
                System.out.println(0);
            }
            else{
            System.out.println(k-a);        
            }
        }        
    }
}
