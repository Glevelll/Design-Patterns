public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    public ChocolateBoiler() { //Код выполняется только при пустом нагревателе!
        empty = true;
        boiled = false;
    }
    public void fill() { //Перед наполнением мы проверяем,что нагреватель пуст, а после
        //наполнения устанавливаем флаги empty и boiled.
        if (isEmpty()) {
            empty = false;
            boiled = false;
// Заполнение нагревателя молочно-шоколадной смесью
        }
        System.out.println("Наполняем");
    }
    public void drain() { //Чтобы слить содержимое, мы проверяем, что нагреватель не пуст, а смесь доведена
        // до кипения. После слива флагу empty снова присваивается true.
        if (!isEmpty() && isBoiled()) {
// Слить нагретое молоко и шоколад
            empty = true;
        }
        System.out.println("Сливаем");
    }
    public void boil() { //Чтобы вскипятить смесь, мы проверяем, что нагреватель полон, но еще не нагрет.
        // Посленагревания флагу boiled присваивается true.
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
