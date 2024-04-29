package main.frame;



import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args)
	{
		
		ConversorMoedas conversor = new ConversorMoedas();
		ConversorTemperatura conversorTemperatura = new ConversorTemperatura();
		InterfaceSistema  interfaceSistema = new InterfaceSistema();

		String escolhida =  interfaceSistema.openSystem();
		
		System.out.println(escolhida);
		
	// Conversor de Moedas	
		if(escolhida == "Conversor de Moedas") {
			double input = interfaceSistema.inputSystem();
		System.out.println(input);
		String conversaoEscolhida = interfaceSistema.chooseSystem();
		
		if(conversaoEscolhida == "Real para Dólar") {
			conversor.realparaDolar(input);
		} else if(conversaoEscolhida == "Dólar para Real") {
			conversor.dolarparaReal(input);
			
		}else if(conversaoEscolhida == "Real para Euro") {
			conversor.realparaEuro(input);
		}else if(conversaoEscolhida == "Euro para Real") {
			conversor.europaraReal(input);
		}
		 else if(conversaoEscolhida == "Real para Libras Esterlinas") {
			conversor.realparaLibra(input);
		}else if(conversaoEscolhida == "Libras Esterlinas para Real") {
			conversor.libraparaReal(input);
		}
		else if(conversaoEscolhida == "Real para Peso Argentino") {
			conversor.realparaPesoArgentino(input);
		}else if(conversaoEscolhida == "Peso Argentino para Real") {
			conversor.pesoArgentinoparaReal(input);
		}
		else if(conversaoEscolhida == "Real para Peso Chileno") {
			conversor.realParaPesoChileno(input);
		}else if(conversaoEscolhida == "Peso Chileno para Real") {
			conversor.pesoChilenoparaReal(input);
		}
		// Conversor de Moedas		
		//---------------------------------------------------//
		
		// Conversor de Temperatura
		}else if(escolhida == "Conversor de Temperatura") {
			String conversaoTemperatura = interfaceSistema.chooseSystemTemperatura();
			double input = interfaceSistema.inputSystem();
			
			System.out.println(conversaoTemperatura);
			
			if(conversaoTemperatura == "Celsius para Fahrenheit") {
				conversorTemperatura.celsiusparaFahrenheit(input);
			}else if(conversaoTemperatura == "Fahrenheit para Celsius") {
				conversorTemperatura.fahrenheitparaCelsius(input);
			}
			else if(conversaoTemperatura == "Celsius para Kelvin") {
				conversorTemperatura.celsiusparaKelvin(input);
			}else if(conversaoTemperatura == "Kelvin para Celsius") {
				conversorTemperatura.kelvinparaCelsius(input);
			}
			else if(conversaoTemperatura == "Kelvin para Fahrenheit") {
				conversorTemperatura.kelvinparaFahrenheit(input);
			}else if(conversaoTemperatura == "Fahrenheit para Kelvin") {
				conversorTemperatura.fahrenheitparaKelvin(input);
			}
		}
		// Conversor de Temperatura

	}
	}
