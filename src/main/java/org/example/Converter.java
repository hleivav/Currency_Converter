package org.example;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Converter {
    // Static class that handles the convertion operations.
    static String [] optionsArray = { "Exit", "SEK to USD", "USD to SEK", "SEK to EURO", "EURO to SEK"};

    public static class ConverterHelp {
        static boolean done = false;
        //create currency objects with the three currencies.
        static Currency SEK = new Currency("SEK", "USD", 0.0896, "EUR", 0.0869);
        static Currency USD = new Currency("USD", "SEK", 11.1549, "EUR", 0.9699);
        static Currency EUR = new Currency("EUR", "SEK", 11.501, "USD", 1.031);

        public static void appStart() {
            //initiates a loop that keeps the program running until the user ends it.
            print("Welcome to the currency converter!");
            while (!done){
                menuCreator();
                choiceHandler();
            }
        }

        public static void menuCreator() {
            //creates and print a menu that will be called every time the user needs a new convertion.
            //print("Det ger: " +  makeTheConversion(SEK, "USD", 400));

            print("Choose the number of the operation you need.");
            for (int i = 1; i < optionsArray.length; i++) {
                print( i + ". Convert " + optionsArray[i]);
            }
            print("0. " + optionsArray[0]);
        }

        public static void choiceHandler() {
            //Handle the user choices to convert to the different currencies.

            Scanner scanner = new Scanner(System.in);
            String userChoice = scanner.nextLine();
            if (!userChoice.equals("0")){
                print("Your choice is " + optionsArray[Integer.parseInt(userChoice)]);
                print("What is the amount of " + optionsArray[Integer.parseInt(userChoice)].substring(0, 3) + " to convert?");
                int amountToConvert = Integer.parseInt(scanner.nextLine());
                //double result = 0;
                switch (userChoice){
                    case "1":
                        SEK.makeTheConversion(SEK, "USD", amountToConvert);
                        break;
                    case "2":
                        USD.makeTheConversion(USD, "SEK", amountToConvert);
                        break;
                    case "3":
                        SEK.makeTheConversion(SEK, "EUR", amountToConvert);
                        break;
                    case "4":
                        EUR.makeTheConversion(EUR, "SEK", amountToConvert);
                        break;
                    default:
                        print("invalid choice!");
                        break;
                }
            } else {
                print("thanks by using our program and welcome back!");
                done = true;
            }

        }

        public static void print(String stringToPrint){
            System.out.println(stringToPrint);
        }

    }

}
