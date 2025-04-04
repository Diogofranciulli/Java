package Filmes;

public class TestaFilme {
    public static void main(String[] args) {
        FilmeTerror filme1 = new FilmeTerror("Centopeia Humana", "Mark Zukenberg", 2009, "Gore");

        FilmeComedia filme2 = new FilmeComedia("American Pie", "Joe Biden", "besteirol", true);

        System.out.println("filmes antes da avaliacao");
        filme1.exibirInfo();
        filme2.exibirInfo();


        System.out.println("avaliando filme");
        filme1.avaliarFilme(2.0);
        filme2.avaliarFilme(4.6);

        System.out.println("apos avaliacao");
        filme1.exibirInfo();
        filme1.Fraseiconica();

        filme2.exibirInfo();
        filme2.contarPiada();
    }
}
