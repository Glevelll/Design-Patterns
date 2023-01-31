public class Main {
    public static void main(String[] args) {
        CakeBakery kaz = new KazanCakeBakery();
        CakeBakery mos = new MoscowCakeBakery();
        Cake cake = kaz.orderCake("cheese");
        System.out.println("Kazan type: " + cake.getName() + "\n");
        cake = mos.orderCake("cheese");
        System.out.println("Moscow type: " + cake.getName() + "\n");
    }
}