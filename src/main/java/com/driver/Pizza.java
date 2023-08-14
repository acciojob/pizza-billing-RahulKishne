package com.driver;

public class Pizza {


    private int price;

    int baseprice;
    int extraCheeseAdded;
    int extraToppingAdded;
    int addTakeAway;
    private Boolean isVeg;
    private String bill;

    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isTakeAwayAdded;

    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.extraCheeseAdded=80;
        this.addTakeAway=20;
        this.isCheeseAdded=false;
        this.isToppingAdded=false;
        this.isTakeAwayAdded=false;
        this.isBillGenerated=false;
        if(this.isVeg==true){
            this.baseprice=300;
            this.extraToppingAdded=70;
        }
        else{
            this.baseprice=400;
            this.extraToppingAdded=120;
        }

        this.price=this.baseprice;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.extraCheeseAdded;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false){
            this.price=this.price+this.extraToppingAdded;
            isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.addTakeAway;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
       if(isBillGenerated==false){
           this.bill="Base Price Of The Pizza: "+this.baseprice +"\n";
           if(isCheeseAdded==true){
               this.bill=this.bill+"Extra Cheese Added: "+this.extraCheeseAdded+"\n";
           }
           if(isToppingAdded==true){
               this.bill=this.bill+"Extra Toppings Added: "+this.extraToppingAdded+"\n";
           }
           if(isTakeAwayAdded==true){
               this.bill=this.bill+"Paperbag Added: "+this.addTakeAway+"\n";
           }
           this.bill=this.bill+"Total Price: "+this.price+"\n";

           this.isBillGenerated=true;
       }

        return this.bill;
    }
}
