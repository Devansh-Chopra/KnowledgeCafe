package src;

public class Client {

    public static void main(String[] args) {

        Burger burger=new ZingerBurger();
        System.out.println(burger.getDescription()+" "+burger.getCost());
        burger= new WithExtraCheese(burger);
        System.out.println(burger.getDescription()+" "+burger.getCost());
        burger=new WithExtraMayo(burger);
        System.out.println(burger.getDescription()+" "+burger.getCost());

    }


}
