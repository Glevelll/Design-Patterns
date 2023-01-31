package Iterator1;

public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    //Возвращает след элемент и увеличивает позицию
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 1;
        return menuItem;
    }
    //Возвращает true если еще есть элементы для перебора
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            //Проверка на равенство след элемента null
            return false;
        } else {
            return true;
        }
    }
}
