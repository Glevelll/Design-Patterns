public class Game {
    public static void main(String[] args) {
        Character king = new King();
        king.performWeapon();
        Character queen = new Queen();
        queen.performWeapon();
        Character knight = new Knight();
        knight.performWeapon();
        Character troll = new Troll();
        troll.performWeapon();
    }

    public interface WeaponBehavior {
        public void useWeapon();
    }
    public static class SwordBehavior implements WeaponBehavior {
        public void useWeapon() {
            System.out.println("*Sword kick*");
        }
    }
    public static class KnifeBehavior implements WeaponBehavior {
        public void useWeapon() {
            System.out.println("*Knife kick*");
        }
    }
    public static class BowAndArrowBehavior implements WeaponBehavior {
        public void useWeapon() {
            System.out.println("*Bow and arrow behavior kick*");
        }
    }
    public static class AxeBehavior implements WeaponBehavior {
        public void useWeapon() {
            System.out.println("*Axe kick*");
        }
    }
    public abstract static class Character {
        WeaponBehavior weaponBehavior;

        public Character() {
        }
        public abstract void display();
        public void performWeapon() {weaponBehavior.useWeapon();
        }
    }
    public static class King extends Character {
        public King() {
            weaponBehavior = new SwordBehavior();
        }
        public void display () {
            System.out.println("I’m a King!");
        }
    }

    public static class Queen extends Character {
        public Queen() {
            weaponBehavior = new BowAndArrowBehavior();
        }
        public void display () {
            System.out.println("I’m a Queen!");
        }
    }

    public static class Knight extends Character {
        public Knight() {
            weaponBehavior = new KnifeBehavior();
        }
        public void display () {
            System.out.println("I’m a Knight!");
        }
    }

    public static class Troll extends Character {
        public Troll() {
            weaponBehavior = new AxeBehavior();
        }
        public void display () {
            System.out.println("I’m a Troll!");
        }
    }
}
