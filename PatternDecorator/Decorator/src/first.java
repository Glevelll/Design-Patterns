public class first {
    public static void main(String[] args) {

    }
    public static abstract class Beverage {
        String description = "Unknown Beverage";

        public String getDescription() {
            return description;
        }
        public abstract double cost();
    }
    public static class EspressoWithWhipandMocha extends Beverage {

        public EspressoWithWhipandMocha() {
            description = "Espresso with whip and mocha";
        }

        public double cost() {
            return 2.19;
        }
    }
    public static class HouseBlendWithWhip extends Beverage {

        public HouseBlendWithWhip() {
            description = "House blend with whip";
        }

        public double cost() {
            return 0.90;
        }
    }
    public static class DarkRoastWithWhipAndSoy extends Beverage {

        public DarkRoastWithWhipAndSoy() {
            description = "Dark roast with whip and soy";
        }

        public double cost() {
            return 1.24;
        }
    }
}
