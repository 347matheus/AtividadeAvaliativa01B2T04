package objetos;
/*
 Crie a classe Funcionario com atributos privados: nome (String) e salario (double).
 Valide: nome não vazio; salário ≥ 0.
 Método aumentarSalario(double percentual) que aumenta o salário com base no percentual (ex: 10%).
 No main, crie um funcionário, aumente o salário e mostre antes e depois.
 */
public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        if (percentual > 0) {
            this.salario *= (1.0 + (percentual / 100.0));
            System.out.println("Aumento de " + percentual + "% aplicado.");
        } else {
            System.out.println("ERRO: O percentual de aumento deve ser positivo.");
        }
    }

    public String getNome() { 
        return nome; 
    }
    public double getSalario() { 
        return salario; 
    }

    public void setNome(String nome) {
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        } else {
            System.out.println("ERRO: Nome não pode ser vazio. Nome não alterado.");
        }
    }

    public void setSalario(double salario) {
        if (salario >= 0) {
            this.salario = salario;
        } else {
            System.out.println("ERRO: Salário não pode ser negativo. Salário não alterado.");
        }
    }
    public String toString() {
        return "Funcionário [Nome: " + nome +  " | Salário: R$" + String.format("%.2f", salario) + "]";
    }
}