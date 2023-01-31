import java.util.Iterator;

import java.util.ArrayList;
import java.util.List;

public class Mercedes implements Salon {
    List<SalonItem> salonItems;
    public Mercedes() {
        salonItems = new ArrayList<SalonItem>();
        addItem("Mercedes", "S-Class", 2022, 5300000);
        addItem("Mercedes", "A-Class", 2020, 4300000);
        addItem("Mercedes", "G-Class", 2018, 7500000);
        addItem("Mercedes", "E-Class", 2019, 3400000);
    }
    public void addItem(String name, String model, int year, int price)
    {
        SalonItem salonItem = new SalonItem(name, model, year, price);
        salonItems.add(salonItem);
    }
    public Iterator<SalonItem> createIterator() {
        return salonItems.iterator();
    }
}
