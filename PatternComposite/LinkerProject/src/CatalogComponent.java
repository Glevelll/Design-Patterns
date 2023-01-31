import java.util.*;

public abstract class CatalogComponent {

    public void add(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(CatalogComponent catalogComponent) {
        throw new UnsupportedOperationException();
    }
    public CatalogComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    public String getName() {
        throw new UnsupportedOperationException();
    }
    public String getModel() {
        throw new UnsupportedOperationException();
    }
    public int getPrice() {
        throw new UnsupportedOperationException();
    }
    public int getYear() {
        throw new UnsupportedOperationException();
    }

    public abstract Iterator<CatalogComponent> createIterator();

    public void print() {
        throw new UnsupportedOperationException();
    }
}
