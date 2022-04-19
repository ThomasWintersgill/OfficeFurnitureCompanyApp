/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

import java.io.Serializable;


/**
 *
 * @author thoma
 */
public abstract class Furniture implements Serializable, Comparable<Furniture>{
    protected String IdNumber;
    protected WoodType typeOfWood;
    protected int itemPrice;
    protected int quantity;
    protected String image;
    
    public Furniture(){
        
    }

    public Furniture(String IdNumber, WoodType typeOfWood, int quantity) {
        this.IdNumber = IdNumber;
        this.typeOfWood = typeOfWood;
        this.quantity = quantity;
        
    }
   
    
    public abstract int calculatePrice();

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String IdNumber) {
        this.IdNumber = IdNumber;
    }

    public WoodType getTypeOfWood() {
        return typeOfWood;
    }

    public void setTypeOfWood(WoodType typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public String getImage(){
        return image;
    }
    
    public String getClassName(){
        Class c = getClass();
        return c.getSimpleName();
    }
 
    @Override
    public String toString() {
        return "Furniture{" + "IdNumber=" + IdNumber + ", typeOfWood=" + typeOfWood + ", itemPrice=" + itemPrice + ", quantity=" + quantity + ", image=" + image + " ,";
    }

    @Override
    public int compareTo(Furniture other) {
        return itemPrice - other.getItemPrice();
        
    }
    

    
        
        
    }
    
 

