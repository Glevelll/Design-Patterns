public abstract class CakeBakery {

    abstract Cake createCake(String item);

    public Cake orderCake(String type) {
        Cake cake = createCake(type);
        System.out.println("--- Making a " + cake.getName() + " ---");
        cake.prepare();
        cake.bake();
        cake.cook();
        cake.box();
        return cake;
    }
}
