/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

/**
 *
 * @author thoma
 */
public class Desk extends Furniture {

    private final int HEIGHT = 80;
    private int width;
    private int depth;
    private int numberOfDrawers;
    private String image = "desk.jpg";

    public Desk(String IdNumber, WoodType typeOfWood, int quantity, int width, int depth, int numberOfDrawers) {
        super(IdNumber, typeOfWood, quantity);

        this.width = width;
        this.depth = depth;
        this.numberOfDrawers = numberOfDrawers;
        this.calculatePrice();
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

    public void getHEIGHT() {

    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public void setNumberOfDrawers(int numberOfDrawers) {
        this.numberOfDrawers = numberOfDrawers;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return super.toString() + "HEIGHT=" + HEIGHT + ", width=" + width + ", depth=" + depth + ", numberOfDrawers=" + numberOfDrawers + '}';
    }

    @Override
    public int calculatePrice() {
        itemPrice = ((HEIGHT + width + depth) * 12) + (depth * width) * typeOfWood.getPrice() + (numberOfDrawers * 850);
        itemPrice = itemPrice * quantity;
        return itemPrice;

    }

}
