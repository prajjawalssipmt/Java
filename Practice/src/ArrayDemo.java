//import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        int[] arr = new int[5];
//        arr[0] = 10;
//        arr[1] = 20;
//        arr[2] = 30;
//        arr[3] = 40;
//        arr[4] = 50;

//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
        System.out.println("Number Array");
        int[] arr = {10,20,30,40,50,99};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        System.out.println("\nString array");
        String[] str = {"first","second","third","forth"};
        System.out.println(str.length);
        System.out.println(str[0]);
        System.out.println(str[3]);
    }
}
