import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically*) a two dimensional array
        //   with the following matrix**. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        // * length should depend on a variable
        // ** Relax, a matrix is just like an array
        Scanner scan = new Scanner(System.in);

        System.out.println("How many colums?");
        int size = scan.nextInt();

        scan.close();

        int[][] matrix = new int[size][size]; //2 dimensional array 0 in standard java

        for (int i = 0; i < size; i++) { //size-1 last value
            matrix[i][i] = 1; //x y symmetric steps
        }

        for (int j = 0; j < size; j++) { //y coordinates
            for (int i = 0; i < size; i++) { //x coordinate
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

}