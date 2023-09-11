package org.example.entity;
/*
Español
Conversión de Temperatura:
Crea una clase TemperatureConverter que convierta entre diferentes unidades de temperatura
(por ejemplo, Celsius, Fahrenheit, Kelvin).
Escribe pruebas unitarias para asegurarte de que la conversión entre las diferentes unidades
se realiza correctamente y produce los resultados esperados.

English
Temperature Conversion:
Create a TemperatureConverter class that converts between different temperature units
(for example, Celsius, Fahrenheit, Kelvin).
Write unit tests to ensure that the conversion between the different units
succeeds and produces the expected results.
 */
public class TemperatureConverter {

    public double convertCelsiusToFahrenheit(double gradosC) {
        return (gradosC * 9/5) + 32;
    }

    public double convertFahrenheitToCelsius(double gradosF) {
        return (gradosF - 32) * 5/9;
    }

    public double convertKelvinToCelsius(double gradosK) {
        return gradosK - 273.15;
    }

    public double convertCelsiusToKelvin(double gradosC) {
        return gradosC + 273.15;
    }

    public double convertKelvinToFahrenheit(double gradosK) {
        return (gradosK - 273.15) * 9/5 + 32;
    }

    public double convertFahrenheitToKelvin(double gradosF) {
        return (gradosF - 32) * 5/9 + 273.15;
    }
}
