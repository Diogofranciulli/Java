package Filmes;

public class FilmeTerror extends Filme {
    private int anoLancamento;
    private String tipoCategoria;

    public FilmeTerror(String titulo, String diretor, int anoLancamento, String tipoCategoria){
        super(titulo,diretor);
        this.anoLancamento = anoLancamento;
        this.tipoCategoria = tipoCategoria;
    }
    @Override
    protected void exibirInfo(){
        super.exibirInfo();
        System.out.println("O filme: " + titulo + " teve seu ano de lançamento em "+ anoLancamento + " e é  do tipo: " + tipoCategoria + "👾");

    }
    public void Fraseiconica(){
        System.out.println("frase do filme: " +titulo+ " eu sei que nada sei" );

    }
}
