package POO;

public class Administrativo extends Assistente{

    private int addNoturno;
    private String turno;

    public Administrativo(String nome, double salario, int matricula, int addNoturno, String turno){
        super(nome, salario, matricula);
        this.addNoturno = addNoturno;
        this.turno = turno;
    }


    @Override
    public void exibeDados(){
        System.out.println("Categoria: Administrativo");
        super.exibeDados();
        System.out.println("Adicional noturno " + addNoturno);
        System.out.println("salario com Adicional noturno " + salario + addNoturno);
        System.out.println("Turno: " + turno);
    }
}
