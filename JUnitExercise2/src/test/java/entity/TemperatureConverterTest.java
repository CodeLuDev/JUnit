package entity;

import org.example.entity.TemperatureConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {

    static TemperatureConverter temperatureConverter;

    @BeforeAll
    public static void setUp() {
        temperatureConverter = new TemperatureConverter();
    }

    @Test
    public void celsiusToFahrenheitTest() {
        Assertions.assertEquals(41.36,temperatureConverter.convertCelsiusToFahrenheit(5.2));
        Assertions.assertEquals(50,temperatureConverter.convertCelsiusToFahrenheit(10));
        Assertions.assertEquals(24.8,temperatureConverter.convertCelsiusToFahrenheit(-4));
    }

    @Test
    public void fahrenheitToCelsiusTest() {
        Assertions.assertEquals(0,temperatureConverter.convertFahrenheitToCelsius(32));
        Assertions.assertEquals(-15,temperatureConverter.convertFahrenheitToCelsius(5));
        Assertions.assertEquals(40,temperatureConverter.convertFahrenheitToCelsius(104));
    }

    @Test
    public void kelvinToCelsiusTest() {
        Assertions.assertEquals(25,temperatureConverter.convertKelvinToCelsius(298.15));
        Assertions.assertEquals(40,temperatureConverter.convertKelvinToCelsius(313.15));
        Assertions.assertEquals(25.5,temperatureConverter.convertKelvinToCelsius(298.65));
    }

    @Test
    public void celsiusToKelvinTest() {
        Assertions.assertEquals(273.15,temperatureConverter.convertCelsiusToKelvin(0));
        Assertions.assertEquals(293.15,temperatureConverter.convertCelsiusToKelvin(20));
        Assertions.assertEquals(310,temperatureConverter.convertCelsiusToKelvin(36.85));
    }

    @Test
    public void kelvinToFahrenheitTest() {
        Assertions.assertEquals(50,temperatureConverter.convertKelvinToFahrenheit(283.15));
        Assertions.assertEquals(500,temperatureConverter.convertKelvinToFahrenheit(533.15));
        Assertions.assertEquals(158,temperatureConverter.convertKelvinToFahrenheit(343.15));
    }

    @Test
    public void fahrenheitToKelvinTest() {
        Assertions.assertEquals(300,temperatureConverter.convertFahrenheitToKelvin(80.33));
        Assertions.assertEquals(500,temperatureConverter.convertFahrenheitToKelvin(440.33));
        Assertions.assertEquals(533.15,temperatureConverter.convertFahrenheitToKelvin(500));
    }
}
