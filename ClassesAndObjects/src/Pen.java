
class kalam{
    String color;
    String type;

    public void write(){
        System.out.println(this.type+" pen is used for writing.");
    }

    public void penColor(){
        System.out.println("Pen color is "+this.color);
    }
}

public class Pen {
    public static void main(String[] args) {
        kalam pen1 = new kalam();
        pen1.color= "black";
        pen1.type="gel";
        pen1.write();
        pen1.penColor();

        kalam pen2 = new kalam();
        pen2.color="red";
        pen2.type="ball point";
        pen2.write();
        pen2.penColor();
    }
}
