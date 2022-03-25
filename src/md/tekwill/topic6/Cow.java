package md.tekwill.topic6;

public class Cow extends Animal {

    private boolean tractionAnimal;

    public Cow(int animalId, int ageCategory) {
        super(animalId, ageCategory);
    }

    public boolean isTractionAnimal() {
        return tractionAnimal;
    }

    public void setTractionAnimal(boolean tractionAnimal) {
        this.tractionAnimal = tractionAnimal;
    }


    @Override
    protected void eats() {

    }

    @Override
    protected void makesSounds() {

    }

    @Override
    protected void movement() {

    }

    @Override
    protected int numberOfAnimals() {
        return 0;
    }
}
