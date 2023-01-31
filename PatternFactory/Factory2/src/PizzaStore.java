public abstract class PizzaStore {

    abstract PizzaCorp.Pizza createPizza(String item);

    public PizzaCorp.Pizza orderPizza(String type) {
        //Метод createPizza снова принадлежит PizzaStore, а не классу фабрики.
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
