package br.edu.fatecpg.loja.view;

import br.edu.fatecpg.loja.model.Faxineiro;
import br.edu.fatecpg.loja.model.Gerente;

public class Main {

	public static void main(String[] args) {
		// Teste Funcionario
		//ERRO interface não pode
		//Teste Vendedor
		//ERRO - abstract não pode
		
		//Teste Faxineiro
		Faxineiro fax = new Faxineiro();
		fax.solicitarMaterial();
		//Teste Gerente
		Gerente ger = new Gerente();
		ger.baterPonto();
		ger.realizarVenda();
		ger.fecharCaixa();
	}

}
