import java.util.Iterator;
import java.util.ArrayList;

public class Salon extends CatalogComponent {
    Iterator<CatalogComponent> iterator = null;
    ArrayList<CatalogComponent> catalogComponents = new ArrayList<CatalogComponent>();
    String name;

    public Salon(String name) {
        this.name = name;
    }

    public void add(CatalogComponent catalogComponent) {
        catalogComponents.add(catalogComponent);
    }

    public void remove(CatalogComponent catalogComponent) {
        catalogComponents.remove(catalogComponent);
    }

    public CatalogComponent getChild(int i) {
        return catalogComponents.get(i);
    }

    public String getName() {
        return name;
    }


    public Iterator<CatalogComponent> createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(catalogComponents.iterator());
        }
        return iterator;
    }


    public void print() {
        System.out.println("\n" + getName());

        Iterator<CatalogComponent> iterator = catalogComponents.iterator();
        while (iterator.hasNext()) {
            CatalogComponent menuComponent = iterator.next();
            menuComponent.print();
        }
    }
}

