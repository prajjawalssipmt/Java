import java.util.Scanner;


//False Code do it again

public class ArrayDeletion {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to delete an element from an array");
        int[] myarr = ArrayUtility.inputArray();
        System.out.print("Now enter the element you want to delete : ");
        int num= input.nextInt();
        int[] deletearray = numtodelete(myarr,num);
        System.out.println("Here is the new array");
        ArrayUtility.displayArray(deletearray);

    }

    public static int[] numtodelete(int[] arr, int num) {
        int occ = ArrayCountElement.countelement(arr,num);
        if (occ==0){
            return arr;
        }
        int newSize = arr.length-occ;
        int[] newArr = new int[newSize];

        for (int i = 0,j=0; i < arr.length; i++,j++) {
            if (arr[i] !=num){
                newArr[j] = arr[i];
            }
        }

        return newArr;

    }
}

