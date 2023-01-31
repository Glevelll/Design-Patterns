public class t1 {
    public static void main(String[] args) {
        /*Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered()); //взлет
        model.performFly(); // Способность утки-приманки к полету переключается динамически*/
        Goose goose = new Goose();
        goose.performFly();
        goose.performQuack();
        goose.display();
    }

    public interface FlyBehavior {  // все
        public void fly();
    }

    public static class FlyWithWings implements FlyBehavior { // те, что умеют летать
        public void fly() {
            System.out.println("I’m flying!!");
        }
    }

    public static class FlyNoWay implements FlyBehavior { // те, что не умеют летать
        public void fly() {
            System.out.println("I can’t fly");
        }
    }

    public static class FlyRocketPowered implements FlyBehavior { // реактивный полет
        public void fly() {
            System.out.println("I’m flying with a rocket!");
        }
    }

    public interface QuackBehavior { // все
        public void quack();
    }

    public static class Quack implements QuackBehavior { // те, что могут крякать
        public void quack() {
            System.out.println("Quack");
        }
    }

    public static class Gogot implements QuackBehavior { // те, что могут гоготать
        public void quack() {
            System.out.println("Ga-ga-ga");
        }
    }

    public static class MuteQuack implements QuackBehavior { // те, что не могут крякать
        public void quack() {
            System.out.println("<< Silence >>");
        }
    }

    public static class Squeak implements QuackBehavior { // те, что пищат
        public void quack() {
            System.out.println("Squeak");
        }
    }

    public abstract static class Duck {
        FlyBehavior flyBehavior;
        QuackBehavior quackBehavior;

        public Duck() {
        }
        public abstract void display();
        public void performFly() {
            flyBehavior.fly();
        }

        public void performQuack() {
            quackBehavior.quack();
        }

        public void swim() {
            System.out.println("All ducks float, even decoys!");
        }
        public void setFlyBehavior(FlyBehavior fb) {
            flyBehavior = fb;
        }
        public void setQuackBehavior(QuackBehavior qb) {
            quackBehavior = qb;
        }
    }

    public static class MallardDuck extends Duck {
        public MallardDuck() {
            quackBehavior = new Quack();
            flyBehavior = new FlyWithWings();
        }
            public void display () {
                System.out.println("I’m a real Mallard duck");
            }
        }

    public static class ModelDuck extends Duck {
        public ModelDuck() {
            flyBehavior = new FlyNoWay();
            quackBehavior = new Quack();
        }
        public void display() {
            System.out.println("I’m a model duck");
        }
    }

    public static class Goose extends Duck {
        public Goose() {
            flyBehavior = new FlyWithWings();
            quackBehavior = new Gogot();
        }
        public void display() {
            System.out.println("I am a goose");
        }
    }
}
