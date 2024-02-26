package inherit.inheritance.TestingProtected;

import inherit.inheritance.Vehicle;

public class TwoWheeler extends Vehicle {
   protected TwoWheeler(){
            setNoOfTyres(20);
            noOfTyres=4;
    }
    public void balance(){
        System.out.println("I am balancing in two tyres.");
    }
}
