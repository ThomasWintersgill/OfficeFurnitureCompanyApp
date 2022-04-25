/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

/**
 *
 * @author thoma
 */
//Price of each base stored as pence.
public enum baseType {
    CHROME(3500), WOODEN(4500);

    private final int price;

    baseType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

}
