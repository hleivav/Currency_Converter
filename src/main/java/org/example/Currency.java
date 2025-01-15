package org.example;

public class Currency {
    private final String name;
    private final double currency;

    //Constructor
    public Currency (String name, double currency){
        this.name = name;
        this.currency = currency;
    }
    //Getters
    public String getName(){return name; }

    public double getCurrency() { return currency;}
}
