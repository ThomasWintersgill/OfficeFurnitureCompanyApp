/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author thoma
 */
public class Basket implements Serializable {
    
    private int totalPrice;
    
    //Stores the furniture items.
    private ArrayList<Furniture> basketItems = new ArrayList<>();
            
    public void basket(){
        
    }
    
    public int getTotalPrice(){
        return totalPrice;
    }
    
    public void addToBasket(Furniture furniture){
        basketItems.add(furniture);
    }
    
    public void removeBasketItem(Furniture furniture){
        basketItems.remove(furniture);
    }
    
    public void emptyBasket(){
        basketItems.clear();
    }
    
    public int calculateTotal(){
        totalPrice = 0;
        for (int i = 0; i < basketItems.size(); i++) {
            Furniture furniture = basketItems.get(i);
            totalPrice += furniture.getItemPrice();
        }
        return totalPrice;
    }
    
   //Outputs all items in basket, sorted in ascending order.
    public void createSummary(){
        Collections.sort(basketItems);
        this.printBasket();

    }
    
    //Current max basket is 9 items as per the specification, can be increased with no other edits.
    public boolean isFull(){
        return basketItems.size() >= 9;
    }
    
    //just for testing purposes, needs deleting before hand in but the create summary will be similar
    public void printBasket(){
        for (int i = 0; i < basketItems.size(); i++) {
            Furniture furniture = basketItems.get(i);
            System.out.println(furniture.toString());
        }
    }
    public boolean isEmpty(){
        return basketItems.isEmpty();
    }
     
    public void saveBasket(File FileName){
        try {
            FileOutputStream fileOut = new FileOutputStream(FileName);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(this);
            out.close();
            fileOut.close();
        } catch (FileNotFoundException e) {
            System.out.println("that is not a valid file name");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    //Takes in a file and attempts to load a basket item from it.
    public Basket loadBasket(File FileName){
        Basket b = null;

        try {
            FileInputStream fileIn = new FileInputStream(FileName);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            b = (Basket) in.readObject();
            
            in.close();
            fileIn.close();
            return b;
        } catch (StreamCorruptedException e) {
            System.out.println("stream was corrupted");
        } catch (FileNotFoundException e) {
            System.out.println("invalid file name");
            //needs to be at end as catch all??
        }  catch (ClassNotFoundException e) {
            System.out.println("sorry that file is not valid");
        } catch (Exception e) {
            System.out.println("caught the final exception");
        } 
        return new Basket();
    }

    public ArrayList<Furniture> getBasketItems() {
        return basketItems;
    }
    
}
