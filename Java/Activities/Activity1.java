package activities;

public class Activity1 extends Car {
    public static void main(String args[]) {
        Car car1 = new Car();
        car1.make = 2017;
        car1.color = "Grey";
        car1.transmission = "Automatic";

        car1.displayCharacterstics();
        car1.accelerate();
        car1.brake();
    }

}
