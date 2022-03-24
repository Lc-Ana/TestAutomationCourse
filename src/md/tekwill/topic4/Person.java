package md.tekwill.topic4;

public class Person {
    String name;
    int age;

    public Person(String nameAttribute, int ageAttribute){
        name = nameAttribute;
        age = ageAttribute;
    }

    public void ageCategory(){
        if(age>=5 && age<=13){
            System.out.println( name + " is a child.");
        }else if(age>=14 && age<=18){
            System.out.println(name + " is a teenager.");
        }else if(age>=19 && age<=54){
            System.out.println(name + " is an adult.");
        }else{
            System.out.println(name + " is an elderly.");
        }
    };
}
