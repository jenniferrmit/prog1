public class TemperatureConverter {
    public static void main(String[] args) {
        // Declare a Fahrenheit variable and assign a value
        double fahrenheit = 100.0; // You can change this value

        // Convert Fahrenheit to Celsius using the formula
        double celsius = ((5.0 / 9.0) * (fahrenheit - 32.0));

        // Print the result
        System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
    }
}

/*

IPO Breakdown:
	1.	Input:
		none
	2.	Processing:
    *   Declare a double variable fahrenheit and assign it a value between 0 and 100.
    * Declare a double variable celcius
    * celsius = (5/9) * (fahrenheit - 32)
	3.	Output:
	•	Print the Celsius 

*/