package md.tekwill.topic6;

public class Cat extends Animal {
    private boolean huntsMice;

    public Cat(int animalId, String name, int age) {
        super(animalId, name, age);
    }

    public boolean getHuntsMice() {
        return huntsMice;
    }

    public void setHuntsMice(boolean huntsMice) {
        this.huntsMice = huntsMice;
    }

    @Override
    protected void setAgeCategory(int age) {
        if (age < 0 || age > 20) {
            System.out.println("Age error. Retry!");
        } else if (age >= 0 && age <= 1) {
            System.out.println("It's a kitten.");
        } else if (age >= 2 && age <= 3) {
            System.out.println("It's a junior.");
        } else if (age >= 4 && age <= 5) {
            System.out.println("It's an adult.");
        } else {
            System.out.println("It's a senior.");
        }
    }

    @Override
    protected void eats(String dayOfWeek) {
        switch (dayOfWeek) {
            case "Monday", "Friday":
                System.out.println("Our cats have 2 meals per day. Today are going to eat - Raw meat + dry cat food.");
                break;
            case "Tuesday", "Saturday":
                System.out.println("Our cats have 2 meals per day. Today are going to eat - Bones + dry cat food.");
                break;
            case "Wednesday":
                System.out.println("Our cats have 2 meals per day. Today are going to eat - Only dry cat food.");
                break;
            case "Thursday", "Sunday":
                System.out.println("Our cats have 2 meals per day. Today are going to eat - wet + dry cat food.");
                break;
            default:
                System.out.println("Error. Try again!");
        }

    }

    @Override
    protected void makesSounds(String saySomething) {
        if (saySomething == getName()) {
            System.out.println(getName() + " comes to you and meow:) , because you know its name!");
        } else if (saySomething == "I want to pet you") {
            System.out.println("The cat is purring, enjoys a lot. Keep doing that!");
        } else {
            System.out.println("Hisses, spits and runs away!");
        }
    }
}
