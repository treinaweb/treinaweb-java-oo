package br.com.treinaweb.javaoo.interfaces;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;

public interface Andador {

	void acelerar() throws AceleracaoVeiculoLigadoException;
	void frear() throws FrenagemVeiculoDesligadoException;
}
