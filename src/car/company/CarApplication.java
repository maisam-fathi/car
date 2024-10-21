package car.company;

public class CarApplication {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.model = "Mercedes Benz";
        myCar.color = "Blue";
        myCar.speed = 0;
        myCar.targetSpeed = 60;
        myCar.fuelLevel = 10; //If the amount of fuel is less than 20%, the car will be taken to the gas station.
        myCar.carPositionX = 35;
        myCar.carPositionY = 28;

        myCar.showAttributes();

        myCar.speedSetting();

        myCar.brake();

        myCar.driveToGasStation();

    }
}
