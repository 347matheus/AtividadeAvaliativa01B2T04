package objetos;

public class ProdutoEstoque {
	
	private String titular;
	private Double estoque;

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {

		if (titular != null && titular.isBlank()) {
			this.titular = titular;
		}
	}

	public Double getSaldo() {
		return estoque;
	}

	public void setSaldo(Double saldo) {

		if (saldo >= 0) {
			this.estoque = saldo;
		}
    }
	
	public ProdutoEstoque(String titular, Double estoque) {
		this.titular = titular;
		this.estoque = estoque;
	}
	
	public void depositar(double valor) {
        if (valor > 0) {
            this.estoque += valor;
        } else {
            System.out.println("ERRO");
        }
    }
	
	public void sacar(double valor) {
		if(valor > estoque) {
			System.out.println("ERRO");
		}
		else if(valor < 0) {
			System.out.println("ERRO");
		}
		else {
			this.estoque -= valor;
		}
	}
	
	public String toString() {
		return ("Nome: " + this.titular + " Estoque: " + this.estoque);
	}
}


