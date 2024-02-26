package in.kgcoding;

public class AccessTest {
    public static void main(String[] args) {
        PublicCar car=new PublicCar();
        car.color="red";
        car.model="Swift";
        car.costOfPurchase=56000;
        PublicCar newCar=new PublicCar("Black","BMW",1,25);
        System.out.println(car);
        System.out.println(newCar);

        Default def = new Default();

    }
}
