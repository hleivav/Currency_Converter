package org.example;

public class Main {
    public static void main(String[] args) {
        //Creates a new converter object and points to the static class ConverterHelp and its method "appStart" to start the App.
       Converter converter = new Converter();
       Converter.ConverterHelp.appStart();
    }

}