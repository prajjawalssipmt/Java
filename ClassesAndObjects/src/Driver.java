public class Driver {
    public static void main(String[] args) {

//        Car myCar = new Car();
//        myCar.drive();
//        myCar.addFuel(6);
//        myCar.drive();
//        myCar.drive();
//        System.out.println(myCar.getCurrentFuelLevel());

        Car swift = new Car();
        swift.addFuel(6);
        swift.start();
        swift.drive();


    }
}
