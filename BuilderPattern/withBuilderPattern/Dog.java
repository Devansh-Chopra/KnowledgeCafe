package withBuilderPattern;

public class Dog {

    private String name;
    private String gender; //immutable
    private String breed; //immutable
    private boolean isVaccinated;
    private int price;

    Dog(DogBuilder dog){
        this.name=dog.name;
        this.gender=dog.gender;
        this.isVaccinated=dog.isVaccinated;
        this.price=dog.price;
        this.breed=dog.breed;
    }

    static class DogBuilder{
        private String name;
        private String gender; //immutable
        private String breed; //immutable
        private boolean isVaccinated;
        private int price;


        Dog build(){
            return new Dog(this);
        }


        //Getters and Setters
        public String getBreed() {
            return breed;
        }

        public DogBuilder setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public String getName() {
            return name;
        }

        public DogBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public DogBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public boolean isVaccinated() {
            return isVaccinated;
        }

        public DogBuilder setVaccinated(boolean vaccinated) {
            isVaccinated = vaccinated;
            return this;
        }

        public int getPrice() {
            return price;
        }

        public DogBuilder setPrice(int price) {
            this.price = price;
            return this;
        }
    }

}
