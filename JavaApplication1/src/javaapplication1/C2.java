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
public class C2 {
    public static void main(String[] asd) {
        C2 as = new C2();
        as.plus1to100(2);
    }
    //1! + ....10!
    //0-n ji
    public void plus1to100(int n) {
        
        int total = 0;
        for (int a = 0; a <= n; a++){
            if (a%2 ==1) {
                total += a;
                //total = total +  a;
            }
        }
            System.out.println(total);
    }
}

