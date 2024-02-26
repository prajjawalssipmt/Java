import java.util.Scanner;

public class ArraySearchTwoDimension {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Enter rows no. : ");
        int row = input.nextInt();
        System.out.print("Enter column no. : ");
        int col = input.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter element no."+i+j+": ");
                arr[i][j] =input.nextInt();
            }
        }

        System.out.println("Your array is -> ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("Enter the element you want to search : ");
        int num = input.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j]==num){
                    System.out.println("Element found in position "+i+" "+j);

                }
            }
        }

    }
}
