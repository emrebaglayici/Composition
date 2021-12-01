package Composition;

public class TurkishCoffee implements CoffeIngredient{

    public double basePrice(){
        return 10;
    }
    public String coffeeName(){
        return "Turkish Coffee";
    }
}
