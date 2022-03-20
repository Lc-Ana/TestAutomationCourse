package md.tekwill.topic1;

public class Angajat {
    String nume;
    int varsta;
    double salariu;
    String gen;

    public Angajat (String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public String getGen() {
        return gen;
    }
}
