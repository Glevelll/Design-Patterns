public class SingularChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static SingularChocolateBoiler uniqueInstance;
    SingularChocolateBoiler() {
        empty = true;
        boiled = false;
    }
    public static SingularChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingularChocolateBoiler();
        }
        return uniqueInstance;
    }
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
// Заполнение нагревателя молочно-шоколадной смесью
        }
        System.out.println("Наполняем");
    }
    public void drain() {
        if (!isEmpty() && isBoiled()) {
// Слить нагретое молоко и шоколад
            empty = true;
        }
        System.out.println("Сливаем");
    }
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
// Довести содержимое до кипения
            boiled = true;
        }
        System.out.println("Кипятим");
    }
    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}

