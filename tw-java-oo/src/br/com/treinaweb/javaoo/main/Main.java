package br.com.treinaweb.javaoo.main;

import br.com.treinaweb.javaoo.classes.Carro;
import br.com.treinaweb.javaoo.classes.Moto;
import br.com.treinaweb.javaoo.classes.VeiculoBase;
import br.com.treinaweb.javaoo.excecoes.AbastecimentoVeiculoLigadoException;
import br.com.treinaweb.javaoo.excecoes.ChassiInvalidoException;
import br.com.treinaweb.javaoo.interfaces.Andador;
import br.com.treinaweb.javaoo.interfaces.Veiculo;

public class Main {

	public static void main(String[] args) {
		try {
			//Carro corsa = new Carro("Corsa", "GM");
			VeiculoBase corsa = new Carro("Corsa", "GM"); // Polimorfismo
			corsa.setChassi("ABCDE");
			corsa.abastecer(10);
			// ((Carro)corsa).setQuantidadePortas(4);
			System.out.println(corsa.getNome());
			System.out.println(corsa.getQuantidadeCombustivel());
			System.out.println(corsa.getQuantidadeRodas());
			System.out.println(String.format("O veículo %s está ligado? %b", corsa.getNome(), corsa.isLigado()));
			corsa.abastecer(10);
			corsa.preparar();
			corsa.ligar();
			corsa.acelerar();
			System.out.println(String.format("Velocidade atual do veículo: %f", corsa.getVelocidade()));
			corsa.frear();
			System.out.println(String.format("Velocidade atual do veículo: %f", corsa.getVelocidade()));
		} catch (AbastecimentoVeiculoLigadoException e) {
			System.out.println("Você não pode abastecer um veículo enquanto ele estiver ligado.");
		} catch (ChassiInvalidoException e) {
			System.out.println("O chassi é inválido. " + e.getMessage());
		} catch (Exception e) {
			System.out.println("** Ocorreu um erro: " + e.getMessage());
		}
	}

}
