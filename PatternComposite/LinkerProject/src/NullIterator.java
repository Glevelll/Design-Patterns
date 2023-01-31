import java.util.Iterator;

public class NullIterator implements Iterator<CatalogComponent> {

    public CatalogComponent next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}

