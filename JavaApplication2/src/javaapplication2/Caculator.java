/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import javax.swing.JWindow;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

/**
 *
 * @author Administrator
 */
public class Caculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        
//      JFrame frame = new JFrame();
//
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    
//        JPanel panel = new JPanel();
//        JButton button = new JButton("123");
//        panel.add(button);
//                frame.setSize(200, 400);
//                    frame.setLocation(300, 200);
//        frame.setVisible(true);
//        frame.add(panel);
        Caculator ca = new Caculator();
        int[] a;
        ca.out(new String[]{"frhfh","7788","444S","123"});
    }
    public void out(String[] s) {
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
        for(String s1:s) {
            System.out.println(s1);
        }
    }
   
}
