package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price=300;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        price+=80;

    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg){
            price+=70;
        }
        price+=120;
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
    }

    public String getBill(){
        // your code goes here
        if(isVeg) {
            bill += price + " ";
        }

        return this.bill;
    }
}
