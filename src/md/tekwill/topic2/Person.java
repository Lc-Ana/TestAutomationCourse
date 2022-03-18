package md.tekwill.topic2;

public class Person {

    public Person (int ageAttribute, Gender genderAttribute){
        age = ageAttribute;
        gender = genderAttribute;

    }

    public enum Gender {
        Unknown, Male, Female
    }

    private String name;
    private String surname;
    protected int age;
    public Gender gender;
    public double weight;

    void setNameAndSurname(String name, String surname){
        String nameAndSurname = ("This is the name and surname of the person: " + name + " " +
                            surname + "!\n" + "This is the " + name + "'s age: " + age +
                            ", and this is the gender: " + gender + ".");
        System.out.println(nameAndSurname);
    }

}
