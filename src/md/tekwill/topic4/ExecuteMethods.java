package md.tekwill.topic4;

public class ExecuteMethods {
    public static void main(String[] args) {
        int result001 = Methods.sum(11,10);
        System.out.println(result001);
        int result002 = Methods.sum(10,10);
        System.out.println(result002);
        int result003 = Methods.sum(5,10);
        System.out.println(result003);

        Methods.sum(4.123654);
        Methods.sum(0);
        Methods.sum(-9);

        Person person001 = new Person("Frank", 6);
        person001.ageCategory();
        Person person002 = new Person("Katerina", 17);
        person002.ageCategory();
        Person person003 = new Person("Elisabeth", 35);
        person003.ageCategory();
        Person person004 = new Person("Max", 80);
        person004.ageCategory();
    }
}
