
public class Main {
 
    public static void main(String[] args) {

        Car myCar = new Car("Toyota", 2022, 4);

        myCar.describe();
        myCar.showTypes();

        myCar.accelerate(20);
        System.out.println("Speed: " + myCar.getSpeed());

        System.out.println();

        ElectricCar myElectricCar =
                new ElectricCar("Tesla", 2024, 4, 100);

        myElectricCar.describe();
        myElectricCar.showTypes();

        myElectricCar.accelerate(30);
        System.out.println("Speed: " + myElectricCar.getSpeed());
        System.out.println("Battery: "
                + myElectricCar.getBatteryLevel() + "%");

        System.out.println();

        myCar.setSpeed(-5);
        myCar.setDoors(3);

        // myCar.speed = 50;
        // This causes an error because speed is private.
    }
}

