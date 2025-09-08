//Convert a temperature from Celsius to Fahrenheit using the formula: F = (C * 9/5) + 32.
package Java_Programs;
class Temp_converter {
    public static void main(String[] args) {
        double celsius = 25.0; // Example Celsius temperature
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}