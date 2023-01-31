import java.util.Iterator;

public class SalonItem extends CatalogComponent {

    String name;
    String model;
    int year;
    int price;

    public SalonItem(String name,
                    String model,
                    int year,
                    int price)
    {
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public Iterator<CatalogComponent> createIterator() {
        return new NullIterator();
    }

    public void print() {
        System.out.print("  " + getName());
        System.out.print("  " + getModel());
        System.out.println(", " + getYear());
        System.out.println("  " + getPrice());
    }

}

