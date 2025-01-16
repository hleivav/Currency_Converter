package org.example;
import java.util.Scanner;

public class Converter {
    // Static class that handles the convertion operations.
    static String [] optionsArray = { "Exit", "SEK to USD", "USD to SEK", "SEK to EURO", "EURO to SEK"};
    static Scanner scanner = new Scanner(System.in);
    // ANSI escape-codes for colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static class ConverterHelp {
        static boolean done = false;
        //create currency objects with the three currencies.
        static Currency SEK = new Currency("SEK", "USD", 0.0896, "EUR", 0.0869);
        static Currency USD = new Currency("USD", "SEK", 11.1549, "EUR", 0.9699);
        static Currency EUR = new Currency("EUR", "SEK", 11.501, "USD", 1.031);

        public static void appStart() {
            //initiates a loop that keeps the program running until the user ends it.
            print(ANSI_GREEN + "Welcome to the currency converter!" + ANSI_RESET);
            while (!done){
                menuCreator();
                choiceHandler();
            }
        }

        public static void menuCreator() {
            //creates and print a menu that will be called every time the user needs a new convertion.

            print(ANSI_YELLOW + "Choose the number of the operation you need." + ANSI_RESET);
            for (int i = 1; i < optionsArray.length; i++) {
                print(ANSI_CYAN + i + ". Convert " + optionsArray[i]);
            }
            print("0. " + optionsArray[0] + ANSI_RESET);
        }

        public static void choiceHandler() {
            //Handle the user choices to convert to the different currencies.
            String userChoice = "";
            boolean checkInput = false;
            while (!checkInput){
                userChoice = scanner.nextLine();
                checkInput = checkIfValidInput(userChoice);
                if (checkInput && Integer.parseInt(userChoice) > 4) {
                    checkInput = false;
                    print(ANSI_RED + "Chose one of the values from the menu" + ANSI_RESET);
                }
            }

            if (!userChoice.equals("0")){
                print("Your choice is " + optionsArray[Integer.parseInt(userChoice)]);
                print("What is the amount of " + optionsArray[Integer.parseInt(userChoice)].substring(0, 3) + " to convert?");
                int amountToConvert = 0;
                checkInput = false;
                while (!checkInput){
                   String  userInput = (scanner.nextLine());
                   if (!userInput.isEmpty()){
                       checkInput = true;
                       amountToConvert = Integer.parseInt(userInput);
                   } else {
                       print(ANSI_RED + "You must enter an amount!");
                       print(ANSI_RESET);
                   }
                }

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
                        break;
                }
            } else {
                print("thanks by using our program and welcome back!");
                done = true;
            }

        }

        public static boolean checkIfValidInput(String userInput){ //check if the int isn't empty and is a numeric value
            boolean isInputCorrect = false;
            try {
                if (userInput.trim().isEmpty()){
                    throw new IllegalArgumentException(ANSI_RED + "The input can not be empty. Try again." + ANSI_RESET);
                }
                int intUserInput = Integer.parseInt(userInput);
                isInputCorrect = true;
            } catch (NumberFormatException e) {
                print(ANSI_RED + "You must enter a number. Try again. " + ANSI_RESET);
            } catch (IllegalArgumentException e) {
                print(e.getMessage());
            }

            return isInputCorrect;
        }

        public static void print(String stringToPrint){
            System.out.println(stringToPrint);
        }

    }

}
