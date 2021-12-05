package com.letscode.converter;
public class Main {
    public static void main (String[] args){
        float temperatureInCelsius = 23;

        final float TEMPERATURE_IN_FAHRENHEIT = (temperatureInCelsius * 1.8f) + 32;
        final float TEMPERATURE_IN_KELVIN = temperatureInCelsius + 273.15f;
        final float TEMPERATURE_IN_REAUMUR = temperatureInCelsius * 0.8f;
        final float TEMPERATURE_IN_RANKINE = (temperatureInCelsius * 1.8f) + 491;

        System.out.printf("%.2f Celsius is equivalent to: %n" +
                "%.2f Fahrenheit,%n" +
                "%.2f Kelvin, %n" +
                "%.2f Réaumur, and %n" +
                "%.2f Rankine",
                temperatureInCelsius,
                TEMPERATURE_IN_KELVIN,
                TEMPERATURE_IN_FAHRENHEIT,
                TEMPERATURE_IN_RANKINE,
                TEMPERATURE_IN_REAUMUR);
    }
}
