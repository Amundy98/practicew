package factory;

public class Watermelon {
    public static void main(String[] args) {
       // Vehicle myHorse = new Horse();
        //Vehicle myTruck = new Truck();
        //Vehicle myCar = new Car();
        //Vehicle myMotorbike = new MotorBike();
        Vehicle myVehicle = new Vehicle();
        IRideable myHorse1 = new Horse();
        IRideable myMotorbike1 = new MotorBike();



        myVehicle.calcTotal(60, 5);
        myMotorbike1.printExperience();
        myHorse1.printExperience();

        //myTruck.setPrice(20.0);
       // myTruck.setQty(5);
        //System.out.println(myTruck.getPrice()* myTruck.getQty());

    }
}
