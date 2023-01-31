import java.util.Iterator;

public class BMW implements Salon {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    SalonItem[] salonItems;
    public BMW() {
        salonItems = new SalonItem[MAX_ITEMS];
        addItem("BMW", "X5", 2009, 1200000);
        addItem("BMW", "Series 5", 2020, 3400000);
        addItem("BMW", "M5", 2019, 2800000);
        addItem("BMW", "X8", 2015, 3300000);
    }
    public void addItem(String name, String model, int year, int price)
    {
        SalonItem salonItem = new SalonItem(name, model, year, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, salon is full! Can’t add item to menu");
        } else {
            salonItems[numberOfItems] = salonItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    public Iterator createIterator() {
        return new BMWIterator(salonItems);
    }
}
