import java.util.Scanner;
import java.lang.Math;

public class functionARMStrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();
        armstrong(num);
    }

    public static int armstrong(int n) {
        int d=0,count=0,sum=0,temp=n;
        while(temp>0){
            temp= temp/10;
            count++;
        }
//        System.out.println(count);
        temp=n;
      while (temp>0){
           d=temp%10;
           sum += (Math.pow(d,count));
           temp= temp/10;
       }
      if (n==sum){
          System.out.println("Arm strong number");
      }else {
          System.out.println("not a arm srong number ");
      }

        return 0;
    }
}
