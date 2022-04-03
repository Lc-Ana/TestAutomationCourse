package md.tekwill.topic7;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        AccountHolder ion = new AccountHolder("Ion", 195421);
        AccountHolder maria = new AccountHolder("Maria", 245210);

        ion.setCurrentSum(5000.0);
        maria.setCurrentSum(2000.0);

        ion.transferToPersonDataFileExceptionThrows("src\\md\\tekwill\\topic4\\Methods.java");
        ion.transferToPersonDataFileExceptionTryCatch("src\\md\\tekwill\\topic4\\Hello.java");

        System.out.println("Introduce the number of persons: ");
        Scanner scan = new Scanner(System.in);
        int numberOfPersons = scan.nextInt();
        System.out.println("The sold divided by " + numberOfPersons + " is " + ion.divideSold(numberOfPersons));

        if (ion.transferToPerson(maria, 1500.0)) {
            System.out.println("Successful transaction!");
        } else {
            System.out.println("Insufficient money, poor hoooman!");
        }

        System.out.println(ion.getPersonName() + "`s amount of money: " + ion.getCurrentSum());
        System.out.println(maria.getPersonName() + "`s amount of money: " + maria.getCurrentSum());

        if (ion.drawMoney(1000)) {
            System.out.println("Successful transaction!");
        } else {
            System.out.println("Insufficient money, poor hoooman!");
        }

        System.out.println(ion.getPersonName() + "`s amount of money: " + ion.getCurrentSum());
        System.out.println(maria.getPersonName() + "`s amount of money: " + maria.getCurrentSum());
    }
}