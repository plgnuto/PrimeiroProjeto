package br.com.bertini.primeiroprojeto;

import br.com.bertini.primeiroprojeto.dominio.Cliente;

public class PrimeiraClasseJava {

	
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		System.out.println(cliente.getIdadePrimitivo());
		System.out.println(cliente.getIdadeWrapper());
		
	}

	

}
