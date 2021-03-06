/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

/**
 *
 * @author thoma
 */
public class Table extends Furniture {

    private baseType baseType;
    private int diameter;
    private String image = "table.jpg";

    public Table(String IdNumber, WoodType typeOfWood, int quantity, baseType baseType, int diameter) {
        super(IdNumber, typeOfWood, quantity);
        this.baseType = baseType;
        this.diameter = diameter;
        //Price is calculated upon creation of product.
        this.calculatePrice();
    }

    public baseType getBaseType() {
        return baseType;
    }

    public void setBaseType(baseType baseType) {
        this.baseType = baseType;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return super.toString() + "baseType=" + baseType + ", diameter=" + diameter + '}';
    }

    @Override
    public int calculatePrice() {
        int numberOfUnits = this.diameter * this.diameter;
        itemPrice = (numberOfUnits * typeOfWood.getPrice()) + baseType.getPrice();
        this.itemPrice = itemPrice * quantity;

        return itemPrice;

    }

}
