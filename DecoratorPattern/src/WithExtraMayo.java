package src;

public class WithExtraMayo implements BurgerDecorator{
    private Burger burger;

    WithExtraMayo(Burger burger){
        this.burger=burger;
    }

    @Override
    public int getCost() {
        return burger.getCost()+30;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+ " With Extra Mayo";
    }
}
