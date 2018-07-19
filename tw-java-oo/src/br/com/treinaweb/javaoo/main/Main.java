package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;

public class Main {

	public static void main(String[] args) {
		try {
			//Carro corsa = new Carro();
			//corsa.setMarca("GM");
			//corsa.setNome("Corsa");
			Carro corsa = new Carro("Corsa", "GM");
			corsa.setChassi("ABCDE");
			corsa.abastecer(10);
			System.out.println(corsa.getNome());
			System.out.println(corsa.getQuantidadeCombustivel());
			System.out.println(corsa.getQuantidadeRodas());
			corsa.ligar();
			Carro celta = new Carro();
			celta.ligar();
		} catch (Exception e) {
			System.out.println("** Ocorreu um erro: " + e.getMessage());
		}
	}

}
