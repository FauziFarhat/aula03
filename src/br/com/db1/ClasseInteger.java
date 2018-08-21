package br.com.db1;

import java.util.ArrayList;
import java.util.List;

public class ClasseInteger {

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
	
	public List<Integer> imparesAte100(Integer valor1) {
		List<Integer> impares = new ArrayList<Integer>();
		percorreLista(valor1, impares);
		return impares;
	}

	private void percorreLista(Integer valor1, List<Integer> impares) {
		for (Integer contador = valor1; contador < 100; contador++) {
			validaEhPar(impares, contador);
		}
	}

	private void validaEhPar(List<Integer> impares, Integer contador) {
		if(contador % 2 != 0) {
			impares.add(contador);
		}
	}
}
