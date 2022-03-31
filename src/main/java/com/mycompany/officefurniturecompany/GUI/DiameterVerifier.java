/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany.GUI;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author thomaswintersgill
 */
public class DiameterVerifier extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        try{
            int number = Integer.parseInt(text);
            if(number < 50 || number > 300){
                JOptionPane.showMessageDialog(input, "Diameter must be atleast 50CM and no greater than 300CM");
                return false;     
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(input, "Diameter field must be a number");
            return false;
        }
        return true;
    }
    
}

