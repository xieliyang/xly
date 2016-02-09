/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JButton;


/**
 *
 * @author Administrator
 */
public class C2 {
    
    public String[] sd = new String[]{"0","1","2","3","4","5","6","7","8","9","+","-","*","/","C"};
    
    public static void main(String[] str){
        C2 c2= new C2();
//        JFrame f = new JFrame("GridLayout");
//        f.setLayout(new GridLayout(3 , 5 , 5, 5));
//        for(int i = 0; i < c2.sd.length ;i++){
//            JButton jbt = new JButton(c2.sd[i]);
//            f.add(jbt);
//        }
//        f.pack();
//        f.setVisible(true);
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c2.getPrimeNumberCount(2, 10000000);
    }
    
    public void abc(){
        for (int i = 0; i < sd.length; i++ ){
            System.out.println(sd[i]);
        }
    }
    
    public void getPrimeNumberCount(int start, int end){
        int total = 0;
        long time1 = System.currentTimeMillis();
        for(int i = start; i < end; i++){
            if(isPrimeNumber(i)){
                total++;
            }
        }
        long time2 = System.currentTimeMillis();
        System.out.println(total + " cost time = " + (time2 - time1));
    }
    
    public boolean isPrimeNumber(int x){
        if(x%2 == 0 || x%3 == 0 ){
            return false;
        }
        double x1 = Math.sqrt(x);
        for(int i = 3; i <= x1; i+=2){
            if(x % i == 0){
                return false;
            }
        }
        //System.out.println(x);
        return true;
    }
            
}