package br.com.bertini.primeiroprojeto;

import br.com.bertini.primeiroprojeto.dominio.Cliente;

public class TesteComparacaoTiposVariaveis {

	
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		System.out.println("PRIMITIVOS");
		System.out.println(cliente.getIdadePrimitivo());
		System.out.println(cliente.isClienteAtivoPrimitivo());
		System.out.println(cliente.getValorPrimitivo());

		System.out.println("......................");

		System.out.println("WRAPPERS");
		System.out.println(cliente.getIdadeWrapper());
		System.out.println(cliente.isClienteAtivoPrimitivo());
		System.out.println(cliente.getValorWrapper());
	}

}
