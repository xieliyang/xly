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
public class Caculator {
    
    public static void main(String[] asd){
        Caculator ca = new Caculator();
        Caculator cg = new Caculator();
        int a = ca.plus(2, 9);
        String a1 = "ffff4566", b1 = "4575gjy";
        System.out.println("a = " + ca.jianFa(a1 , b1));
    }
    
   public int plus(int a, int b){
       
      for(int x = 0; x < 21; x = x+1) {
         System.out.print("value of x : " + x );
         System.out.print("\n");
      }
       return (a + b);
   } 
   
   
   public int jianFa(int a, int b){
        return (a - b);
   }
   
   public int jianFa(String a, String b){
       System.out.println(a + b);
        return 0;
   }
   public int chen(int a, int b){
       return (a * b);
   } 
   
   public int chu(int a, int b){
        return (a / b);
   }
   
   public float chu(float a, float b){
        return (a / b);
   }
}

