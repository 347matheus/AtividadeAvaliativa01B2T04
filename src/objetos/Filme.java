package objetos;
/*
Crie a classe ContaBancaria com atributos privados: titular (String) e saldo (double).
Valide: titular não pode ser vazio; saldo não pode ser negativo.
Métodos:

depositar(double valor) (aceita apenas valores positivos)
sacar(double valor) (não permite saldo negativo após saque)

Getters e setters adequados.
No main, crie uma conta, faça depósitos e saques e imprima o saldo final.
*/
public class Filme {

	private String titulo;
	private String avaliacao;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Double avaliacao) {
		if (avaliacao >= 0 && avaliacao <= 5) {
			if(avaliacao == 0) {
				System.out.println("Sem nota");
			}
			else if(avaliacao == 1) {
				System.out.println("⭐");
			}
			else if(avaliacao == 2) {
				System.out.println("⭐⭐");
			}
			else if(avaliacao == 3) {
				System.out.println("⭐⭐⭐");
			}
			else if(avaliacao == 4) {
				System.out.println("⭐⭐⭐⭐");
			}
			else if(avaliacao == 5) {
				System.out.println("⭐⭐⭐⭐⭐");
			}
		}
	}
	
	public Filme(String titulo, String avaliacao) {
		this.titulo = titulo;
		this.avaliacao = avaliacao;
	}
	
	public void exibir(String titulo, String avaliacao) {
		System.out.println("filme: " + this.titulo + " nota: " + this.avaliacao);
	}
	
	public String toString() {
		return("filme: " + this.titulo + " nota: " + this.avaliacao);
	}

}

