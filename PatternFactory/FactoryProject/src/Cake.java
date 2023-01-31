import java.util.ArrayList;
import java.util.List;

public abstract class Cake {
    String name;
    List<String> toppings = new ArrayList<String>();
    void prepare() {
        System.out.println("Готовится " + name);
        System.out.println("Добавки: ");
        for (String topping : toppings) {
            System.out.println(" " + topping);
        }
    }
    void bake() {
        System.out.println("Baking");
    }
    void cook() {
        System.out.println("Cooking");
    }
    void box() {
        System.out.println("Boxing");
    }
    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        for (String topping : toppings) {
            display.append(topping + "\n");
        }
        return display.toString();
    }
}
