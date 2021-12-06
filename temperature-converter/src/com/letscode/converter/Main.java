package com.letscode.converter;

import com.letscode.converter.utils.Reader;
import com.letscode.converter.service.Calculator;

public class Main {
    public static void main (String[] args){

        float temperatureInCelsius = Float.parseFloat(Reader.scanTemperatureInCelsius());
        Calculator.convertTemperature(temperatureInCelsius);
    }
}
