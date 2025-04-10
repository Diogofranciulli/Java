package POO;

public class Assistente extends Funcionarios{
    protected int matricula;

    public Assistente(String nome, double salario, int matricula){
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula(){
        return matricula;
    }

    @Override
    public void exibeDados(){
        System.out.println("Cargo: Assistente");
        super.exibeDados();
        System.out.println("Matricula " + matricula);

    }
}
