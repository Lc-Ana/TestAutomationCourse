package md.tekwill.topic6;

public class Cow extends Animal {

    private boolean tractionAnimal;

    public Cow(int animalId, String name, int age) {
        super(animalId, name, age);
    }

    public boolean getTractionAnimal() {
        return tractionAnimal;
    }

    public void setTractionAnimal(boolean tractionAnimal) {
        this.tractionAnimal = tractionAnimal;
    }

    @Override
    protected void setAgeCategory(int age) {
        if (age < 0 || age > 20) {
            System.out.println("Age error. Retry!");
        } else if (age >= 0 && age <= 3) {
            System.out.println("It's a junior.");
        } else if (age >= 4 && age <= 6) {
            System.out.println("It's an adult.");
        } else if (age >= 7 && age <= 10) {
            System.out.println("It's a senior.");
        } else {
            System.out.println("It's a geriatric.");
        }
    }

    @Override
    protected void eats(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Monday", "Wednesday", "Friday", "Sunday":
                System.out.println("Our cows have 2 meals per day. Today are going to eat - Grass  + almond hulls.");
                break;
            case "Tuesday", "Thursday", "Saturday":
                System.out.println("Our cows have 2 meals per day. Today are going to eat - Grain + canola meal.");
                break;
            default:
                System.out.println("Error. Try again!");
        }
    }

    @Override
    protected void makesSounds(String saySomething) {
        if (saySomething == "Hello") {
            System.out.println("The cow does: low or moo.");
        } else {
            System.out.println("The cow runs away. Try to say Hello.");
        }
    }
}
