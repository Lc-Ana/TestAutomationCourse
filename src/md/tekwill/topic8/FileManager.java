package md.tekwill.topic8;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager {

    static void scriereaInformatieTextInFisier(String caleaCatreFisier, String date) {
        try {
            FileWriter file1 = new FileWriter(caleaCatreFisier);
            file1.write(date);
            file1.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    ;

    static void alipireaInformatieiLaFisier(String caleaCatreFisier,String date) throws IOException {
        FileWriter adaugaText = new FileWriter(caleaCatreFisier, true);
        adaugaText.append(date);
        adaugaText.close();
    }

    ;

    static String citireDateDinFisier(String caleaCatreFisier) throws IOException {
        return Files.readString(Path.of(caleaCatreFisier));
    }

    ;

}