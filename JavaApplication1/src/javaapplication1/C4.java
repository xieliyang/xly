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
public class C4 {
    
    public static void main(String[] fgh){
        C4 as = new C4();
        int c = as.plus(4, 3);
        int d = as.jian(9, 7);
        int e = as.cheng(7, 5);
        int f = as.chu(27, 3);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
    
    public int plus(int a, int b){
        return (a + b);
    }
    public int jian(int a, int b){
        return (a - b);
    }
    public int cheng(int a, int b){
        return (a * b);
    }
    public int chu(int a, int b){
        return (a / b);
    }

}
