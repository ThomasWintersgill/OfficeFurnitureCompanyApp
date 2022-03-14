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
public abstract class Furniture implements Serializable{
    protected int IdNumber;
    protected WoodType typeOfWood;
    protected int itemPrice;
    protected int quantity;
    protected String image;

    public Furniture(int IdNumber, WoodType typeOfWood, int quantity, String image) {
        this.IdNumber = IdNumber;
        this.typeOfWood = typeOfWood;
        this.quantity = quantity;
        this.image = image;
    }
    

    protected void calculateNoUnits(){
        
    }
    
    protected void calculateprice(){
        
    }

    public int getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(int IdNumber) {
        this.IdNumber = IdNumber;
    }

    public WoodType getTypeOfWood() {
        return typeOfWood;
    }

    public void setTypeOfWood(WoodType typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    public double getItemPrice() {
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Furniture{" + "IdNumber=" + IdNumber + ", typeOfWood=" + typeOfWood + ", itemPrice=" + itemPrice + ", quantity=" + quantity + ", image=" + image + " ,";
    }
    
    
    
    
}
