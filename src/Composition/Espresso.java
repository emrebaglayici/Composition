package Composition;

public class Espresso  implements CoffeIngredient{
    public double basePrice(){
        return 20;
    }
    public String coffeeName(){
        return "Espresso";
    }
}
