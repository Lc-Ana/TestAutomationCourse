package md.tekwill.topic3;

public class Operations {
    static void printArithmeticOperations(int a, int b){
        System.out.println("Arithmetic Operations:");
        int addOp = a+b;
        System.out.println("Addition: " + a + " + " + b + " = " + addOp);
        int subOp = a-b;
        System.out.println("Subtraction: " + a + " - " + b + " = " + subOp);
        int multOp = a*b;
        System.out.println("Multiplication: " + a + " * " + b + " = " + multOp);
        int divOp = a/b;
        System.out.println("Division: " + a + " / " + b + " = " + divOp);
        int modOp = a%b;
        System.out.println("Modulo Operation(remainder after division): " + a + " % " + b + " = " + modOp);
        int c = 7;
        ++c;
        int cPreIncremented = ++c;
        System.out.println("Pre-increment: ++7" + " = " + cPreIncremented);
        int d = 7;
        d++;
        int dPostIncremented = d++;
        System.out.println("Post-increment: 7++" + " = " + dPostIncremented);
        int e = 24;
        --e;
        int ePreDecremented = --e;
        System.out.println("Pre-decrement: --24" + " = " + ePreDecremented);
        int f = 24;
        f--;
        int fPostDecremented = f--;
        System.out.println("Post-decrement: 24--" + " = " + fPostDecremented);
        System.out.println("\r");
    };
    static void printLogicOperations(boolean a, boolean b){
        System.out.println("Logic Operations:");
        boolean resultOfAnd = a&&b;
        System.out.println(a + "&&" + b + "=" + resultOfAnd);
        boolean resultOfOr = a||b;
        System.out.println(a + "||" + b + "=" + resultOfOr);
        boolean resultOfNegation = !(a&&b);
        System.out.println("!(" + a + "&&" + b + ")" + "=" + resultOfNegation);
        System.out.println("\r");
    };
    static void printRelationalOperations(int a, int b){
        System.out.println("Relational Operations:");
        boolean resultLessThan = a<b;
        System.out.println(a + "<" + b + "=" + resultLessThan);
        boolean resultGreaterThan = a>b;
        System.out.println(a + ">" + b + "=" + resultGreaterThan);
        boolean resultLessThanOrEqualTo = a<=b;
        System.out.println(a + "<=" + b + "=" + resultLessThanOrEqualTo);
        boolean resultGreaterThanOrEqualTo = a>=b;
        System.out.println(a + ">=" + b + "=" + resultGreaterThanOrEqualTo);
        boolean resultNotEqualTo = a!=b;
        System.out.println(a + "!=" + b + "=" + resultNotEqualTo);
        boolean resultIsEqualTo = a==b;
        System.out.println(a + "==" + b + "=" + resultIsEqualTo);
        System.out.println("\r");
    };
    static void userForAndWhile(int a,int b){
//        Uncomment to run the code!
//        System.out.println("Function while :");
//        while (a<b){
//            a++;
//            System.out.println(a + " is less than " + b);
//        };
//        System.out.println("STOP! False condition!");

        System.out.println("Function for:");
        for(int i=1; i<5; i++){
            System.out.println("True condition!");
        };
        System.out.println("STOP! False condition!");
    };
};
