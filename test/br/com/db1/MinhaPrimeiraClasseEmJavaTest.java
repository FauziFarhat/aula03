package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MinhaPrimeiraClasseEmJavaTest {

	@Test
	public void ehParTest(){
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		assertTrue(primeiraClasse.ehPar(2));
		assertFalse(primeiraClasse.ehPar(3));
		assertTrue(primeiraClasse.ehPar(10));
	
	}
	
	@Test
	public void ehMaiorTest(){
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		assertTrue(primeiraClasse.ehMaior(10, 5));
		assertFalse(primeiraClasse.ehMaior(22, 30));

	}
	
	@Test
	public void somaDoisNumerosTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.somaDoisNumeros(1, 2);
		primeiraClasse.somaDoisNumeros(-1, -3);
	}
	
	@Test
	public void subtraiDoisNumerosTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.subtraiDoisNumeros(1, 4);
		primeiraClasse.subtraiDoisNumeros(-5, -3);
	}
	
	@Test
	public void multiplicaDoisNumerosTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.multiplicaDoisNumeros(5, 3);
		primeiraClasse.multiplicaDoisNumeros(2, 4);
	}
	
	@Test
	public void divideDoisNumerosTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.divideDoisNumeros(4, 2);
		primeiraClasse.divideDoisNumeros(5, 3);
		//primeiraClasse.divideDoisNumeros(5, 0);
	}
	
	/*
	@Test
	public void imparesAte100Test() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.imparesAte100(13);
	}
	*/
	
	@Test
	public void devolveMaiusculasTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.devolveMaiusculas("fauzi ali bombarda farhat");
		primeiraClasse.devolveMaiusculas("Fauzi Ali Bombarda Farhat");
	}
	
	@Test
	public void devolveMinusculasTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.devolveMinusculas("FAUZI ALI BOMBARDA FARHAT");
		primeiraClasse.devolveMinusculas("Fauzi Ali Bombarda Farhat");
	}
	
	@Test
	public void retornaQuantidadeLetrasTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.retornaQuantidadeLetras("DB1START");
	}
	
	@Test
	public void retornaQuantidadeDeLetrasComEspacoTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.retornaQuantidadeLetrasComEspaco(" DB1START ");
	}
	
	@Test
	public void retornaQuantidadeLetrasSemEspacoTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.retornaQuantidadeLetrasSemEspaco(" DB1START ");
	}
	
	@Test
	public void exibe4LetrasTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.exibe4Letras("Fauzi Ali Bombarda Farhat");
	}
	
	@Test
	public void exibeAPartirDa3Test() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.exibeAPartirDa3("Fauzi Ali Bombarda Farhat");
	}
	
	@Test
	public void exibeAs4UltimasLetrasTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.exibeAs4UltimasLetras("Fauzi Ali Bombarda Farhat");
	}
	
	/*
	@Test
	public void substituiPorAlunoTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.substituiPorAluno("Fauzi Ali Bombarda Farhat");
		System.out.println(primeiraClasse.substituiPorAluno("Fauzi Ali Bombarda Farhat"));
	}
	*/
	
	@Test
	public void exibeTextosSeparadosTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.exibeTextosSeparados("banana, maçã, melancia");
	}
	
	@Test
	public void exibeVogaisTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.exibeVogais("Fauzi");
	}
	
	@Test
	public void devolveInvertidoTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.devolveInvertido("Fauzi");
	}
	
	@Test
	public void qualEhMenorEntreDoisDoublesTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.qualEhMenorEntreDoisDoubles(4.94065645841246544e-324, 1.79769313486231570e+308);

	}
	
	@Test
	public void qualEhMenorEntreTresDoublesTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.qualEhMenorEntreTresDoubles(4.94065645841246544e-324, 1.79769313486231570e+308, 1.50769313486231570e+308);
	}
	
	@Test
	public void mediaTresNumerosTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.mediaTresNumeros(4.94065645841246544e-324, 1.79769313486231570e+308, 1.50769313486231570e+308);
	}
	
	@Test
	public void areaTrianguloTest() {
		MinhaPrimeiraClasseEmJava primeiraClasse = new MinhaPrimeiraClasseEmJava();
		primeiraClasse.areaTriangulo(3, 2);
	}
	
	
	
	
	
}