package br.com.db1;

import org.junit.Test;

public class ClasseDoubleTest {

	
	@Test
	public void qualEhMenorEntreDoisDoublesTest() {
		ClasseDouble doubleTest = new ClasseDouble();
		doubleTest.qualEhMenorEntreDoisDoubles(4.94065645841246544e-324, 1.79769313486231570e+308);

	}
	
	@Test
	public void qualEhMenorEntreTresDoublesTest() {
		ClasseDouble doubleTest = new ClasseDouble();
		doubleTest.qualEhMenorEntreTresDoubles(4.94065645841246544e-324, 1.79769313486231570e+308, 1.50769313486231570e+308);
	}
	
	@Test
	public void mediaTresNumerosTest() {
		ClasseDouble doubleTest = new ClasseDouble();
		doubleTest.mediaTresNumeros(4.94065645841246544e-324, 1.79769313486231570e+308, 1.50769313486231570e+308);
	}
	
	@Test
	public void areaTrianguloTest() {
		ClasseDouble doubleTest = new ClasseDouble();
		doubleTest.areaTriangulo(3, 2);
	}
}
