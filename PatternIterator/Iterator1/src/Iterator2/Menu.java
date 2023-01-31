package Iterator2;

import java.util.Iterator;
//Простой интерфейс
//с единственным методом,
//который возвращает клиентам
//итератор для элементов меню.
public interface Menu {
    public Iterator<MenuItem> createIterator();
}
