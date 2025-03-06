import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        while (true){
            System.out.println("digite sua frase: (PARE  para sair)");
            frase = sc.nextLine();
            if (frase.equalsIgnoreCase("PARE")){
                System.out.println("Programa encerrado");
                break;
            }
            System.out.println("Você digitou: "+ frase);
        }
    }
}