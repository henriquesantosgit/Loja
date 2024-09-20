package br.edu.fatecpg.loja.model;

public class Gerente extends Vendedor implements Funcionario{
	//ele já ganha a característica de vendedor ,ou seja, do método baterPonto presente nele que vem da interface
	public void realizarVenda() {
		System.out.println("Vendeu!");
	}
}
