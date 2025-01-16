package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Currency {
    private final String name;
    private final String currency1;
    private final double exchangeRate1;
    private final String currency2;
    private final double exchangeRate2;

    //Constructor
    public Currency (String name, String currency1, double exchangeRate1, String currency2, double exchangeRate2){
        this.name = name;
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

    public void makeTheConversion(Currency currency, String convertTo, int amount) {
        //take an object to convert, a String to find and an amount.

        double result = 0;
        if ( convertTo.equalsIgnoreCase(currency.getCurrency1())){
            result = amount * currency.getExchangeRate1();
        }else {
            result = amount * currency.getExchangeRate2();
        }
        BigDecimal bd = new BigDecimal(result);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        Converter.ConverterHelp.print(amount + " " + this.name +  " is " + bd.doubleValue() + " in " + convertTo);
    }


}
