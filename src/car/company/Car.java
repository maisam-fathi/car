package car.company;

import java.util.Random;

public class Car {

        Random random = new Random();
        String model;
        String color;
        int carPositionX = random.nextInt();
        int carPositionY = random.nextInt();
        final int gasStationPositionX = 55449966;
        final int gasStationPositionY = 55881144;
        int speed = random.nextInt(350);
        int targetSpeed;
        int fuelLevel = random.nextInt(100);

        void showAttributes() {
                System.out.println("************************");
                System.out.println("Model:\t\t\t||\t" + model);
                System.out.println("Color:\t\t\t||\t" + color);
                System.out.println("Speed:\t\t\t||\t" + speed + " km/h");
                System.out.println("Target speed:\t||\t" + targetSpeed + " km/h");
                System.out.println("Fuel level:\t\t||\t" + fuelLevel + " %");
                System.out.println("Car Position:\t||\tX= " + carPositionX + " | Y= " + carPositionY + "\n\n" + "************************");
        }

        public void speedSetting() {
                if (speed > targetSpeed ) {
                        speed = targetSpeed;
                        System.out.println("The speed was reduced to " + targetSpeed + " km/h.");
                } else {
                        speed = targetSpeed;
                        System.out.println("The speed increased to " + targetSpeed + " km/h.");
                }
                carPositionX = random.nextInt();
                carPositionY = random.nextInt();
                showAttributes();
        }

        public void brake (){
                if (speed > 0) {
                        speed = 0;
                        System.out.println( "The " + model + " stopped.");
                }
                carPositionX = random.nextInt();
                carPositionY = random.nextInt();
                targetSpeed = 0;
                showAttributes();
        }

        public void driveToGasStation() {
                if ( fuelLevel < 20 && carPositionX != gasStationPositionX && carPositionY != gasStationPositionY) {
                        carPositionX = gasStationPositionX;
                        carPositionY = gasStationPositionY;
                        fuelLevel = 100;
                        System.out.println("Now the " + model + " is at the gas station.");
                        showAttributes();
                } else {
                        System.out.println("Your fuel level is mote than 20%.\nYou can continue to deriving!");
                }
        }
}
