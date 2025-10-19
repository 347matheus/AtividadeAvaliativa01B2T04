package objetos;
/*
 Crie a classe Pessoa com atributos privados: nome (String), peso (double) e altura (double).
 Valide: nome não vazio; peso e altura > 0.
 Método calcularIMC() que retorna peso / (altura²).
 Método classificacaoIMC() que retorna uma string com a faixa (ex: “Normal”, “Sobrepeso”...).
 No main, crie uma pessoa e exiba IMC e classificação.
 */
public class Pessoa {
	private String nome;
	private Double peso;
	private Double altura;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	
	public void classificacaoIMC() {
		double imc = peso / (altura * altura);
		
		if(imc > 30) {
			System.out.println("Sobrepeso // IMC: "+ imc);
		}
		else if(imc >20 && imc < 30) {
			System.out.println("Peso normal // IMC: " + imc);
		}
		else {
			System.out.println("abaixo do peso // IMC: " + imc);
		}
	}
	
	public Pessoa(String nome, Double peso, Double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
	}
	public String toString() {
		return "Pessoa [nome=" + nome + ", peso=" + peso + ", altura=" + altura + "]";
	}

}
