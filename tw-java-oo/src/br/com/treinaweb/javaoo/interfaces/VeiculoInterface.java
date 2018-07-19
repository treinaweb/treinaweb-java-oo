package br.com.treinaweb.javaoo.interfaces;

import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public interface VeiculoInterface {
	
	void ligar();
	void desligar();
	void abastecer() throws AbastecimentoVeiculoLigadoException;
	void acelerar() throws AceleracaoVeiculoLigadoException;
	void frear() throws FrenagemVeiculoDesligadoException;
	void preparar();

}
