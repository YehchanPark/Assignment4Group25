/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.CashRegisterProject;

/**
 *
 * @author yehch
 */
public class productDB {//Product database class
    //List of products
    Product apple = new Product("012345678905","Apple",1.00);
    Product grapes = new Product("112345678905","Grapes",1.25);
    Product pear = new Product("212345678905","Pear",1.10);
    Product watermelon = new Product("312345678905","Watermelon",2.00);
    Product lemon = new Product("412345678905","Lemon",1.50);
    Product[] productList = {apple,grapes,pear,watermelon,lemon};//actual list of products


    public Product GetProductInfo(long UPCCode){ //Uses the given upc code to find a products information
        for (Product productList1 : productList) {
            //Checks for each element of the array
            if (productList1.getUPCCODE() == UPCCode) {
                //If the given upccode matches the product's upc code
                return productList1; //Return that product
            }
        }
       return null;//If it is unable to find the product, it will return a null
    }

   }