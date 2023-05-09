package withBuilderPattern;

public class Client {
    public static void main(String[] args) {

        Dog dog= new Dog.DogBuilder()
                .setName("Bruno")
                .setBreed("Husky")
                .setPrice(2000)
                .setVaccinated(true)
                .build();

    }
}
