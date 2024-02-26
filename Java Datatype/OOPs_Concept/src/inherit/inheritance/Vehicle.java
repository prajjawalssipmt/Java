package inherit.inheritance;

public class Vehicle {
    protected int noOfTyres;

    @Override
    public String toString() {
        return "Vehicle no. of tyres: "+noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.printf("I am using %d Tyres\n",noOfTyres);
    }
}
