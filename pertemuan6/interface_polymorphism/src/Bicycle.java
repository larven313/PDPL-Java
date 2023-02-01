/**
 * Bicycle
 */
public class Bicycle implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed : " + speed + " gear : " + gear);
    }
}

/**
 * Bike
 */
class Bike implements Vehicle {

    int speed;
    int gear;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    public void applyBrakes(int decrement) {
        speed = speed - decrement;
    }

    public void printStates() {
        System.out.println("Speed : " + speed + " gear : " + gear);
    }

}

/**
 * GFG2
 */
class GFG2 {
    // creating an inheritance of Bicycle
    // doing some operations

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);

        System.out.println("Bicycle present state");
        bicycle.printStates();

        // creating instance of the bike
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);

        System.out.println("Bike present state");
        bike.printStates();
    }

}