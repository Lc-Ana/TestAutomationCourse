package md.tekwill.topic6;

public class Goat extends Animal {

    private String woolType;

    public Goat(int animalId, int ageCategory) {
        super(animalId, ageCategory);
    }

    ;

    public String getWoolType() {
        return woolType;
    }

    public void setWoolType(String woolType) {
        this.woolType = woolType;
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
