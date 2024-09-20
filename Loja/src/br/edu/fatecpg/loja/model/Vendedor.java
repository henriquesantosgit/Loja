package br.edu.fatecpg.loja.model;

//abstract class eu posso ter corpo no método, classe abstrata não pode ser instânciada, nesse exemplo essa loja contrataria seus vendedores como gerentes 
public abstract class Vendedor implements Funcionario{
	public void realizarVenda() {
		System.out.println("Venda realizada!");
	}

	@Override
	public void baterPonto() {
		System.out.println("Ponto Registrado");
		
	}
	public void fecharCaixa() {
		System.out.println("Fechando caixa...");
	}
	
}
