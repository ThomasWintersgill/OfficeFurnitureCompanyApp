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
public class diameterVerfifier extends InputVerifier{

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        try{
            Integer.parseInt(text);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(input, "diameter must be a number");
            return false;
        }
        return true;
    }
    
}
