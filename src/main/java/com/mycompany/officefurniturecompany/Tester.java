/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.officefurniturecompany;

/**
 *
 * @author thoma
 */
public class Tester {
    public static void main(String[] args) {
        
        //Create the two new chair objects.
        Chair chair = new Chair("0001", WoodType.OAK, 1, true);
        Chair chair_two = new Chair("0002", WoodType.WALNUT, 2, false);
        
        //Print out the prices of the two chairs.
        System.out.println(chair.toString());
        System.out.println("£"+(float)chair.getItemPrice()/100);
        
        System.out.println(chair_two.toString());
        System.out.println("£"+(float)chair_two.getItemPrice()/100);
        
        
        
        //Create the two new table objects.
        Table table = new Table("0003", WoodType.OAK, 1, baseType.CHROME, 60);
        Table table_two = new Table("0004", WoodType.WALNUT, 2, baseType.WOODEN, 100);
        
        //Print out the prices of the two tables.
        System.out.println();
        
        System.out.println(table.toString());
        System.out.println("£"+(float)table.getItemPrice()/100);
        
        System.out.println(table_two.toString());
        System.out.println("£"+(float)table_two.getItemPrice()/100);
        
        //Create the two new desk objects.
        Desk desk = new Desk("0005", WoodType.OAK, 1, 60, 60, 3);
        Desk desk_two = new Desk("0006", WoodType.WALNUT, 2, 70, 60, 0);
        
        System.out.println();
        
        System.out.println(desk.toString());
        System.out.println("£"+(float)desk.getItemPrice()/100);
        
        System.out.println(desk_two.toString());
        System.out.println("£"+(float)desk_two.getItemPrice()/100);
 
           
    }
    
}
