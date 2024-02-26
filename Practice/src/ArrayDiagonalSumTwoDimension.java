
import java.util.Scanner;

public class ArrayDiagonalSumTwoDimension {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows no. : ");
        int row = input.nextInt();
        System.out.print("Enter column no. : ");
        int col = input.nextInt();

        if (row == col) {

            int[][] arr = new int[row][col];

            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print("Enter element no." + i + j + ": ");
                    arr[i][j] = input.nextInt();
                }
            }

            System.out.println("Your array is -> ");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            int sum = 0;
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (i == j || (i + j == row - 1)) {
                        sum += arr[i][j];
                    }
                }
            }
            System.out.println("Sum of both diagonal is : " + sum);

        }else{
            System.out.println("No. of row and column is not equal");
        }

    }
}

