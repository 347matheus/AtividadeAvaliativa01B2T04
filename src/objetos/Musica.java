package objetos;

public class Musica {
	private String titulo;
	private int duracaoSegundos;

	public Musica(String titulo, int duracaoSegundos) {
		this.titulo = titulo;
		this.duracaoSegundos = duracaoSegundos;
	}

	public String formatarDuracao() {
		if (this.duracaoSegundos <= 0) {
			return "00:00 (Duração Inválida)";
		}
		int minutos = this.duracaoSegundos / 60;
		int segundos = this.duracaoSegundos % 60;
		return String.format("%02d:%02d", minutos, segundos);
	}

	public String getTitulo() {
		return titulo;
	}

	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		} else {
			System.out.println("ERRO: Título não pode ser vazio. Título não alterado.");
		}
	}

	public void setDuracaoSegundos(int duracaoSegundos) {
		if (duracaoSegundos > 0) {
			this.duracaoSegundos = duracaoSegundos;
		} else {
			System.out.println("ERRO: Duração deve ser positiva. Duração não alterada.");
		}
	}

	public String toString() {
		return "Musica [titulo=" + titulo + ", duracaoSegundos=" + duracaoSegundos + "]";
	}
	
	
	
}
