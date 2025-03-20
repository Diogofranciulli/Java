package Vingadores;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Você quer cadastrar um Vilão (V) ou um Heroi(H)");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("v")){
                System.out.println("você quer cadastrar um vilao");
            }else if (opcao.equalsIgnoreCase("h")){
                System.out.println("você quer cadastrar um heroi");
            }else{
                System.out.println("escolha entre Vilão(V) OU Heroi(H)");
            }
        }
    }
}
