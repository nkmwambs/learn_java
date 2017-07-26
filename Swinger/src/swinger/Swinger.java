/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swinger;

/**
 *
 * @author NKarisa
 */
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JPasswordField;
//import javax.swing.JTextField;

public class Swinger {

    /**
     * @param args the command line arguments
     */
    Swinger(){
         // TODO code application logic here
         // Creating instance of JFrame
        JFrame frame = new JFrame("My First Swing Example");
        // Setting the width and height of frame
        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* Creating panel. This is same as a div tag in HTML
         * We can create several panels and add them to specific 
         * positions in a JFrame. Inside panels we can add text 
         * fields, buttons and other components.
         */
        JPanel panel = new JPanel();    
        // adding panel to frame
        frame.add(panel);
        /* calling user defined method for adding components
         * to the panel.
         */
        placeComponents(panel);

        // Setting the frame visibility to true
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {

        /* We will discuss about layouts in the later sections
         * of this tutorial. For now we are setting the layout 
         * to null
         */
        panel.setLayout(null);

        // Creating JLabel
        JLabel userLabel = new JLabel("User");
        /* This method specifies the location and size
         * of component. setBounds(x, y, width, height)
         * here (x,y) are cordinates from the top left 
         * corner and remaining two arguments are the width
         * and height of the component.
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* Creating text field where user is supposed to
         * enter user name.
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // Same process for password label and text field.
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /*This is similar to text field but it hides the user
         * entered data and displays dots instead to protect
         * the password like we normally see on login screens.
         */
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        // Creating login button
        JButton loginButton = new JButton();
        
        //Add and Resize Image
        //ImageIcon largeImage = new ImageIcon("C:/Users/NKarisa/Documents/NetBeansProjects/Swinger/src/swinger/register.jpg");
        Image image = new ImageIcon("C:/Users/NKarisa/Documents/NetBeansProjects/Swinger/src/swinger/register.jpg").getImage().getScaledInstance(80, 30, java.awt.Image.SCALE_DEFAULT);
        //Image newImage = image.getScaledInstance(80, 30, java.awt.Image.SCALE_DEFAULT);
        ImageIcon imageIcon = new ImageIcon(image);
        
        loginButton.setIcon(imageIcon);
        
        ActionListener actionListener = new ActionListener(){
            public void actionPerformed(ActionEvent e){
                userText.setText("Hello World");
            }
        };
        
        loginButton.addActionListener(actionListener);
                
        loginButton.setBounds(120, 90, 80, 25);

        panel.add(loginButton);
    }
    public static void main(String[] args) {
        new Swinger();
    }
    
}
