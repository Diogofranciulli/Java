package POO;

public class Gerente extends Funcionarios{

    public Gerente(String nome, double salario){
        super(nome, salario);

    }

    @Override
    public void exibeDados(){
        System.out.println("Cargo: Gerente");
        super.exibeDados();
    }
}
