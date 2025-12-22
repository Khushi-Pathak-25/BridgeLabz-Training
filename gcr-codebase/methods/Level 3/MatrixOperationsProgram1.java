import java.util.Random;
public class MatrixOperationsProgram1{
    // create a random matrix
    public static int[][] createRandomMatrix(int rows, int cols) {
		// create random class object
        Random random = new Random();
		// taking 2D matrix 
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //Take input from user 
                matrix[i][j] = random.nextInt();
            }
        }
        return matrix;
    }

    //  display a matrix 
    public static void displayOutput(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
				//print matrix 
                System.out.print(matrix[i][j] + " ");
            }
			// add new line after printing one row
            System.out.println();
        }
    }

    // add two matrices
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] output = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output[i][j] = A[i][j] + B[i][j];
            }
        }
        return output;
    }

    // subtract two matrices
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] output = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                output[i][j] = A[i][j] - B[i][j];
            }
        }
        return output;
    }

    // multiply two matrices
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int rows = A.length;
        int cols = B[0].length;
        int common = A[0].length;

        int[][] output = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < common; k++) {
					// common matrix is k 
                    output[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int rows = 2, cols = 3;

        int[][] matrixA = createRandomMatrix(rows, cols);
        int[][] matrixB = createRandomMatrix(rows, cols);

        System.out.println("Matrix A:");
        displayOutput(matrixA);

        System.out.println("\nMatrix B:");
        displayOutput(matrixB);

        System.out.println("\nAddition (A + B):");
        displayOutput(addMatrices(matrixA, matrixB));

        System.out.println("\nSubtraction (A - B):");
        displayOutput(subtractMatrices(matrixA, matrixB));

        // for multiplication dimensions have to be same
        int[][] matrixNew = createRandomMatrix(cols, rows);

        System.out.println("\nMatrix New :");
        displayOutput(matrixNew);

        System.out.println("\nMultiplication (A * New Matrix):");
        displayOutput(multiplyMatrices(matrixA,matrixNew));
    }
}