package br.com.treinaweb.javaoo.classes;

import br.com.treinaweb.javaoo.excecoes.AceleracaoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.FrenagemVeiculoDesligadoException;
import br.com.treinaweb.javaoo.interfaces.Andador;
import br.com.treinaweb.javaoo.interfaces.Ligador;

public class CarrinhoControleRemoto implements Ligador, Andador {

	@Override
	public void acelerar() throws AceleracaoVeiculoLigadoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void frear() throws FrenagemVeiculoDesligadoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		
	}

}
