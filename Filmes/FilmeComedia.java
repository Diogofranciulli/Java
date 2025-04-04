package Filmes;

public class FilmeComedia extends Filme{
    private String tipoHumor;
    private boolean engracado;

    public FilmeComedia(String titulo, String diretor, String tipoHumor, boolean engracado){
        super(titulo,diretor);
        this.tipoHumor = tipoHumor;
        this.engracado = engracado;
    }

    @Override
    protected void exibirInfo(){
        super.exibirInfo();
        System.out.println("O filme: " + titulo + " é engracado: " + engracado);
    }

    public void contarPiada(){
        System.out.println("Piada do filme: " +titulo+ " pq o tomate foi ao banco? para tirar extrato" );
    }
}
