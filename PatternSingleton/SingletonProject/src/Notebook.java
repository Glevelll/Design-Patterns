public class Notebook {
    private boolean empty;
    private boolean write;
    private boolean delete;
    private static Notebook uniqueInstance;
    Notebook() {
        empty = true;
        write = false;
        delete = false;
    }
    public static Notebook getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Notebook();
        }
        return uniqueInstance;
    }
    public void create() {
        if (isEmpty()) {
            empty = false;
            write = false;
        }
        System.out.println("Создаем запись");
    }
    public void remove() {
        if (!isEmpty() && isDelete()) {
            empty = true;
        }
        System.out.println("Удаляем");
    }
    public void writing() {
        if (!isEmpty() && !isWrite()) {
            write = true;
        }
        System.out.println("Записываем");
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isWrite() {
        return write;
    }
    public boolean isDelete() {
        return delete;
    }
}

