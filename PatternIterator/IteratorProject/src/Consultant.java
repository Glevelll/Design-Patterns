import java.util.Iterator;
public class Consultant {
    Salon mercedesItems;
    Salon BMWItems;

    public Consultant(Salon mercedesItems, Salon BMWItems) {
        this.mercedesItems = mercedesItems;
        this.BMWItems = BMWItems;
    }
    public void printCatalog() {
        Iterator<SalonItem> mercedesIterator = mercedesItems.createIterator();
        Iterator<SalonItem> BMWIterator = BMWItems.createIterator();
        System.out.println("Mercedes-Benz\n----\nCatalog");
        printCatalog(mercedesIterator);
        System.out.println("\nBMW Catalog");
        printCatalog(BMWIterator);
    }
    private void printCatalog(Iterator iterator) {
        while (iterator.hasNext()) {
            SalonItem salonItem = (SalonItem)iterator.next();
            System.out.print(salonItem.getName() + " ");
            System.out.print(salonItem.getModel() + " ");
            System.out.print(salonItem.getYear() + " -- ");
            System.out.println(salonItem.getPrice());
        }
    }
}

