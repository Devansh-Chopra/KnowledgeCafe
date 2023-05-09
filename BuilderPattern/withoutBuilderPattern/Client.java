package withoutBuilderPattern;

public class Client {

    public static void main(String[] args) {

        Dog dog=new Dog()
                .setName("Bruno")
                .setBreed("Husky")
                .setGender("male");

        System.out.println(dog.getGender());

        dog.setGender("female");    //shouldn't work
        System.out.println(dog.getGender());


    }

}
