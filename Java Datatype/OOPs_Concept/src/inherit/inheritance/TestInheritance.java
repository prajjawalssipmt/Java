package inherit.inheritance;

public class TestInheritance {
    public static void main(String[] args) {
        Vehicle veh=new Vehicle();
        veh.setNoOfTyres(2);
        veh.commute();
        System.out.println(veh.toString());
        System.out.println(veh.hashCode());
        System.out.println(veh.getClass());

        MotorCycle.TwoWheeler two=new MotorCycle.TwoWheeler();
        two.commute();
        two.balance();

        MotorCycle motor =new MotorCycle();
        motor.start();
        motor.commute();
        motor.balance();

    }
}
