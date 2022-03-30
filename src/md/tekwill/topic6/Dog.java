package md.tekwill.topic6;

public class Dog extends Animal {
    private boolean catTolerant;

    public Dog(int animalId, String name, int age, boolean catTolerant) {
        super(animalId, name, age);
        this.catTolerant = catTolerant;
    }

    public boolean isCatTolerant() {
        return catTolerant;
    }

    public void setCatTolerant(boolean catTolerant) {
        this.catTolerant = catTolerant;
    }

    @Override
    protected void setAgeCategory(int age) {
        if (age < 0 || age > 16) {
            System.out.println("Age error. Retry!");
        } else if (age >= 0 && age <= 1) {
            System.out.println("It's a puppy.");
        } else if (age >= 2 && age <= 9) {
            System.out.println("It's an adult.");
        } else if (age >= 10 && age <= 13) {
            System.out.println("It's a senior.");
        } else {
            System.out.println("It's a geriatric.");
        }
    }

    @Override
    protected void eats(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Monday", "Wednesday", "Saturday":
                System.out.println("Our dogs have 2 meals per day. Today are going to eat - Raw meat + dry dog food.");
                break;
            case "Tuesday", "Thursday":
                System.out.println("Our dogs have 2 meals per day. Today are going to eat - Bones + dry dog food.");
                break;
            case "Friday", "Sunday":
                System.out.println("Our dogs have 2 meals per day. Today are going to eat - wet + dry dog food.");
                break;
            default:
                System.out.println("Error. Try again!");
        }
    }

    @Override
    protected void makesSounds(String saySomething) {
        if (saySomething == getName()) {
            System.out.println(getName() + " comes to you and does not bark :) , because you know his name!");
        } else {
            System.out.println("The dog barks! Try to call it by its name.");
        }
    }
}
