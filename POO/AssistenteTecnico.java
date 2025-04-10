package POO;

public class AssistenteTecnico extends Assistente{
    private int bonus;

    public AssistenteTecnico(String nome, double salario, int matricula, int bonus){
        super(nome, salario, matricula);
        this.bonus = bonus;
    }


    @Override
    public void exibeDados(){
        System.out.println("Categoria: Tecnico");
        super.exibeDados();
        System.out.println("bonus " + bonus);
        System.out.println("salario com bonus " + salario + bonus);

    }

}
