/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;



/**
 *
 * @author thoma
 */
public class Chair extends Furniture {
    private boolean hasArmrests;
    private final int ARMREST_UNITS = 250;
    private final int CHAIR_UNITS = 1625;
    private String image = "chair.jpg";
    
    

    public Chair(){
        
    }
    
    

    public Chair( String IdNumber, WoodType typeOfWood, int quantity, boolean hasArmrests) {
        super(IdNumber, typeOfWood, quantity);
        this.hasArmrests = hasArmrests;
        this.calculatePrice();
        
        
    }
    
    public boolean isHasArmrests() {
        return hasArmrests;
    }

    public void setHasArmrests(boolean hasArmrests) {
        this.hasArmrests = hasArmrests;
    }
    
    @Override
    public String toString() {
        
        return super.toString() + "hasArmrests=" + hasArmrests ;

    }
    
    @Override
    public String getImage(){
        return image;
    }

    @Override
    public int calculatePrice() {
        itemPrice = this.typeOfWood.getPrice() * CHAIR_UNITS;
        if(this.hasArmrests){
            itemPrice += ARMREST_UNITS * this.typeOfWood.getPrice();
        }
        itemPrice = itemPrice * quantity;
        return itemPrice;

    }
    
    


}
