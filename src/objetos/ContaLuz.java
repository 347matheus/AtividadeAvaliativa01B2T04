package objetos;
/*
 Crie a classe ContaLuz com atributos privados: consumoKwh (double) e valorKwh (double).
 Valide: ambos maiores que 0.
 Método calcularValorTotal() que retorna consumo × valor por kWh.
 No main, crie uma conta, calcule e exiba o valor a pagar.
 */
public class ContaLuz {
	    private double consumoKwh;
	    private double valorKwh;

	    public ContaLuz(double consumoKwh, double valorKwh) {
	        setConsumoKwh(consumoKwh);
	        setValorKwh(valorKwh);
	    }

	    public double calcularValorTotal() {
	        return consumoKwh * valorKwh;
	    }

	    public double getConsumoKwh() { return consumoKwh; }
	    public double getValorKwh() { return valorKwh; }

	    public void setConsumoKwh(double consumoKwh) {
	        if (consumoKwh > 0) {
	            this.consumoKwh = consumoKwh;
	        } else {
	            this.consumoKwh = 1.0;
	            System.out.println("ERRO: Consumo deve ser maior que 0. Definido para 1.0.");
	        }
	    }
	    public void setValorKwh(double valorKwh) {
	        if (valorKwh > 0) {
	            this.valorKwh = valorKwh;
	        } else {
	            this.valorKwh = 0.1;
	            System.out.println("ERRO: Valor/kWh deve ser maior que 0. Definido para R$ 0.10.");
	        }
	    }
	}
