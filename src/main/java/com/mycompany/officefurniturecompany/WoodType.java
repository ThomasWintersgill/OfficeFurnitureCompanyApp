/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

/**
 *
 * @author thoma
 */
//stores price of each woodtype in pence per unit.
public enum WoodType {
    WALNUT(3), OAK(4);

    private final int price;

    WoodType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;

    }

    //needs get price method,, this way can call, the get price method, if changes ever needed to be made would just be made within the enum class
    //also wouldnt need the if statments in the calculate prices just go this.typeOfWodd.getValuie
}
