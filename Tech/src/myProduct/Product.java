/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myProduct;

/**
 *
 * @author NKarisa
 */
public class Product{
     
    public void A(){
        System.out.println("Number One");
    }
    
    public void B(){
        this.A();
        
        System.out.println("Number Two");
    }
    
}

