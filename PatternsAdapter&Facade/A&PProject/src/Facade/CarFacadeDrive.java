package Facade;

public class CarFacadeDrive {
    public static void main(String[] args) {
        Lights lights = new Lights();
        Music music = new Music();
        Windows windows = new Windows();
        Conditioner conditioner = new Conditioner();
        Eco eco = new Eco();
        CarFacade car = new CarFacade(lights, music, conditioner, windows, eco);
        car.getInTheCar();
        System.out.println("*Поездка*");
        car.getOutOfTheCar();
    }
}
