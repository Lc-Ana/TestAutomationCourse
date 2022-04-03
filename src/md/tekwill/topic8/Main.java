package md.tekwill.topic8;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String caleFisier = "C:\\Users\\Ana\\Desktop\\lectia5\\TestAutomationCourse\\src\\md\\tekwill\\topic8\\Text1.txt";

        String date001 = "Hello.";
        String date002 = " My name is Kim.";
        String date003 = " I am 24 yo..";

        FileManager.scriereaInformatieTextInFisier(caleFisier, date001); //primul text scris
        FileManager.alipireaInformatieiLaFisier(caleFisier, date002);//primul text alipit
        FileManager.alipireaInformatieiLaFisier(caleFisier, date003);//al doilea text alipit

        //citirea fisierului creat cu toata info care contine
        String continutFisierCitit = FileManager.citireDateDinFisier(caleFisier);
        System.out.println(continutFisierCitit);

        // file existent
        File fileManipulatCase1 = new File(caleFisier);
        if (!(fileManipulatCase1.exists())) {
            System.out.println("Acest fisier exista. Nume: " + fileManipulatCase1.getName());
        } else {
            System.out.println("Nu exista fisier.");
        }
        ;

        // file inexistent
        File fileManipulatCase2 = new File(caleFisier);
        if (fileManipulatCase2.exists()) {
            System.out.println("Acest fisier exista. Nume: " + fileManipulatCase2.getName());
        } else {
            System.out.println("Nu exista fisier.");
        }
        ;

        String caleNoua = "C:\\Users\\Ana\\Desktop\\lectia5\\TestAutomationCourse\\src\\md\\tekwill\\topic6";
        File fileManipulare = new File(caleNoua);

        if (fileManipulare.isFile()) {
            System.out.println("Aici este un fisier tip txt");
        } else {
            System.out.println("Aici nu este un fisier tip txt");
        }
        ;
        System.out.println(fileManipulare.setReadOnly());
        System.out.println(fileManipulare.canRead());
        System.out.println(fileManipulare.canWrite());
    }
}