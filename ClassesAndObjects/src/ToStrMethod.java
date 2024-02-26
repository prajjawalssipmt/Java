public class ToStrMethod {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
     String modelNumber;
     String company;

    public ToStrMethod(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ToStrMethod -> ");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        return sb.toString();
    }

    public static void main(String[] args) {
        ToStrMethod swift = new ToStrMethod(4,5,150,"Alto","alto800","maruti");
        System.out.println(swift);
    }
}
