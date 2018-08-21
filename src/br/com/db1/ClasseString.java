package br.com.db1;

import java.util.Arrays;

public class ClasseString {

	
	public String devolveMaiusculas(String texto1) {
		return texto1.toUpperCase();
	}
	
	public String devolveMinusculas(String texto1) {
		return texto1.toLowerCase();
	}
	
	public Integer retornaQuantidadeLetras(String texto1) {
		return texto1.length();
	}
	
	public Integer retornaQuantidadeLetrasComEspaco(String texto1) {
		return texto1.length();
	}
	
	public Integer retornaQuantidadeLetrasSemEspaco(String texto1) {
		return (texto1.trim()).length();
	}
	
	public String exibe4Letras(String texto1) {
		return texto1.substring(0, 4);
	}
	
	public String exibeAPartirDa3(String texto1) {
		return texto1.substring(3, texto1.length());
	}
	
	public String exibeAs4UltimasLetras(String texto1) {
		return texto1.substring(texto1.length()-4, texto1.length());
	}
	 /*
	public String substituiPorAluno(String texto1) {
		return texto1.in
	}
	*/
	
	public String exibeTextosSeparados(String texto1) {
		return Arrays.toString(texto1.split(","));
	}
	
	public Integer exibeVogais(String texto1) {
		Integer vogal=0;
		for (Integer posicao = 0; posicao < texto1.length(); posicao++) {
			if (texto1.charAt(posicao) == 'a' | texto1.charAt(posicao) == 'e' | texto1.charAt(posicao) == 'i' | texto1.charAt(posicao) == 'o' | texto1.charAt(posicao) == 'u') {
				vogal++;
			}
		}
		return vogal;
	}
	
	public String devolveInvertido(String texto1) {
		return new StringBuilder(texto1).reverse().toString();
	}
}
