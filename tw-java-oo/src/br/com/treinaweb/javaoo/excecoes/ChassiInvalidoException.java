package br.com.treinaweb.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {
	
	public ChassiInvalidoException(String chassi) {
		super(String.format("Este chassi é inválido [%s]", chassi));
	}

}
