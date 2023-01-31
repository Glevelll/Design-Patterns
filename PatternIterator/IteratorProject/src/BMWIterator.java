import java.util.Iterator;
public class BMWIterator implements Iterator<SalonItem> {
    SalonItem[] items;
    int position = 0;
    public BMWIterator(SalonItem[] items) {
        this.items = items;
    }
    public SalonItem next() {
        SalonItem salonItem = items[position];
        position = position + 1;
        return salonItem;
    }
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
    public void remove() {
        throw new UnsupportedOperationException
                ("You shouldn't be trying to remove salon items.");
    }
}
