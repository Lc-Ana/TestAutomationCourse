package md.tekwill.topic7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AccountHolder {
    public AccountHolder(String personName, int id) {
        this.personName = personName;
        this.id = id;
    }

    private String personName;
    private int id;
    private double currentSum;

    public String getPersonName() {
        return personName;
    }

    public int getId() {
        return id;
    }

    public double getCurrentSum() {
        return currentSum;
    }

    public void setCurrentSum(double currentSum) {
        this.currentSum = currentSum;
    }

    public boolean drawMoney(double withdraw) {
        double dRemainigSoldLcl = 0.0;
        boolean bRetValLcl = false;
        if (withdraw <= getCurrentSum()) {
            dRemainigSoldLcl = getCurrentSum() - withdraw;
            setCurrentSum(dRemainigSoldLcl);
            bRetValLcl = true;
        } else {
            bRetValLcl = false;
        }
        return bRetValLcl;
    }

    ;

    public boolean transferToPerson(AccountHolder receiver, double amountOfMoney) {
        boolean bRetValLcl = false;
        if (this.drawMoney(amountOfMoney) == true) {
            receiver.supply(amountOfMoney);
            bRetValLcl = true;
        } else {
            bRetValLcl = false;
        }
        return bRetValLcl;
    }

    ;

    public void transferToPersonDataFileExceptionThrows(String directory) throws FileNotFoundException {
        File transfData = new File(directory);
        FileReader readTransfData = new FileReader(transfData);
    }

    ;

    public void transferToPersonDataFileExceptionTryCatch(String directory) {
        File transfData = new File(directory);
        try {
            FileReader readTransfData = new FileReader(transfData);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist. Verify and try again.");
            ;
        }
    }

    ;

    public double divideSold(int nrPerson) {
        int result = 0;
        try {
            result = (int) currentSum / nrPerson;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by 0. Retray!");
        }
        return result;
    }

    ;

    public boolean supply(double sumToAdd) {
        double amountOfMoneyLcl = 0.0;
        boolean bRetValLcl = false;
        if (sumToAdd > 0.0) {
            amountOfMoneyLcl = getCurrentSum() + sumToAdd;
            setCurrentSum(amountOfMoneyLcl);
            bRetValLcl = true;
        } else {
            bRetValLcl = false;
        }
        return bRetValLcl;
    }

    ;
}