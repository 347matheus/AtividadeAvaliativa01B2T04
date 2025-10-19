package objetos;

public class zzzzz {
	public static void main(String[] args) {
		
		System.out.println("1. teste conta bancária");
		
		contaBancaria conta = new contaBancaria("Matheus", 900.00);
		
		System.out.println("Inicial: " +conta);
		conta.depositar(100);
		conta.sacar(200);
		System.out.println(conta);
		
		System.out.println("========================================");
		System.out.println("\n2. teste filme");
		
		Filme filme = new Filme("Telefone Preto", "⭐⭐⭐");
		System.out.println(filme);
		
		System.out.println("========================================");
		System.out.println("\n3. teste funcionário");
		Funcionario funcionario1 = new Funcionario("Teste", 2000);
		
		System.out.println("Salário atual: "+ funcionario1);
		funcionario1.aumentarSalario(10.0);
		System.out.println("Salário atualizado: " + funcionario1);
		
		System.out.println("========================================");
		System.out.println("\n4. Retângulo");
		Retangulo retan = new Retangulo(50.0, 30.0);
		System.out.println("área: "+ retan.area());
		System.out.println("perimetro: "+ retan.perimetro());
		
		System.out.println("========================================");
		System.out.println("\n5. Música");
		Musica musica = new Musica("teste", 300);
		System.out.println("Música: "+ musica);
		System.out.println("formatada: " +musica.formatarDuracao());

		System.out.println("========================================");
		System.out.println("\n6. pessoaIMC");
		
		Pessoa pessoa1 = new Pessoa("Pessoa 1", 70.0, 1.85);
		pessoa1.classificacaoIMC();
		
		System.out.println("========================================");
		System.out.println("\n7. conta de luz");
		ContaLuz luz = new ContaLuz(350.0, 0.95);
        System.out.println("Valor a pagar: R$" +
		String.format("%.2f", luz.calcularValorTotal()));

		System.out.println("========================================");
		System.out.println("\n8. bicicleta aluguel");
		BicicletaAlugada bike = new BicicletaAlugada(4, 8.50);
        System.out.println("Valor total do aluguel: R$" + 
		String.format("%.2f", bike.calcularValor()));
		
		System.out.println("========================================");
		System.out.println("\n9. produto estocado");
		
		ProdutoEstoque estoq = new ProdutoEstoque("televisão", 500.0);
		
		System.out.println("Inicial: " +estoq);
		estoq.depositar(100);
		estoq.sacar(500);
		System.out.println(estoq);
		
		System.out.println("========================================");
		System.out.println("\n10. temporada");
		Temperatura temp = new Temperatura(30);
		System.out.println("Celsius: " + temp.getCelsius());
		System.out.println("Fahrenheit: " + temp.paraFahrenheit());
		System.out.println("Kelvin: "+ temp.paraKelvin());
	}
}
