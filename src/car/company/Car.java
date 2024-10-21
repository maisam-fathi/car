package car.company;

public class Car {

        String model;
        String color;
        int carPositionX;
        int carPositionY;
        final int gasStationPositionX = 70;
        final int gasStationPositionY = 120;
        int speed;
        int targetSpeed;
        int fuelLevel;

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
                showAttributes();
        }

        public void brake (){
                if (speed > 0) {
                        speed = 0;
                        System.out.println( "The " + model + " stopped.");
                }
                showAttributes();
        }

        public void driveToGasStation() {
                if ( fuelLevel < 20 && carPositionX != gasStationPositionX && carPositionY != gasStationPositionY) {
                        carPositionX = gasStationPositionX;
                        carPositionY = gasStationPositionY;
                        fuelLevel = 100;
                        System.out.println("Now the" + model + " is at the gas station.");
                        showAttributes();
                }
        }
}
