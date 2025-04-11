package POO;

public class Funcionarios {
       protected int matricula;
       protected String nome;
       protected double salario;

       public Funcionarios(String nome, double salario){
           this.nome = nome;
           this.salario = salario;
       }

    public String getNome() {
        return nome;
    }

    public double getSalario(){
           return salario;
    }

    public void exibeDados(){
        System.out.println("nome do funcionario " + nome);
        System.out.printf("salario do funcionario " + salario);
    }
}
