/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

/**
 *
 * @author thoma
 */
public class Desk extends Furniture  {
    private final int HEIGHT = 80;
    private int width;
    private int depth;
    private numberDeskDrawers numberOfDrawers;

    public Desk(int width, int depth, numberDeskDrawers numberOfDrawers, String IdNumber, WoodType typeOfWood, int quantity) {
        super(IdNumber, typeOfWood, quantity);
        
        this.width = width;
        this.depth = depth;
        this.numberOfDrawers = numberOfDrawers;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    public void getHEIGHT(){
        
    }

    public numberDeskDrawers getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public void setNumberOfDrawers(numberDeskDrawers numberOfDrawers) {
        this.numberOfDrawers = numberOfDrawers;
    }
    
    public int calculateNoOfUnits(){
        
        
        return 0;
    }
    
   
    @Override
    public String toString() {
        return super.toString() +  "HEIGHT=" + HEIGHT + ", width=" + width + ", depth=" + depth + ", numberOfDrawers=" + numberOfDrawers + '}';
    }

    @Override
    public int calculatePrice() {
        itemPrice = ((HEIGHT + width + depth) * 12) + (depth * width) * typeOfWood.getPrice() + (numberOfDrawers.getValue() * 850);
        
        return itemPrice;
        
    }
    
    
    
    
}
