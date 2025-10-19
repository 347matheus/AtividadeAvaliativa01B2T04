package objetos;

/*
 Crie a classe Retangulo com largura e altura (double) privados.
 Valide: valores maiores que 0.
 Métodos:
area() retorna largura × altura

perimetro() retorna 2 × (largura + altura)
 No main, crie um retângulo e mostre a área e perímetro.
 */
public class Retangulo {
	private Double largura;
	private Double altura;

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {

		if (largura > 0) {
			this.largura = largura;
		}
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {

		if (altura > 0) {
			this.altura = altura;
		}
	}

	public double area() {
		return largura * altura;
	}

	public double perimetro() {
		return ((altura * largura) * 2);
	}

	public Retangulo(Double largura, Double altura) {
		this.largura = 1.0;
		this.altura = 1.0;
	}
	
	public void calculo(Double largura, Double altura) {
	System.out.printf("altura: %d", largura * altura);
	System.out.printf("Perímetro: %d", largura * altura);
	}

}
