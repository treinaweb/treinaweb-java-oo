package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public class Moto extends Veiculo {
	
	public Moto() {
		this.quantidadeRodas = 2;
	}
	
	public Moto(String nome, String marca) {
		this.quantidadeRodas = 2;
		this.setNome(nome);
		this.setMarca(marca);
	}
	
	@Override
	public void acelerar() throws AceleracaoVeiculoLigadoException {
		if (this.isLigado()) {
			this.velocidade += 3;
		} else {
			throw new AceleracaoVeiculoLigadoException();
		}
	}
	
	@Override
	public void frear() throws FrenagemVeiculoDesligadoException {
		if (this.isLigado()) {
			this.velocidade -= 3;
		} else {
			throw new FrenagemVeiculoDesligadoException();
		}
	}

}
