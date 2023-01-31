package Part2;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnum implements Enumeration<Object> {
    Iterator<?> iterator;
    public IteratorEnum(Iterator<?> iterator) {
        this.iterator = iterator;
    }
    public boolean hasMoreElements() {
        return iterator.hasNext();
    }
    public Object nextElement() {
        return iterator.next();
    }
}
