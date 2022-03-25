package md.tekwill.topic6;

public class Cat extends Animal {
    private boolean huntsMice;

    public Cat(int animalId, int ageCategory) {
        super(animalId, ageCategory);
    }


    public boolean isHuntsMice() {
        return huntsMice;
    }

    public void setHuntsMice(boolean huntsMice) {
        this.huntsMice = huntsMice;
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
