package SingletonExamples;

public class Singleton2 {
        private static Singleton2 uniqueInstance;

        // Другие письменные экземпляры
        private Singleton2() {
        }

        public static synchronized Singleton2 getInstance() { //Включая в объявление getInstance() ключевое слово
            //synchronized, мы заставляем каждый поток дождаться своей очереди для входа в него. Иначе
            //говоря, два потока не смогут войти в метод одновременно.
            if (uniqueInstance == null) {
                uniqueInstance = new Singleton2();
            }
            return uniqueInstance;
        }
// Синхронизация полезна только один раз, при первом обращении к getInstance(),
        //после этого каждый раз, при обращении этому методу, синхронизация просто забирает время
}

