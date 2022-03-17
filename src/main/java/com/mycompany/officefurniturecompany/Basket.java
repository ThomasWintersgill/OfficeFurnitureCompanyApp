/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    
    public void saveBasket(String FileName){
        try{
            FileOutputStream fileOut = new FileOutputStream(FileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            
            out.writeObject(this);
            out.close();
            fileOut.close();  
        }catch(FileNotFoundException e){
            System.out.println("that is not a valid file name");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public Basket loadBAsket(String FileName){
        Basket b = null;
        
        try{
            FileInputStream fileIn = new FileInputStream(FileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            b = (Basket)in.readObject();
            in.close();
            fileIn.close();
        }catch(FileNotFoundException e){
            System.out.println("invalid file name");
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        return b;
    }
}
