package md.tekwill.topic9;

public class Carte {
    public Carte(String titlu, String autor, String numarDeSerie, String pagini) {
        this.titlu = titlu;
        this.autor = autor;
        this.numarDeSerie = numarDeSerie;
        this.pagini = pagini;
    }

    private String titlu;
    private String autor;
    private String numarDeSerie;
    private String pagini;

    public String getTitlu() {
        return titlu;
    }

    @Override
    public String toString() {
        return "Carte(" + titlu + '\'' +
                autor + '\'' +
                ')';
    }
}