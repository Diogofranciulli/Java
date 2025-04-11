package POO;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Diogo", 30000.0);
        System.out.println("Dados Do Gerente");
        gerente.exibeDados();

        Assistente assistente = new Assistente("Rosangela",1000,12334);
        System.out.println("Dados do Assistente");
        assistente.exibeDados();

        AssistenteTecnico assistenteTecnico = new AssistenteTecnico("ryan",2000,9876,1);
        System.out.println("Dados do Assistente Tecnico");
        assistenteTecnico.exibeDados();

        Administrativo administrativo = new Administrativo("arthur", 250,654, 877,"noite");
        administrativo.exibeDados();
    }
}

