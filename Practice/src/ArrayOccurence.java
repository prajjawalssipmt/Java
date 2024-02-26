import java.util.Scanner;

public class ArrayOccurence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();
        int len = arr.length;
        System.out.print("Enter the no. you want to count : ");
        int num = input.nextInt();
       int result=  found(arr,len,num);
        System.out.println(num+" occurence is : "+result);
    }

    public static int found(int[] arr ,int len,int num) {
        int count=0;
        for (int i = 0; i < len; i++) {
            if (arr[i]==num)
                count++;
        }
        return count;
    }
}
