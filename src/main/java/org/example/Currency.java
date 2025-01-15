package org.example;

public class Currency {
    private final String currency1;
    private final double exchangeRate1;
    private final String currency2;
    private final double exchangeRate2;

    //Constructor
    public Currency (String currency1, double exchangeRate1, String currency2, double exchangeRate2){
        this.currency1 = currency1;
        this.exchangeRate1 = exchangeRate1;
        this.currency2 = currency2;
        this.exchangeRate2 = exchangeRate2;
    }
    //Getters
    public String getCurrency1(){return currency1; }
    public double getExchangeRate1(){return exchangeRate1;}
    //public String getCurrency2(){return currency2;}
    public double getExchangeRate2(){return exchangeRate2;}
}
