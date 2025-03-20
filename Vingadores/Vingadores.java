package Vingadores;

// Criação da Classe (Modelo) --- "Fábrica de objetos"

public class Vingadores{

    // Criação dos atributos( Caracteristícas /Propriedades do meu objeto)

    String nome;
    int idade;
    String armadura;
    double peso;
    double altura;

    //Métodos (Ações dos objetos) - Escrito no infinitivo (ar, er, ir)
    // Metodo void (não tem retorno numérico)

    void salvar(){
        System.out.println(Vingadores.this.nome+"está salvando as pessoas de NY");
    }

    void lutar(){
        System.out.println(Vingadores.this.nome +" está lutando");
    }

    void correr(){
        System.out.println(Vingadores.this.nome+"está correndo");
    }
}