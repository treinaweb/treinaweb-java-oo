package br.com.treinaweb.javaoo.classes;

public final class Carro extends Veiculo {
	
	private int quantidadePortas;
	
	public int getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(int quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}

	public Carro() {
		this.quantidadeRodas = 4;
	}
	
	public Carro(String nome, String marca) { // Carro(String, String)
		this.quantidadeRodas = 4;
		this.setNome(nome);
		this.setMarca(marca);
	}

}
