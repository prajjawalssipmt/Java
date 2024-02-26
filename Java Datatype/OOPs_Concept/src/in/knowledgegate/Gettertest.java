package in.knowledgegate;

import in.gettersetter.Car;

public class Gettertest {

    public static void main(String[] args) {
        Car car=new Car("Red","Maruti",5,5000);
        car.setColor("Blue");
        System.out.printf("%s %s",car.getColor(),car.getModel());
    }

}
