package org.example;

public class Converter {
    // Static class that handles the convertion operations.

    public static class ConverterHelp {
        static boolean done = false;
        //create currency objects with the three currencies.
        static Currency SEK = new Currency("USD", 0.0896, "EUR", 0.0869);
        static Currency USD = new Currency("SEK", 11.1549, "EUR", 0.9699);
        static Currency EUR = new Currency("SEK", 11.501, "USD", 1.031);

        public static void appStart() {
            //initiates a loop that keeps the program running until the user ends it.
            print("Welcome to the currency converter!");
            while (done){
                menuCreator();
                choiceHandler();

            }
        }

        public static void menuCreator() {
            //creates and print a menu that will be called every time the user needs a new convertion.

        }

        public static void choiceHandler() {
            //Handle the user choices to convert to the different currencies.
        }

        public static double makeTheConversion(Currency currency, String convertTo, int amount) {
            double result = 0;
            if ( convertTo.equalsIgnoreCase(currency.getCurrency1())){
                result = amount * currency.getExchangeRate1();
            }else {
                result = amount * currency.getExchangeRate2();
            }
            return result;
        }

        public static void print(String stringToPrint){
            System.out.println(stringToPrint);
        }

    }

}
