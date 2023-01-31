package SingletonExamples;

public class Singleton1 {
    private static Singleton1 uniqueInstance; //Статическая переменная для хранения
    //единственного экземпляра
// Другие письменные экземпляры
    private Singleton1() {
    } //Приватный конструктор; только Singleton может создавать

    //экземпляры этого класса
    public static Singleton1 getInstance() { //Метод getInstance() создает и возвращает экземпляр.
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton1();
        }
        return uniqueInstance;
    }
// не работает в многопоточной среде и поэтому не подходит в большинстве случаев.
}

