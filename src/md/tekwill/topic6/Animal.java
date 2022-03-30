package md.tekwill.topic6;

enum gender {UNKNOWN, FEMALE, MALE}

enum provideProducts {UNKNOWN, YES, NO}

enum isPet {UNKNOWN, YES, NO}

enum vaccinated {UNKNOWN, YES, NO}

public abstract class Animal {
    public Animal(int animalId, String name, int age) {
        this.animalId = animalId;
        this.name = name;
        this.age = age;
    }

    ;

    private int animalId;
    private gender gender;
    private int age;
    private String name;
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

    public int getAge() {
        this.age = age;
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    public String getName() {
        this.name = name;
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected abstract void setAgeCategory(int age);

    protected abstract void eats(String dayOfWeek);

    protected abstract void makesSounds(String saySomething);




}
