package org.example;

public class Currency {
    private String currency1;
    private double exchangeRate1;
    private String currency2;
    private double exchangeRate2;

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
    public String getCurrency2(){return currency2;}
    public double getExchangeRate2(){return exchangeRate2;}
    //Setters won't be used
    /*public void setCurrency1(String currency){this.currency1 = currency;}
    public void setExchangeRate1(double exchangeRate){this.exchangeRate1 = exchangeRate;}
    public void setCurrency2(String currency){this.currency2 = currency;}
    public void setExchangeRate2(double exchangeRate){this.exchangeRate2 = exchangeRate;}*/
}
