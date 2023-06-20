import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input rows
            System.out.print("Input number of rows ");
            int rows = sc.nextInt();
            
            System.out.println();
            
            // Input columns
            System.out.print("Input number of columns ");
            int columns = sc.nextInt();

            System.out.print("Input elements ");

            int[][] arr = new int[rows][columns];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Your 2D array - ");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println("Spiral traversal - ");
            for (int a = 0, b = columns - 1, c = rows - 1, d = 0; a <= c && d <= b; a++, b--, c--, d++) {
                for (int j = d; j <= b - 1; j++) {
                    System.out.print(arr[a][j] + " ");
                }
                for (int i = a; i <= c - 1; i++) {
                    System.out.print(arr[i][b] + " ");
                }
                for (int j = b; j >= d + 1; j--) {
                    System.out.print(arr[c][j] + " ");
                }
                for (int i = c; i >= a + 1; i--) {
                    System.out.print(arr[i][d] + " ");
                }
            }
            System.out.println();
        }
    }
}