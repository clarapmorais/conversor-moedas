package main.frame;

public class ConversorMoedas {
	
	InterfaceSistema interfacesistema = new InterfaceSistema();

	
	//REAL PARA DÓLAR - DÓLAR PARA REAL	
	public void realparaDolar(double input) {
		interfacesistema.messageOutput(input * 0.21, "Real", "Dólar");
	}

	public void dolarparaReal(double input) {
		interfacesistema.messageOutput(input * 4.80, "Dólar", "Real");
	}
	//REAL PARA DÓLAR - DÓLAR PARA REAL			
	
	//------------------------------------------------//
	
	// REAL PARA EURO - EURO PARA REAL//
	public void realparaEuro(double input) {
		interfacesistema.messageOutput(input * 0.19, "Real", "Euro");
	}
	
	public void europaraReal(double input) {
		interfacesistema.messageOutput(input * 5.37, "Euro", "Real");
	}
	// ----------------------------------------//
	
	// REAL PARA PESO ARGENTINO - PESO ARGENTINO PARA REAL//
	

	public void realparaPesoArgentino(double input) {
		interfacesistema.messageOutput(input * 55.33, "Real", "Peso Argentino");

	}
	
	public void pesoArgentinoparaReal(double input) {
		interfacesistema.messageOutput(input * 0.018, "Peso Argentino", "Real");

	}
	// REAL PARA PESO ARGENTINO - PESO ARGENTINO PARA REAL//
	
	// ----------------------------------------//	
	
	// REAL PARA LIBRA - LIBRA PARA REAL//
	
	public void realparaLibra(double input) {
		interfacesistema.messageOutput(input * 0.16, "Real", "Libra Esterlina");		
	}
	
	public void libraparaReal(double input) {
		interfacesistema.messageOutput(input * 6.28, "Libra Esterlina", "Real");
	}
	// REAL PARA LIBRA - LIBRA PARA REAL//
	
	//-------------------------------------------//
	
	// REAL PARA PESO CHILENO - PESO CHILENO PARA REAL //
	
	public void pesoChilenoparaReal(double input) {
		interfacesistema.messageOutput(input * 0.0059, "Peso Chileno", "Real");		
	}
	
	public void realParaPesoChileno(double input) {
		interfacesistema.messageOutput(input * 169.30, "Real", "Peso Chileno");
	}
	
	// REAL PARA PESO CHILENO - PESO CHILENO PARA REAL //	
}
