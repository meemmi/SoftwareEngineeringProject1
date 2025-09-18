package InClassAssignment_01;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;
        return celsius;
    }

    public double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
        return fahrenheit;

    }

    public boolean isExtremeTemperature(double temperature) {
        if (temperature < -40 || temperature > 50) {
            return true;
        } else {
            return false;
        }
    }
}
