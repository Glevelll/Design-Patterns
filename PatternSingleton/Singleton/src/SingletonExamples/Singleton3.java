package SingletonExamples;

public class Singleton3 {
        private volatile static Singleton3 uniqueInstance;
        private Singleton3() {}
        public static Singleton3 getInstance() {
                if (uniqueInstance == null) {
                        synchronized (Singleton3.class) {
                                if (uniqueInstance == null) {
                                        uniqueInstance = new Singleton3();
                                }
                        }
                }
                return uniqueInstance;
        }
        //Ключевое слово volatile гарантирует, что параллельные про-
        //граммные потоки будут правильно работать с переменной
        //uniqueInstance при ее инициализации экземпляром Singleton.
}
