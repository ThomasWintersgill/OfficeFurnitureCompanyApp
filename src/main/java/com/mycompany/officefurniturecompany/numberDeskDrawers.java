/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

/**
 *
 * @author thoma
 */
public enum numberDeskDrawers {
    ONE(1), TWO(2), THREE(3), FOUR(4);

    private final int numberDeskDrawers;

    numberDeskDrawers(int numberDeskDrawers) {
        this.numberDeskDrawers = numberDeskDrawers;
    }

    public int getValue() {
        return numberDeskDrawers;
    }

}
