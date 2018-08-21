package br.com.db1;

public class ClasseDouble {

	
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
