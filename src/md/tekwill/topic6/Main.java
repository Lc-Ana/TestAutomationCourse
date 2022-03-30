package md.tekwill.topic6;

public class Main {
    public static void main(String[] args) {
        Dog dog001 = new Dog(1, "Rex", 12, true);
        System.out.print(dog001.getName() + ". His age category: ");
        dog001.setAgeCategory(12);
        dog001.eats("Tuesday");
        dog001.makesSounds("Hello!");
        dog001.setGender(gender.MALE);
        dog001.setIsPet(isPet.YES);
        dog001.setProvideProducts(provideProducts.NO);
        dog001.setVaccinated(vaccinated.YES);
        System.out.println("Other details about this dog: " + "gender? " + dog001.getGender() + ", is a pet? "
                           + dog001.getIsPet() + ", provides products? " + dog001.getProvideProducts() + ", is it vaccinated? "
                           + dog001.getVaccinated());

        Dog dog002 = new Dog(5, "Kim", 2, true);
        dog002.makesSounds("Hello");
        dog002.eats("Sunday");

        Cat cat001 = new Cat(2, "Mia", 3);
        String catName = cat001.getName();
        System.out.print(catName + " has " + cat001.getAge() + " years old. So let's see her age category: ");
        cat001.setAgeCategory(3);
        cat001.eats("Sunday");
        cat001.makesSounds("Hello!");
        cat001.setGender(gender.FEMALE);
        cat001.setIsPet(isPet.YES);
        cat001.setProvideProducts(provideProducts.NO);
        cat001.setVaccinated(vaccinated.YES);
        cat001.setHuntsMice(false);
        System.out.println("Other details about this cat: " + "gender? " + cat001.getGender() + ", is a pet? "
                + cat001.getIsPet() + ", provides products? " + cat001.getProvideProducts() + ", is it vaccinated? "
                + cat001.getVaccinated() + ", hunts mice? " + cat001.getHuntsMice());

        Goat goat001 = new Goat(3, "Sofia", 15);
        System.out.print(goat001.getName() + ". Let's see her age category: " );
        goat001.setAgeCategory(15);
        goat001.eats("Monday");
        goat001.makesSounds("Hello!");
        goat001.setGender(gender.FEMALE);
        goat001.setIsPet(isPet.NO);
        goat001.setProvideProducts(provideProducts.YES);
        goat001.setVaccinated(vaccinated.YES);
        goat001.setWoolType("cashmere");
        System.out.println("Other details about this goat: " + "gender? " + goat001.getGender() + ", is a pet? "
                + goat001.getIsPet() + ", provides products? " + goat001.getProvideProducts() + ", is it vaccinated? "
                + goat001.getVaccinated() + ", the type of wool provided: " + goat001.getWoolType());

        Cow cow001 = new Cow(4,"Joy", 6);
        System.out.print(cow001.getName() + ". Let's see her age category: " );
        cow001.setAgeCategory(6);
        cow001.eats("Wednesday");
        cow001.makesSounds("Hello!");
        cow001.setGender(gender.MALE);
        cow001.setIsPet(isPet.NO);
        cow001.setProvideProducts(provideProducts.YES);
        cow001.setVaccinated(vaccinated.YES);
        cow001.setTractionAnimal(false);
        System.out.println("Other details about this goat: " + "gender? " + cow001.getGender() + ", is a pet? "
                + cow001.getIsPet() + ", provides products? " + cow001.getProvideProducts() + ", is it vaccinated? "
                + cow001.getVaccinated() + ", is a traction animal? " + cow001.getTractionAnimal());
    }
}
