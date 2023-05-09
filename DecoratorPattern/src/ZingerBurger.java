package src;

public class ZingerBurger implements Burger{


    @Override
    public int getCost() {
        return 180;
    }

    @Override
    public String getDescription() {
        return "Zinger Burger";
    }
}
