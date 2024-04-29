package main.frame;

import javax.swing.JOptionPane;

public class InterfaceSistema {
	private JOptionPane pane = new JOptionPane();
	
	private String listInitial [] = {"Conversor de Moedas", "Conversor de Temperatura"};
	
	private String listConversoes [] = // Lista que armazena tipos de conversões
		{"Real para Dólar", "Real para Euro", "Real para Libras Esterlinas", "Real para Peso Argentino", "Real para Peso Chileno", 
			"Dólar para Real", "Euro para Real", "Libras Esterlinas para Real", "Peso Argentino para Real", "Peso Chileno para Real"};
	
	private String listaConversoesTemperatura [] = {"Celsius para Fahrenheit", "Celsius para Kelvin",
			"Fahrenheit para Celsius", "Fahrenheit para Kelvin", "Kelvin para Celsius", "Kelvin para Fahrenheit"};
	public String  openSystem() { // Método que abre a primeira tela do sistema
		
		return (String) pane.showInputDialog(null, "Escolha uma opção", "Input", JOptionPane.QUESTION_MESSAGE, null, listInitial, listInitial[0]);
	}

	public String chooseSystem() { // Método que devolve a String escolhido pela InputDialog
		
		return (String)pane.showInputDialog(null, "Escolha a moeda que você deseja converter", "Moedas", JOptionPane.QUESTION_MESSAGE, null, listConversoes, listConversoes[0]);
	}
	
	public String chooseSystemTemperatura() {
		return (String) pane.showInputDialog(null, "Escolha a Medida de Temperatura que você deseja converter", "Temperatura", JOptionPane.QUESTION_MESSAGE, null, listaConversoesTemperatura, listaConversoesTemperatura[0]);
	}
	
	public double inputSystem() { // Método que recebe um valor pela InputDialog e retorna uma referencia double "number"
	String number = (String) pane.showInputDialog("Digite um valor");
	
	return Double.parseDouble(number);
	}
	
	public void messageOutput(double output, String moedaOriginal, String moedaConvertida) {
		pane.showMessageDialog(null, "O valor da conversão de " + moedaOriginal + " para " + moedaConvertida + " é: " + output);
		
	}
}
