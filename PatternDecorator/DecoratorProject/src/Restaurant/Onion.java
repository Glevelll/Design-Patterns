package Restaurant;

public class Onion extends Compound{
    Shawarma shawarma;
    public Onion(Shawarma shawarma) {
        this.shawarma = shawarma;
    }
    public String getName() {
        return shawarma.getName() +  " с луком";
    }
    public int cost() {
        return 10 + shawarma.cost();
    }
}
