package Part2;

import java.util.Enumeration;
import java.util.Iterator;

public class EnumerationIterator implements Iterator<Object> {
    Enumeration<?> enumeration;
    public EnumerationIterator(Enumeration<?> enumeration) { //Адаптируемый объект Enumeration сохраняется
        //в переменной (композиция).
        this.enumeration = enumeration;
    }
    public boolean hasNext() { //Метод hasNext() интерфейса Iterator
        //передает управление методу hasMoreElements() интерфейса Enumeration...
        return enumeration.hasMoreElements();
    }
    public Object next() { //...а метод next() интерфейса Iterator
        //передает управление методу nextElement().
        return enumeration.nextElement();
    }
    public void remove() { //К сожалению, поддержать метод remove() интерфейса Iterator не
        //удастся, поэтому мы просто выдаем исключение.
        throw new UnsupportedOperationException();
    }
}
