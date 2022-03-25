package md.tekwill.topic6;

enum gender {UNKNOWN, FEMALE, MALE}

enum provideProducts {UNKNOWN, YES, NO}

enum isPet {UNKNOWN, YES, NO}

enum vaccinated {UNKNOWN, YES, NO}

public abstract class Animal {
    public Animal(int animalId, int ageCategory) {
        this.animalId = animalId;
        this.ageCategory = ageCategory;
    }

    ;

    private int animalId;
    private gender gender;
    private int ageCategory;
    private provideProducts provideProducts;
    private isPet isPet;
    private vaccinated vaccinated;

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public md.tekwill.topic6.gender getGender() {
        return gender;
    }

    public void setGender(md.tekwill.topic6.gender gender) {
        this.gender = gender;
    }

    public int getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(int ageCategory) {
        this.ageCategory = ageCategory;
    }

    public md.tekwill.topic6.provideProducts getProvideProducts() {
        return provideProducts;
    }

    public void setProvideProducts(md.tekwill.topic6.provideProducts provideProducts) {
        this.provideProducts = provideProducts;
    }

    public md.tekwill.topic6.isPet getIsPet() {
        return isPet;
    }

    public void setIsPet(md.tekwill.topic6.isPet isPet) {
        this.isPet = isPet;
    }

    public md.tekwill.topic6.vaccinated getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(md.tekwill.topic6.vaccinated vaccinated) {
        this.vaccinated = vaccinated;
    }

    protected abstract void eats();

    protected abstract void makesSounds();

    protected abstract void movement();

    protected abstract int numberOfAnimals();


}
