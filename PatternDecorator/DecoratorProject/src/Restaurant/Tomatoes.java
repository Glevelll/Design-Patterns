package Restaurant;

public class Tomatoes extends Compound{
    Shawarma shawarma;
    public Tomatoes(Shawarma shawarma) {
        this.shawarma = shawarma;
    }
    public String getName() {
        return shawarma.getName() +  " с помидорами";
    }
    public int cost() {
        return 5 + shawarma.cost();
    }

}

