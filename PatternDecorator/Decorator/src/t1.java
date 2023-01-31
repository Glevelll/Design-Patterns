public class t1 {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());
        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
    public static abstract class Beverage {
        String description = "Unknown Beverage";

        public String getDescription() {
            return description;
        }
        public abstract double cost();
    }
    public static abstract class CondimentDecorator extends Beverage {
        public abstract String getDescription();
    }
    //Кофе
    public static class Espresso extends Beverage {

        public Espresso() {
            description = "Espresso";
        }

        public double cost() {
            return 1.99;
        }
    }
    public static class HouseBlend extends Beverage {
        public HouseBlend() {
            description = "House Blend Coffee";
        }
        public double cost() {
            return 0.89;
        }
    }
    public static class DarkRoast extends Beverage {
        public DarkRoast() {
            description = "Dark Roast";
        }
        public double cost() {
            return 0.99;
        }
    }
    public static class Decaf extends Beverage {
        public Decaf() {
            description = "Decaf";
        }
        public double cost() {
            return 1.05;
        }
    }
    //Декораторы (дополнения)
    public static class Mocha extends CondimentDecorator {
        Beverage beverage;
        public Mocha(Beverage beverage) {
            this.beverage = beverage;
        }
        public String getDescription() {
            return beverage.getDescription() +  ", Mocha";
        }
        public double cost() {
            return 0.20 + beverage.cost();
        }
    }
    public static class Soy extends CondimentDecorator {
        Beverage beverage;
        public Soy(Beverage beverage) {
            this.beverage = beverage;
        }
        public String getDescription() {
            return beverage.getDescription() + ", Soy";
        }
        public double cost() {
            return 0.15 + beverage.cost();
        }
    }
    public static class Whip extends CondimentDecorator {
        Beverage beverage;
        public Whip(Beverage beverage) {
            this.beverage = beverage;
        }
        public String getDescription() {
            return beverage.getDescription() + ", Whip";
        }
        public double cost() {
            return 0.10 + beverage.cost();
        }
    }
}
