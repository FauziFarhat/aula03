package br.com.db1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

public class ClasseIntegerTest {

	@Test
	public void ehParTest(){
		ClasseInteger integerTest = new ClasseInteger();
		assertTrue(integerTest.ehPar(2));
		assertFalse(integerTest.ehPar(3));
		assertTrue(integerTest.ehPar(10));
	
	}
	
	@Test
	public void ehMaiorTest(){
		ClasseInteger integerTest = new ClasseInteger();
		assertTrue(integerTest.ehMaior(10, 5));
		assertFalse(integerTest.ehMaior(22, 30));

	}
	
	@Test
	public void somaDoisNumerosTest() {
		ClasseInteger integerTest = new ClasseInteger();
		assertTrue(integerTest.somaDoisNumeros(1, 2) == 3);
	}
	
	@Test
	public void subtraiDoisNumerosTest() {
		ClasseInteger integerTest = new ClasseInteger();
		assertTrue(integerTest.subtraiDoisNumeros(1, 4) == -3);
	}
	
	@Test
	public void multiplicaDoisNumerosTest() {
		ClasseInteger integerTest = new ClasseInteger();
		assertTrue(integerTest.multiplicaDoisNumeros(5, 3) == 15);
	}
	
	@Test
	public void divideDoisNumerosTest() {
		ClasseInteger integerTest = new ClasseInteger();
		assertTrue(integerTest.divideDoisNumeros(4, 2) == 2);
		//integerTest.divideDoisNumeros(5, 0);
	}
	
	
	@Test
	public void imparesAte100Test() {
		ClasseInteger integerTest = new ClasseInteger();
		List<Integer> impares = integerTest.imparesAte100(93);
		//assertTrue(impares.get(0));
		
	}
}
