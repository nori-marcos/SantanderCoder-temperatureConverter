package com.letscode.converter;

public class Main {
    public static void main (String[] args){
        float temperatureInCelsius = 23;

        final float temperatureInFahrenheit = (temperatureInCelsius * 1.8f) + 32;
        final float temperatureInKelvin = temperatureInCelsius + 273.15f;
        final float temperatureInRéaumur = temperatureInCelsius * 0.8f;
        final float temperatureInRankine = (temperatureInCelsius * 1.8f) + 491;

        System.out.printf("%.2f Celsius is equivalent to: %n" +
                "%.2f Fahrenheit,%n" +
                "%.2f Kelvin, %n" +
                "%.2f Réaumur, and %n" +
                "%.2f Rankine",
                temperatureInCelsius,
                temperatureInKelvin,
                temperatureInFahrenheit,
                temperatureInRankine,
                temperatureInRéaumur);
    }
}
