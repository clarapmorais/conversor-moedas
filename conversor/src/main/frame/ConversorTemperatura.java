package main.frame;

public class ConversorTemperatura {

	InterfaceSistema interfacesistema = new InterfaceSistema();
	
// CEUSIUS PARA F -- F PARA CEUSIUS	-- F PARA KELVIN
	public void celsiusparaFahrenheit(double input) {
		interfacesistema.messageOutput((input * 1.8)+32, "Celsius (ºC)", "Fahrenheit (ºF)");
	}
	
	public void fahrenheitparaCelsius(double input) {
		interfacesistema.messageOutput((input - 32)*1.8, "Fahrenheit (ºF)", "Celsius (ºC)");
	}
	public void fahrenheitparaKelvin(double input) {
		interfacesistema.messageOutput((input + 459.67)*1.8, "Fahrenheit (ºF)", "Kelvin (K)");
	}
// CEUSIUS PARA F -- F PARA CEUSIUS	
	//--------------------------------//

// KELVIN PARA CEUSIUS -- KELVIN PARA F
	public void celsiusparaKelvin(double input) {
		interfacesistema.messageOutput(input + 273.15, "Celsius (ºC)", "Kelvin (K)");
	}
	
	public void kelvinparaCelsius(double input) {
		interfacesistema.messageOutput(input - 273.15, "Kelvin (K)", "Celsius (ºC)");
		
	}
	public void kelvinparaFahrenheit(double input) {
		interfacesistema.messageOutput(1.8 *(input-273.15)+32, "Kelvin (K)", "Fahrenheit (ºF)");
	}
// KELVIN PARA CEUSIUS -- KELVIN PARA F	
	
}
