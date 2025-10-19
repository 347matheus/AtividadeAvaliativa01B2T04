package objetos;

public class BicicletaAlugada {
	private int horas;
	private double valorHora;

	public BicicletaAlugada(int horas, double valorHora) {
		setHoras(horas);
		setValorHora(valorHora);
	}

	public double calcularValor() {
		return horas * valorHora;
	}

	public int getHoras() {
		return horas;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setHoras(int horas) {
		if (horas >= 1) {
			this.horas = horas;
		} else {
			this.horas = 1;
			System.out.println("ERRO: Horas de aluguel devem ser >= 1. Definido para 1.");
		}
	}

	public void setValorHora(double valorHora) {
		if (valorHora > 0) {
			this.valorHora = valorHora;
		} else {
			this.valorHora = 5.0;
			System.out.println("ERRO: Valor/hora deve ser maior que 0. Definido para R$ 5.00.");
		}
	}
}
