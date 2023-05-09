package withoutBuilderPattern;

public class Dog {

    private String name;
    private String gender; //immutable
    private String breed; //immutable
    private boolean isVaccinated;
    private int price;


    public String getName() {
        return name;
    }

    public Dog setName(String name) {
        this.name = name;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public Dog setGender(String gender) {
        if(this.gender==null){
            this.gender = gender;
        }
        return this;
    }

    public String getBreed() {
        return breed;
    }

    public Dog setBreed(String breed) {
        if(this.breed==null){
            this.breed = breed;
        }
        return this;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public Dog setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public Dog setPrice(int price) {
        this.price = price;
        return this;
    }
}