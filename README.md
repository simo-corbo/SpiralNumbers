# SpiralNumbers

## Description

The `SpiralNumbers` class fills a square matrix with numbers in a spiral pattern starting from the center. This matrix is filled recursively using the `fill_recursive` method. The matrix is initialized using the `initialiseMatrix` method. The filling begins from the middle of the matrix, or the top-left corner of the middle 2x2 submatrix for even dimensions.

## How It Works

### Methods

- **fill_recursive(int[][] matrix, int x, int y, int amount, int value, int direction)**:
  This method recursively fills the matrix in a spiral pattern. It moves in a given direction and increments the value to be placed in the matrix cells. The direction changes as follows:
  - `2`: Right
  - `3`: Down
  - `0`: Left
  - `1`: Up

- **initialiseMatrix(int[][] matrix, int size)**:
  This method initializes the matrix with the first three values to set up the starting point for the spiral. It determines the starting coordinates based on the size of the matrix.

- **printMatrix(int[][] matrix)**:
  This method prints the matrix to the console in a formatted manner.

### Main Method

The `main` method handles user input for the size of the matrix, initializes the matrix, and then uses the recursive filling method to complete the matrix. Finally, it prints the filled matrix.

## Usage

1. **Compile**: Ensure you have the Java Development Kit (JDK) installed. Save the code to a file named `SpiralNumbers.java`, then compile it using the command:
   ```sh
   javac SpiralNumbers.java
   ```

2. **Run**: Execute the compiled class using the command:
   ```sh
   java SpiralNumbers
   ```

3. **Input**: When prompted, enter the size of the matrix (an integer).

4. **Output**: The program will display the matrix filled in a spiral pattern starting from the center.

## Example

For a matrix of size `5`, the output would look like this:
```
Insert the size of the matrix
5
21	22	23	24	25	
20	7	8	9	10	
19	6	1	2	11	
18	5	4	3	12	
17	16	15	14	13	
```

## Error Handling

- **Negative Size**: If the user inputs a negative size for the matrix, the program will catch the `NegativeArraySizeException` and display an appropriate message.

## Notes

- The program uses a try-catch block to handle `ArrayIndexOutOfBoundsException`, ensuring the recursive filling stops when the matrix boundaries are reached.
- The initial setup in `initialiseMatrix` ensures the first three numbers are placed correctly to start the spiral.

## Dependencies

- **Java Development Kit (JDK)**: Ensure you have the JDK installed to compile and run the Java program.
- **Scanner**: The program uses the `java.util.Scanner` class for reading user input.
