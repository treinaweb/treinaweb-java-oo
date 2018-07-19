package br.com.treinaweb.javaoo.excecoes;

public class ChassiInvalidoException extends Exception {
	
	private static final long serialVersionUID = 8046906767502979484L;

	public ChassiInvalidoException(String chassi) {
		super(String.format("Este chassi é inválido [%s]", chassi));
	}

}
