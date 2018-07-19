package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo corsa = new Veiculo();
		corsa.marca = "GM";
		corsa.nome = "Corsa";
		corsa.ligar();
		Veiculo celta = new Veiculo();
		celta.marca = "GM";
		celta.nome = "Celta";
		celta.ligar();
	}
	
}
