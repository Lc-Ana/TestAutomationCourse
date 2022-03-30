package md.tekwill.topic6;

public class Goat extends Animal {

    private String woolType; //mohair, cashmere, etc

    public Goat(int animalId, String name, int age) {
        super(animalId, name, age);
    }

    ;

    public String getWoolType() {
        return woolType;
    }

    public void setWoolType(String woolType) {
        this.woolType = woolType;
    }

    @Override
    protected void setAgeCategory(int age) {
        if (age < 0 || age > 18) {
            System.out.println("Age error. Retry!");
        } else if (age >= 0 && age <= 2) {
            System.out.println("It's a kid.");
        } else if (age >= 3 && age <= 5) {
            System.out.println("It's a adolescent.");
        } else if (age >= 6 && age <= 10) {
            System.out.println("It's an adult.");
        } else {
            System.out.println("It's a senior.");
        }
    }

    @Override
    protected void eats(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Monday", "Wednesday", "Saturday":
                System.out.println("Our goats have 2 meals per day. Today are going to eat - Chaffhaye + Minerals.");
                break;
            case "Tuesday", "Thursday":
                System.out.println("Our goats have 2 meals per day. Today are going to eat - Grain Feed + Minerals.");
                break;
            case "Friday", "Sunday":
                System.out.println("Our goats have 2 meals per day. Today are going to eat - Kitchen and Garden Scraps  ");
                break;
            default:
                System.out.println("Error. Try again!");
        }
    }

    @Override
    protected void makesSounds(String saySomething) {
        if (saySomething == "Hello") {
            System.out.println("The goat does: bleat or maa.");
        } else {
            System.out.println("The goat runs away. Try to say Hello.");
        }

    }
}
