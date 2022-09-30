import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];

        System.out.println("Enter the value into the first array:-");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Sum of 1st row " + sumRow(array, 0));
        System.out.println("Sum of 2nd row " + sumRow(array, 1));
        System.out.println("Sum of 3rd row " + sumRow(array, 2));
        System.out.println("Sum of 1st column " + sumColumn(array, 0));
        System.out.println("Sum of 1st column " + sumColumn(array, 1));
        System.out.println("Sum of 1st column " + sumColumn(array, 2));
        int sumEach = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumEach += array[i][j];
            }
        }
        System.out.println("Sum of each Element " + sumEach);

    }

    static int sumRow(int[][] array, int j) {
        int sumRow = 0;
        for (int i = 0; i < 3; i++) {
            sumRow += array[i][j];
        }
        return sumRow;
    }

    static int sumColumn(int[][] array, int j) {
        int sumColumn = 0;
        for (int i = 0; i < 3; i++) {
            sumColumn += array[j][i];
        }
        return sumColumn;
    }
}
