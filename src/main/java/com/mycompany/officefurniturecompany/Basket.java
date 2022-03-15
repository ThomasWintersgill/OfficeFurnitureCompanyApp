/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author thoma
 */
public class Basket implements Serializable {
    
    private int totalPrice;
    private ArrayList<Furniture> Basket = new ArrayList<>();
            
    public void basket(){
        
    }        
    
    public void addToBasket(Furniture furniture){
        Basket.add(furniture);
   
    }
    
    public void removeBasketItem(Furniture furniture){
        Basket.remove(furniture);
        
    }
    
    public void emptyBasket(){
        Basket.clear();
    }
    
    public int calculateTotal(){
        for(int i =0; i < Basket.size(); i++){
            Furniture furniture = Basket.get(i);
            totalPrice += furniture.getItemPrice();
        }
        return totalPrice;
    }
    
    public void createSummary(){
        
    }
    
    //just for testing purposes, but the create summary will be similar
    public void printBasket(){
         for(int i =0; i < Basket.size(); i++){
             Furniture furniture = Basket.get(i);
             System.out.println(furniture.toString());
         }   
    }
    
    public void saveBasket(){
        
    }
    
    public void loadBAsket(){
        
    }
}
