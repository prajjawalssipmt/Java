package inherit.encapsulation.CircleRectangle.utils;

import inherit.encapsulation.CircleRectangle.geometry.Circle;
import inherit.encapsulation.CircleRectangle.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir =new Circle(5.5);
        Rectangle rect=new Rectangle(10,5);

        double cirArea=Math.PI*Math.pow(cir.radius, 2);
        double rectArea= rect.length* rect.breadth;
        System.out.printf("Area of cirecle is %f , Rectangle is %f",cirArea,rectArea);
    }
}
