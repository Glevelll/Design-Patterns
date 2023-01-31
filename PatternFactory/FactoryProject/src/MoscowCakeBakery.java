public class MoscowCakeBakery extends CakeBakery {

    Cake createCake(String item) {
        if (item.equals("cheese")) {
            return new MoscowCheeseCake();
        } else if (item.equals("chocolate")) {
            return new MoscowChocolateCake();
        } else if (item.equals("creamy")) {
            return new MoscowCreamyCake();
        } else return null;
    }
}
