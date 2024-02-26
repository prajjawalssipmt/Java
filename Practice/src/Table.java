import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the table number: ");
        int num = input.nextInt();
        calculateTable(num);

        }
    public static  void calculateTable(int number) {
//        int i=1;
//        while (i<=10){
//            System.out.println(number + " x " + i +" = " + (number*i));
//            i++;
//    }
        for (int i = 1; i <=10 ; i++) {
            int result = i*number;
            System.out.println(result);
        }

    }

}
