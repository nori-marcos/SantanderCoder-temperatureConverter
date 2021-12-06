package com.letscode.utils;

import java.util.Scanner;

public class Reader {

    private static Scanner scanTemperature;
    public static String scanTemperatureInCelsius(){

        scanTemperature = new Scanner(System.in);
        Printer.printRequestTemperatureInCelsius();
        String temperatureInCelsius = scanTemperature.nextLine();

        return temperatureInCelsius;
    }
}
