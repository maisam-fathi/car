package car.company;

import java.util.Scanner;

public class CarApplication {

    public static void main(String[] args) {

        Car myCar = new Car();
        Scanner userInput = new Scanner(System.in);

        System.out.println("What is the car's model?");
        myCar.model = userInput.nextLine(); //For example: Mercedes Benz, BMW, VW and ...
        System.out.println("What is the car's color?");
        myCar.color = userInput.nextLine(); //For example blue, red, green and ...;
        System.out.println( "New car is registered.");
        myCar.showAttributes();

        System.out.println("What is the car's target speed?");
        myCar.targetSpeed = userInput.nextInt();
        myCar.speedSetting();

        myCar.brake();

        System.out.println("What is the car's fuel level in %?");
        myCar.fuelLevel = userInput.nextInt(); //If the amount of fuel is less than 20%, the car will be taken to the gas station.

        myCar.driveToGasStation();

    }
}
