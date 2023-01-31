package Restaurant;

public class Cheese extends Compound{
    Shawarma shawarma;
    public Cheese(Shawarma shawarma) {
        this.shawarma = shawarma;
    }
    public String getName() {
        return shawarma.getName() +  " с сыром";
    }
    public int cost() {
        return 10 + shawarma.cost();
    }

}
