package numbermanipulation;

import java.util.Scanner;

public class ConvertTemperature {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	String temperature = scan.next();
	scan.next();
	int cel = scan.nextInt();
	int farah = scan.nextInt();
	
	switch (temperature) {
	case "Farenheit"-> System.out.println("Temperature in Fahrenheit:" +TemperatureLogic.celsiusToFahrenheit(cel));
	case "Celsius" -> System.out.println("Temperature in Celsius: " +TemperatureLogic.fahrenheitToCelsius(farah));
	}
	scan.close();
 }
}
