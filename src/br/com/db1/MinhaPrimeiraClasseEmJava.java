package br.com.db1;

import java.util.Arrays;

public class MinhaPrimeiraClasseEmJava {

	public Boolean ehPar(Integer valor1) {
		return valor1 % 2 == 0;		
	}
	
	public Boolean ehMaior(Integer valor1, Integer valor2){
		return valor1 > valor2;
	}
	
	public Integer somaDoisNumeros(Integer valor1, Integer valor2) {
		return valor1 + valor2;
	}
	
	public Integer subtraiDoisNumeros(Integer valor1, Integer valor2) {
		return valor1 - valor2;
	}
	
	public Integer multiplicaDoisNumeros(Integer valor1, Integer valor2) {
		return valor1 * valor2;
	}
	
	public Integer divideDoisNumeros(Integer valor1, Integer valor2){
		return valor1 / valor2;
	}
	
	/*
	public Integer imparesAte100(Integer valor1) {
		for (Integer impares = valor1; impares == 100; impares++) {
			return (impares % 2 == 1);
		}
	}
	*/
	
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
	
	public Double qualEhMenorEntreDoisDoubles(Double valor1, Double valor2) {
		if (valor1 < valor2) {
			return valor1;
		}
		else {
			return valor2;
		}
	}
	
	public Double qualEhMenorEntreTresDoubles(Double valor1, Double valor2, Double valor3) {
		if (valor1 < valor2 && valor1 < valor3) {
			return valor1;
		}
		else if (valor2 < valor1 && valor2 < valor3) {
			return valor2;
		}
		else {
			return valor3;
		}
	}
	
	public Double mediaTresNumeros(Double valor1, Double valor2, Double valor3) {
		return (valor1 + valor2 + valor3)/3;
	}
	
	public Integer areaTriangulo(Integer base, Integer altura) {
		return (base*altura)/2;
	}
	

}