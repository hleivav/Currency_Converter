package org.example;

public class Converter {
    // Static class that handles the convertion operations.
    public static class ConverterHelp {

        public static void appStart() {
            //initiates a loop who keeps the program running until the user ends it.
        }

        public static void menuCreator() {
            //creates and print a menu that will be called every time the user needs a new convertion.

        }

        public static void choiceHandler() {
            //Handle the user choices to convert to the different currencies.
        }

        public static double makeTheConversion(String currency, double currencyValue, int amount) {
            return currencyValue * amount;
        }

        public static void print(String stringToPrint){
            System.out.println(stringToPrint);
        }

    }

}
