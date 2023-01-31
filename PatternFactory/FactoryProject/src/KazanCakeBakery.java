public class KazanCakeBakery extends CakeBakery {

    Cake createCake(String item) {
        if (item.equals("cheese")) {
            return new KazanCheeseCake();
        } else if (item.equals("chocolate")) {
            return new KazanChocolateCake();
        } else if (item.equals("creamy")) {
            return new KazanCreamyCake();
        } else return null;
    }
}
