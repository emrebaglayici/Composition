package Composition;

public class Coffee {
    CupSize cupsize;
    boolean hasSugar;
    boolean hasMilk;

    CoffeIngredient ingredient;

    public Coffee(CoffeIngredient ingredient, CupSize cupsize, boolean hasSugar, boolean hasMilk) {
        this.cupsize = cupsize;
        this.hasSugar = hasSugar;
        this.hasMilk = hasMilk;
        this.ingredient = ingredient;
    }



    double price(){
        double price=ingredient.basePrice();
        if(hasMilk)
            price+=2;
        if (hasSugar)
            price+=1;
        return price*cupsize.getPriceCoefficient();
    }

    String getDescription(){
        String desc=ingredient.coffeeName();
        if(hasSugar){
            desc+="with sugar";
        }
        if(hasMilk){
            desc+="with milk";
        }
        desc+=" "+cupsize.getDescription();
        desc+=" ["+price()+" TL]";
        return desc;
    }

    public static void main(String[] args) {
        Coffee tc=new Coffee(new TurkishCoffee(),CupSize.Large,true,false);
        Coffee es=new Coffee(new Espresso(),CupSize.Large,true,false);
        System.out.println(tc.getDescription());
        System.out.println(es.getDescription());
    }
}
