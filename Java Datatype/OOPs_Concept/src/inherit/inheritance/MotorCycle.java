package inherit.inheritance;

import inherit.inheritance.TestingProtected.TwoWheeler;

public class MotorCycle extends TwoWheeler {
    public double petrolCapacity;
    public void start(){
        System.out.println("Starting...");
    }

    public static class TwoWheeler extends Vehicle {

       protected TwoWheeler(){
            setNoOfTyres(2);
            noOfTyres=4;
        }

        public void balance(){
            System.out.println("I am balancing on two tyres.");
        }
    }
}
