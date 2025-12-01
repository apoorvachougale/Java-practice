package numbermanipulation;

public class TemperatureLogic {
	public static double celsiusToFahrenheit (int celsius) {

		double fahrenheit = (celsius* 9/5) + 32;

		return fahrenheit;
	}
		public static double fahrenheitToCelsius (int fahrenheit) {

		double celsius = (fahrenheit -32) *5/9;

		return celsius;

		}
}
