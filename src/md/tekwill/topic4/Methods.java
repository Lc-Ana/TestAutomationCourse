package md.tekwill.topic4;

public class Methods {
    public static int sum(int firstNr, int secondNr ){
        int sum = 0;
        if(firstNr>secondNr){
            System.out.println("Cannot return the sum because the first number is greater than the second number.");
            return sum;
        }else if(firstNr==secondNr) {
            System.out.println("Cannot return the sum because the first number is equal to the second number.");
            return firstNr;
        } else {
            for(int i = firstNr; i <= secondNr;i++){
                sum=sum+i;
            }
            System.out.println("Here is the finish of FOR function.");
        }
        return sum;
    }

    static void sum(double a){
        double sum = 0;
        if(a>0){
            while(a>0){
                sum = sum + a;
                a--;
            }
            System.out.println(sum);
            System.out.println("Here is the finish of WHILE function.");
        } else if(a==0){
            System.out.println("The sum is 0.");
        } else{
            System.out.println("The introduced value is negative. Please, introduce a positive one.");
        }
    }
}
