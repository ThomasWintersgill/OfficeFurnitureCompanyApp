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
 * @author thoma
 */
public class IdVerifier extends InputVerifier {
    
    

    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        
        if(idNumbers.contains(text)){
            JOptionPane.showMessageDialog(input, "that id number is already in use");
            return false;
        }else{
            idNumbers.add(text);
            System.out.println(idNumbers);
        }
        return true;
        
    }
    
}
