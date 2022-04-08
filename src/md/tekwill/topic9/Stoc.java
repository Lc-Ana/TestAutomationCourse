package md.tekwill.topic9;

import java.util.ArrayList;
import java.util.List;

public class Stoc {
    public Stoc(int stocId, String adresaMagazin) {
        this.stocId = stocId;
        this.adresaMagazin = adresaMagazin;
        this.cartileDinStoc = new ArrayList<>();
        this.nrDeCartiVandute = 0;
    }

    private int stocId;
    private String adresaMagazin;
    List<Carte> cartileDinStoc = new ArrayList<>();
    private int nrDeCartiVandute;

    public String getAdresaMagazin() {
        return adresaMagazin;
    }

    public void adaugaCarteStoc(Carte carteAdaugata) {
        this.cartileDinStoc.add(carteAdaugata);
        System.out.println(carteAdaugata.toString() + " - a fost adaugata cu succes.");
    }

    ;

    public void stergeCarteDinStoc(Carte carteDeStears) {
        boolean carteaStearsa = this.cartileDinStoc.remove(carteDeStears);
        if (carteaStearsa) {
            System.out.println(carteDeStears.toString() + " a fost stearsa din stoc");
            this.nrDeCartiVandute++;
        } else {
            System.out.println("Nu s-a sters cartea ");
        }
        ;
    }

    ;

    public boolean existaCarteInStoc(Carte carteaCautata) {
        return this.cartileDinStoc.contains(carteaCautata);
    }

    ;

    public int nrDeCartiInStoc() {
        return this.cartileDinStoc.size();
    }

    ;

    public boolean esteStoculGol() {
        return cartileDinStoc.isEmpty();
    }

    ;

    public int nrCartiVandute() {

        return this.nrDeCartiVandute;
    }

    ;

    public boolean cautaCartea(Carte carteaCautata) {
        boolean bRetVal = false;
        if (cartileDinStoc.contains(carteaCautata)) {
            bRetVal = true;
//            System.out.println("Cartea o gasesti in stocul: " + getAdresaMagazin());
        } else {
            bRetVal = false;
//            System.out.println("Cartea nu-i in stock pe " + getAdresaMagazin());
        }
        ;
        return bRetVal;
    }

    ;

}