package br.com.treinaweb.javaoo.classes;

public class Carro extends Veiculo {

	public Carro() {
		this.quantidadeRodas = 4;
	}
	
	public Carro(String nome, String marca) { // Carro(String, String)
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}

}
