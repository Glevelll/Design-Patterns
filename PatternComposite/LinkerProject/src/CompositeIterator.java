import java.util.*;

public class CompositeIterator implements Iterator<CatalogComponent> {
    Stack<Iterator<CatalogComponent>> stack = new Stack<Iterator<CatalogComponent>>();

    public CompositeIterator(Iterator<CatalogComponent> iterator) {
        stack.push(iterator);
    }

    public CatalogComponent next() {
        if (hasNext()) {
            Iterator<CatalogComponent> iterator = stack.peek();
            CatalogComponent component = iterator.next();
            stack.push(component.createIterator());
            return component;
        } else {
            return null;
        }
    }

    public boolean hasNext() {
        if (stack.empty()) {
            return false;
        } else {
            Iterator<CatalogComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }
}
