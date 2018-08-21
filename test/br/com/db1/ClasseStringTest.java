package br.com.db1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ClasseStringTest {

	@Test
	public void devolveMaiusculasTest() {
		ClasseString testString = new ClasseString();
		assertTrue(testString.devolveMaiusculas("fauzi ali bombarda farhat").equals("FAUZI ALI BOMBARDA FARHAT"));
	}
	
	@Test
	public void devolveMinusculasTest() {
		ClasseString testString = new ClasseString();
		assertTrue(testString.devolveMinusculas("FAUZI ALI BOMBARDA FARHAT").equals("fauzi ali bombarda farhat"));
	}
	
	@Test
	public void retornaQuantidadeLetrasTest() {
		ClasseString testString = new ClasseString();
		assertTrue(testString.retornaQuantidadeLetras("DB1START") == 8);
	}
	
	@Test
	public void retornaQuantidadeDeLetrasComEspacoTest() {
		ClasseString testString = new ClasseString();
		assertTrue(testString.retornaQuantidadeLetrasComEspaco(" DB1START ") == 10);
	}
	
	@Test
	public void retornaQuantidadeLetrasSemEspacoTest() {
		ClasseString testString = new ClasseString();
		assertTrue(testString.retornaQuantidadeLetrasSemEspaco(" DB1START ") == 8);
	}
	
	@Test
	public void exibe4LetrasTest() {
		ClasseString testString = new ClasseString();
		assertTrue(testString.exibe4Letras("Fauzi Ali Bombarda Farhat").equals("Fauz"));
	}
	
	@Test
	public void exibeAPartirDa3Test() {
		ClasseString testString = new ClasseString();
		assertTrue(testString.exibeAPartirDa3("Fauzi Ali Bombarda Farhat").equals("zi Ali Bombarda Farhat"));
	}
	
	@Test
	public void exibeAs4UltimasLetrasTest() {
		ClasseString testString = new ClasseString();
		assertTrue(testString.exibeAs4UltimasLetras("Fauzi Ali Bombarda Farhat").equals("rhat"));
	}
	
	/*
	@Test
	public void substituiPorAlunoTest() {
		ClasseString testString = new ClasseString();
		testString.substituiPorAluno("Fauzi Ali Bombarda Farhat");
		System.out.println(testString.substituiPorAluno("Fauzi Ali Bombarda Farhat"));
	}
	*/
	
	@Test
	public void exibeTextosSeparadosTest() {
		ClasseString testString = new ClasseString();
		testString.exibeTextosSeparados("banana, maçã, melancia");
	}
	
	@Test
	public void exibeVogaisTest() {
		ClasseString testString = new ClasseString();
		testString.exibeVogais("Fauzi");
	}
	
	@Test
	public void devolveInvertidoTest() {
		ClasseString testString = new ClasseString();
		testString.devolveInvertido("Fauzi");
	}
}
