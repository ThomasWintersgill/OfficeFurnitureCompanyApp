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
public abstract class Furniture implements Serializable, Comparable<Furniture> {

    protected String IdNumber;
    protected WoodType typeOfWood;
    //Please note all item prices are calcualted in pence and converted to £ and pence when printed.
    protected int itemPrice;
    protected int quantity;
    protected String image;

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

    public String getImage() {
        return image;
    }

    //Returns the simple class name of a furniture item, used in the objects toString method.
    public String getClassName() {
        Class c = getClass();
        return c.getSimpleName();
    }

    //Please note all calculations are done with intergers(pence) and item price is cast to a float to be printed in £ and pence format.
    @Override
    public String toString() {
        return this.getClassName() + "{" + "IdNumber=" + IdNumber + ", typeOfWood=" + typeOfWood + ", itemPrice= £" + (float) itemPrice / 100 + ", quantity=" + quantity + " ";
    }

    //Compares two furniture items for use with the createSummary() method in the Basket class.
    @Override
    public int compareTo(Furniture other) {
        return itemPrice - other.getItemPrice();

    }

}
