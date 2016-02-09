/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Administrator
 */
public class C5 {
    
    public static void main(String[] asd){
        C5 as = new C5();
        as.plus(100);
    }
    public void plus(int n){
        int total =0;
        for (int a = 0; a <= 100 ;a++){
            if (a%2 ==1) {
                total += a;
            }
        }
        System.out.println(total);
    }
    
}
