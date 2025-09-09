// Convert a temperature from Celsius to Fahrenheit using the formula: F = (C * 9/5) + 32.
public class Temp_converter {
    public static void main(String[] args) {
        double celsius = 25.0; // Example Celsius temperature
        double fahrenheit = (celsius * 9/5) + 32; // Convert to Fahrenheit
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
    }   
}
