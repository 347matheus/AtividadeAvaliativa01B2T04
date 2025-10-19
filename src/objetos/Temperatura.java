package objetos;

/*
 Crie a classe Temperatura com atributo privado celsius (double).
 Valide que a temperatura não seja menor que -273.15°C (zero absoluto).
 Métodos:
paraFahrenheit() retorna (celsius × 9/5) + 32
paraKelvin() retorna celsius + 273.15
 No main, crie uma temperatura e mostre as conversões.
 */
public class Temperatura {
	private double celsius;
	private static final double ZERO_ABSOLUTO = -273.15;

	public Temperatura(double celsius) {
		setCelsius(celsius);
	}

	public double paraFahrenheit() {
		return (celsius * 9.0 / 5.0) + 32.0;
	}

	public double paraKelvin() {
		return celsius + 273.15;
	}

	public double getCelsius() {
		return celsius;
	}

	public void setCelsius(double celsius) {
		if (celsius >= ZERO_ABSOLUTO) {
			this.celsius = celsius;
		} else {
			this.celsius = ZERO_ABSOLUTO;
			System.out.println("ERRO: Temperatura abaixo do zero absoluto. Definida para -273.15°C.");
		}
	}
}
