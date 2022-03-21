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
        
//        Chair chair = new Chair (true, 1, WoodType.OAK, 1 , "str");
//        System.out.println(chair.toString());
//        System.out.println(chair.calculatePrice());
//        System.out.println(chair.getQuantity());

          

        
        //what is the id number used for? is it one id number for a category? eg all chairs have the same id number? why does the user have to input this,
        
        //or is it a unique id number that is created when the object is created?
        
        //2. when the user inputs quantity this will create on instance of that object with X number of quantity as an attribute?
        
        //do i create an instance and then set the attributes or have them inside the constructor?
        
        //confused about the desk? the ica says the formulae is to calc the item price and not the total number of units?
                
//        
//       Desk desk = new Desk(150, 75, numberDeskDrawers.FOUR, 1, WoodType.WALNUT, 1, "str");
//       
//       System.out.println(desk.calculatePrice());
//       System.out.println(desk.toString());
//       

    
         Table table = new Table(baseType.CHROME, 50, 5000, WoodType.OAK, 1, "str");
         Table tableTwo = new Table(baseType.CHROME, 50, 5000, WoodType.OAK, 2, "str");
         Table tableThree = new Table(baseType.CHROME, 50, 5000, WoodType.OAK, 3, "str");
         Table tableFour = new Table(baseType.CHROME, 50, 5000, WoodType.WALNUT, 4, "str");
         System.out.println(table.calculatePrice());
         System.out.println(tableTwo.calculatePrice());
         System.out.println(tableThree.calculatePrice());
         System.out.println(tableFour.calculatePrice());
         
         
         Basket basket = new Basket();
         basket.addToBasket(table);
         
         
         basket.addToBasket(tableFour);
         basket.addToBasket(tableTwo);
         basket.addToBasket(tableThree);
         //basket.saveBasket("basket.dat");
         // create a second basket object from the file
         //Basket basketTwo = basket.loadBAsket("basket.dat");
         
         
         basket.printBasket();
         basket.createSummary();
         
         //basketTwo.printBasket();
         //int total = basket.calculateTotal();
         //System.out.println("the total price of the basket is "+ total);
         
//         basket.addToBasket(table);
//         basket.printBasket();
//         basket.removeBasketItem(table);
//         basket.printBasket();
                 

           
    }
    
}
