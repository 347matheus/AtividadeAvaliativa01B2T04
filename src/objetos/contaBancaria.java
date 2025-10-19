package objetos;

public class contaBancaria {
	
	private String titular;
	private Double saldo;
	
	public contaBancaria(String titular, Double saldo) {
		
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getTitular() {
		
		if(titular != null && !titular.isBlank()) {
		return titular;
		}
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
