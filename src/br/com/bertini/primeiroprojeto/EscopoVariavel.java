package br.com.bertini.primeiroprojeto;

public class EscopoVariavel {

	private static String nomeFamilia = "Silva";
	
	public static void main(String[] args) {
		System.out.println(obtemNomeCompleto("João"));
		System.out.println(obtemNomeFamilia());
	}
	
	private static String obtemNomeCompleto(String primeiroNome) {
		return primeiroNome + " " + nomeFamilia;
	}
	
	private static String obtemNomeFamilia() {
		return nomeFamilia;
	}
}
