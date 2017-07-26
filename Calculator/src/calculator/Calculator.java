/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author NKarisa
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator{

    /**
     * @param args the command line arguments
     */
    JTextField num1,num2;
    JButton plus,minus;
    JFrame frame;
    JPanel panel;
    
    Calculator(){
        //Create a frame
        frame = new JFrame("Simple Calculator");        
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Create a Panel
        panel = new JPanel();
        frame.add(panel);
        
        placePanelComponents(panel);
        
        frame.setVisible(true);
    }
    
    void placePanelComponents(JPanel panel){
        num1 = new JTextField(20);
        num1.setBounds(10, 10, 50, 10);
        panel.add(num1);
        
        num2 = new JTextField(20);
        num2.setBounds(10, 20, 50, 10);
        panel.add(num2);   
        
        plus = new JButton("+");
        plus.setBounds(10, 50, 60, 10);
        panel.add(plus);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        new Calculator();
    }
    
}
