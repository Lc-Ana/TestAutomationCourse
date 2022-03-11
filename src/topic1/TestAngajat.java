package topic1;

public class TestAngajat {
    public static void main(String[] args) {
        Angajat angajat1 = new Angajat("Ion", 25);
        Angajat angajat2 = new Angajat("Vasile", 26);
        Angajat angajat3 = new Angajat("Iulia", 27);

        angajat1.setSalariu(14000);
        angajat2.setSalariu(15000);
        angajat3.setSalariu(16000);

        angajat1.setGen("Masculin");
        angajat2.setGen("Masculin");
        angajat3.setGen("Feminin");

        System.out.println(angajat1.nume + ", " + angajat1.varsta + " ani, gen:" + angajat1.getGen() +
                            ", salariu: " + angajat1.getSalariu());
        System.out.println(angajat2.nume + ", " + angajat2.varsta + " ani, gen:" + angajat2.getGen() +
                            ", salariu: " + angajat2.getSalariu());
        System.out.println(angajat3.nume + ", " + angajat3.varsta + " ani, gen:" + angajat3.getGen() +
                            ", salariu: " + angajat3.getSalariu());

    }
}
