public class Car {

    int noOFWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOFSeats;

    public void start(){
        if (currentFuelInLiters==0){
            System.out.println("Car is out of fuel");
        } else if (currentFuelInLiters<5) {
            System.out.println("Car is started with reserve fuel, refuel it");
        }else {
            System.out.println("car is started, bruhhh....");
        }
    }

    public void drive(){
            System.out.println("car is running");
    }

    public  void addFuel(float fuel){
        currentFuelInLiters+=fuel;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}
