public class hw1{

    public static void main(String[] args) {
        DuckFake fakeduck = new DuckFake();
        fakeduck.fly();
        fakeduck.quack();
        fakeduck.display();
    }

    public interface FlyBehavior {
        public void fly();
    }
    public interface QuackBehavior {
        public void quack();
    }

    public static class FlyWithWings implements FlyBehavior {
        public void fly() {
            System.out.println("I’m flying!!");
        }
    }
    public static class FlyNoWay implements FlyBehavior {
        public void fly() {
            System.out.println("I can’t fly");
        }
    }
    public static class Quack implements QuackBehavior {
        public void quack() {
            System.out.println("Quack");
        }
    }
    public static class MuteQuack {
        public void quack(){
            System.out.println("<<Silence>>");
        }
    }
    public static class Squeak {
        public void quack() {
            System.out.println("Squeak");
        }
    }

    public static class DuckFake implements FlyBehavior,QuackBehavior {
        public DuckFake(){
            FlyNoWay flyBehavior = new FlyNoWay();
            Quack quackBehavior = new Quack();
        }
        public void fly() {
            System.out.println("I'm flying maybe");
        }
        public void quack() {
            System.out.println("Quack-quack");
        }
        public void display(){
            System.out.println("I'm a fake duck");
        }
    }

}






