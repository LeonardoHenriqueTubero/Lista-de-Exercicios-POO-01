package services;

public class ConversorTemperatura {
    public static double celsiusFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
