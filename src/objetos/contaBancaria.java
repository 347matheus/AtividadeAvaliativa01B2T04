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

public class contaBancaria {

	private String titular;
	private Double saldo;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {

		if (titular != null && titular.isBlank()) {
			this.titular = titular;
		}
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {

		if (saldo >= 0) {
			this.saldo = saldo;
		}
    }
	
	public contaBancaria(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("ERRO");
        }
    }
	
	public void sacar(double valor) {
		if(valor > saldo) {
			System.out.println("ERRO");
		}
		else if(valor < 0) {
			System.out.println("ERRO");
		}
		else {
			this.saldo -= valor;
		}
	}
	
	public String toString() {
		return ("Nome: " + this.titular + " Saldo: R$" + this.saldo);
	}
}
