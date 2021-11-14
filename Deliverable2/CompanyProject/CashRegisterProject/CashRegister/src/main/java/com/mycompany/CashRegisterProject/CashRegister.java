/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CashRegisterProject;

/**
 *
 * @author yehch
 */
public class CashRegister {
    productDB db = new productDB();//Sets up correct variables
    //Display display = new Display();
    //TicketPrinter ticketPrinter = new TicketPrinter();
    Product currentProduct;

    public Product setCurrentProductUPC(long UPCCode){//Sets the current product to be at the given upc code
        if(db.GetProductInfo(UPCCode)!=null){//As long as it's not null
            currentProduct=db.GetProductInfo(UPCCode);
            return currentProduct;
        }
        else {
            //display.displayText("Invalid UPCCODE");//If it is null, it will not work
            return null;
        }
    }

//    public void getCurrentProductInfo(){//Gets the info from the product object and puts it into a string array
//        String[] list= new String[2];//Creates string array
//        list[0]= currentProduct.getName();//Assigns the values
//        list[1]= String.valueOf(currentProduct.getPrice());
//        //display.displayText(currentProduct.getName()+" "+currentProduct.getPrice());//outputs the info
//        //ticketPrinter.displayText(list);//sends the info to ticket printer
//    }

}
