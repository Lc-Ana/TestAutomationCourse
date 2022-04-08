package md.tekwill.topic9;

import java.util.ArrayList;

public class ServiciuStoc {
    public static void main(String[] args) {
        ArrayList<Stoc> stocList = new ArrayList<Stoc>();
        Stoc stocTraian = new Stoc(10001, "str. Traian");
        Stoc stocPuskin = new Stoc(10002, "str. Puskin");
        stocList.add(stocTraian);
        stocList.add(stocPuskin);


        Carte carteBabilon = new Carte("Cel mai bogat om din Babilon", "GEORGE S. CLASON",
                "456879", "359");
        Carte carteCafea = new Carte("Oamenii fericiti citesc si beau cafea", "Agnes Martin-Lugand",
                "457854", "245");
        Carte carteIubirea = new Carte("Iubirea te invata", "Irina Binder",
                "245789", "214");
        Carte carteInsomnii = new Carte("Insomnii", "Irina Binder",
                "456879", "359");
        Carte carteVerity = new Carte("Verity", "Colleen Hoover",
                "245765", "248");
        Carte carteMostenitrul = new Carte("Mostenitrul decazut", "Erin Watt",
                "231452", "542");
        Carte cartePalatul = new Carte("Palatul de hartie", "Erin Watt",
                "542125", "124");

        System.out.println("La moment sunt disponibile " + stocTraian.nrDeCartiInStoc() +
                " carti in stocul de pe strada " + stocTraian.getAdresaMagazin());

        stocTraian.adaugaCarteStoc(carteBabilon);
        stocTraian.adaugaCarteStoc(carteCafea);
        stocTraian.adaugaCarteStoc(carteIubirea);

        System.out.println("La moment sunt disponibile " + stocTraian.nrDeCartiInStoc() +
                " carti in stocul de pe starda " + stocTraian.getAdresaMagazin());

        stocTraian.stergeCarteDinStoc(carteIubirea);

        System.out.println("La moment sunt disponibile " + stocTraian.nrDeCartiInStoc() +
                " carti in stocul de pe starda " + stocTraian.getAdresaMagazin());

        System.out.println("Este " + carteIubirea + " in stocul de pe " + stocTraian.getAdresaMagazin()
                + " ?" + " Raspuns: " + stocTraian.existaCarteInStoc(carteIubirea));

        System.out.println("Este stocul gol de pe " + stocTraian.getAdresaMagazin() + " ?"
                + " Raspuns: " + stocTraian.esteStoculGol());

        stocTraian.stergeCarteDinStoc(carteCafea);
        stocTraian.stergeCarteDinStoc(carteBabilon);

        System.out.println("Este stocul gol de pe " + stocTraian.getAdresaMagazin() + " ?"
                + " Raspuns: " + stocTraian.esteStoculGol());

        System.out.println("\r");

        stocPuskin.adaugaCarteStoc(carteInsomnii);
        stocPuskin.adaugaCarteStoc(carteVerity);
        stocPuskin.adaugaCarteStoc(cartePalatul);
        stocPuskin.adaugaCarteStoc(carteMostenitrul);
        System.out.println("Carti in stoc: " + stocPuskin.nrDeCartiInStoc() + ". Stoc: " +
                stocPuskin.getAdresaMagazin());

        stocPuskin.stergeCarteDinStoc(carteVerity);
        stocPuskin.stergeCarteDinStoc(carteInsomnii);
        stocPuskin.stergeCarteDinStoc(cartePalatul);
        System.out.println("Carti in stoc: " + stocPuskin.nrDeCartiInStoc() + ". Stoc: " +
                stocPuskin.getAdresaMagazin());

        System.out.println("Este in stoc cartea: " + carteVerity.getTitlu() + "? " +
                "Raspuns: " + stocPuskin.existaCarteInStoc(carteVerity));
        System.out.println("Este stocul gol de pe " + stocPuskin.getAdresaMagazin() +
                "? Raspuns: " + stocPuskin.esteStoculGol());

        int totalRamase = stocTraian.nrDeCartiInStoc() + stocPuskin.nrDeCartiInStoc();
        System.out.println("Stocul de carti ramase in ambele stocuri: " + totalRamase);

        int totalVandute = stocTraian.nrCartiVandute() + stocPuskin.nrCartiVandute();
        System.out.println("Carti vandute din ambele stocuri : " + totalVandute);
        vDoCautaCartea(stocList, carteMostenitrul);
        vDoCautaCartea(stocList, carteVerity);
        vDoCautaCartea(stocList, carteCafea);

    }

    public static void vDoCautaCartea(ArrayList<Stoc> stocList, Carte CarteaDeCautat) {
        int counter = 0;
        System.out.println("Incep cautarea cartii: " + CarteaDeCautat.getTitlu());
        for (int i = 0; i < stocList.size(); i++) {
            Stoc stoctmp = stocList.get(i);
            if (stoctmp.cautaCartea(CarteaDeCautat) == true) {
                counter++;
                System.out.println("Cartea se afla in stock la adresa: " + stoctmp.getAdresaMagazin());
            }
        }
        if (counter == 0) {
            System.out.println("Sorry, nu am gasit cartea");
        }
        System.out.println("Am finisat Cautarea");
    }
}