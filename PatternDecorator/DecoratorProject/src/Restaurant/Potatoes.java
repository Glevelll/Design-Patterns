package Restaurant;

public class Potatoes extends Compound{
    Shawarma shawarma;
    public Potatoes(Shawarma shawarma) {
        this.shawarma = shawarma;
    }
    public String getName() {
        return shawarma.getName() +  " с картошкой";
    }
    public int cost() {
        return 5 + shawarma.cost();
    }

}
