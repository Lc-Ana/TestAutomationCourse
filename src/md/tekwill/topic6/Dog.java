package md.tekwill.topic6;

public class Dog extends Animal {
    private boolean catTolerant;

    public Dog(int animalId, int ageCategory,boolean catTolerant ) {
        super(animalId,ageCategory);
        this.catTolerant = catTolerant;
    }


    public boolean isCatTolerant() {
        return catTolerant;
    }

    public void setCatTolerant(boolean catTolerant) {
        this.catTolerant = catTolerant;
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
