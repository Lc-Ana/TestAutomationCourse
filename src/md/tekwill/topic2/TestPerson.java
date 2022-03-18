package md.tekwill.topic2;

public class TestPerson {
    public static void main(String[] args) {
        Person person001 = new Person(20, Person.Gender.Female);
        person001.setNameAndSurname("Veronica", "Micle");
        person001.weight = 47.5;

        Person person002 = new Person(30, Person.Gender.Male);
        person002.setNameAndSurname("Ion", "Creanga");
        person002.weight = 86.786;
    }
}
