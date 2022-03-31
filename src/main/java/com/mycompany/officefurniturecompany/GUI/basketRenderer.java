/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany.GUI;

import com.mycompany.officefurniturecompany.Furniture;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author thoma
 */
public class basketRenderer extends DefaultListCellRenderer implements ListCellRenderer<Object> {

    
    //maybe this needs adjusting to render the basket as opposed to furniture items??
    @Override
    public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        
        Furniture furniture = (Furniture) value;
        
        
        
        ImageIcon icon = new ImageIcon(furniture.getImage());
        
        
        //setText(furniture.getIdNumber());
        setIcon(icon);
        
        
        //setIcon(icon);
        
        
        if(isSelected){
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        }else{
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setEnabled(true);
        setFont(list.getFont());
        
        return this;
        

    
    }
    
}