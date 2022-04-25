/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

/**
 *
 * @author thoma
 */
//Price of each wood stored as pence.
public enum WoodType {
    WALNUT(3), OAK(4);

    private final int price;

    WoodType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;

    }

}
