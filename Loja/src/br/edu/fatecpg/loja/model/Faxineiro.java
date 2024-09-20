package br.edu.fatecpg.loja.model;

public class Faxineiro  implements Funcionario{
	//na prática, está obrigando a ter esse método (implements)
	@Override
	public void baterPonto() {
		System.out.println("Ponto Registrado!");
		
	}
	public void solicitarMaterial() {
		System.out.println("Solicitando material");
		System.out.println("Material solicitado.");
	}
}
