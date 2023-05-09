package src;

public class WithExtraCheese implements BurgerDecorator{


    private Burger burger;

    WithExtraCheese(Burger burger){
        this.burger=burger;
    }

    @Override
    public int getCost() {
        return burger.getCost()+30;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+"With Extra Cheese";
    }
}
