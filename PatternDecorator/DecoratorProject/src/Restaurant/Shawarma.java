package Restaurant;

public abstract class Shawarma {
    String name = "Пока без шаурмы";

    public String getName() {
        return name;
    }
    public abstract int cost();
}
