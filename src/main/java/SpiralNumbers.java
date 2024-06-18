import java.util.Scanner;

/*
This class is used to fill a matrix with numbers in a spiral pattern.
The matrix is filled in a recursive way, using the fill_recursive method.
The matrix is initialised with the initialiseMatrix method.
The filling starts from the startingCoordinate, which is the middle of the matrix, in case of an even number of rows and columns, the startingCoordinate is the top left corner of the middle 2x2 matrix.

 */

public class SpiralNumbers {
    private static int startingX, startingY;
    
    private static void fill_recursive(int[][] matrix, int x, int y, int amount, int value, int direction){
        try{
            switch (direction) {
                case 2 -> {
                    for (int i = 0; i < amount; i++) {
                        matrix[x][y + i] = value;
                        value++;
                    }
                    fill_recursive(matrix, x + 1, y + amount - 1, amount, value, (direction + 1) % 4);
                }
                case 3 -> {
                    for (int i = 0; i < amount; i++) {
                        matrix[x + i][y] = value;
                        value++;
                    }
                    fill_recursive(matrix, x + amount - 1, y - 1, amount + 1, value, (direction + 1) % 4);
                }
                case 0 -> {
                    for (int i = 0; i < amount; i++) {
                        matrix[x][y - i] = value;
                        value++;
                    }
                    fill_recursive(matrix, x - 1, y - amount + 1, amount, value, (direction + 1) % 4);
                }
                case 1 -> {
                    for (int i = 0; i < amount; i++) {
                        matrix[x - i][y] = value;
                        value++;
                    }
                    fill_recursive(matrix, x - amount + 1, y + 1, amount + 1, value, (direction + 1) % 4);
                }
            }
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println("End");
        }
    }

    private static void initialiseMatrix(int[][] matrix, int size){
        int xstart=(int) (double) ((size - 1) / 2);
        int ystart=(int) (double) ((size - 1) / 2);
        try {
            matrix[xstart][ystart] = 1;
            matrix[xstart][ystart + 1] = 2;
            matrix[xstart + 1][ystart + 1] = 3;
        }catch (ArrayIndexOutOfBoundsException e){
            //System.out.println("The matrix is small");
        }
        startingX=xstart+1;
        startingY=ystart;
    }

    private static void printMatrix(int[][] matrix){
        for (int[] row : matrix){
            for (int element : row){
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int size;
        System.out.println("Insert the size of the matrix");
        Scanner in = new Scanner(System.in);
        size = in.nextInt();
        try{
            int iteration=0;
        int[][] matrix = new int[size][size];
        initialiseMatrix(matrix, size);
        fill_recursive(matrix, startingX, startingY, 2, 4, 0);
        printMatrix(matrix);
        }catch (NegativeArraySizeException e){
            System.out.println("The size of the matrix cannot be negative");
        }
    }
}
