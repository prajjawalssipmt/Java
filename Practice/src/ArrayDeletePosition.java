import java.util.Scanner;

public class ArrayDeletePosition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to array Delete From position");
        int[] myArr = ArrayUtility.inputArray();
        System.out.println("Enter the postion you want to delete");
        int pos = input.nextInt();
        posDelete(myArr,pos);

    }
    public static int[] posDelete(int[] myArr,int pos){

        int len = myArr.length;
        for (int i = pos; i < len-1; i++) {
            myArr[i] = myArr[i+1];
        }

        for (int i = 0; i < len-1; i++) {
            System.out.print(myArr[i]+" ");
        }

        return myArr;
    }
}
