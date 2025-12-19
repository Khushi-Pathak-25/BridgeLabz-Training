import java.util.Scanner;

public class TwoDArrayToOneDArray{

    public static void main(String[] args){

        //Creating Scanner input
        Scanner input = new Scanner(System.in);

        //Enter number of rows
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        //Enter number of columns
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();

        //Creating a 2D array
        int[][] matrix = new int[rows][columns];

        // Taking input values for the 2D array
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++){ 
            for (int j = 0; j < columns; j++){ 
                matrix[i][j] = input.nextInt();
            }
        }
        
        //Creating 1D array of size rows * columns
        int[] array = new int[rows * columns];

        //Creating index variable for storing elements
        int index = 0;

        //Copying elements from 2D array to 1D array
        for (int i = 0; i < rows; i++){       
            for (int j = 0; j < columns; j++){ 
                array[index] = matrix[i][j];  
                index++;                         
            }
        }

        //Printing the 2D array
        System.out.println("\n2D Array:");
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //Printing copied 1D array
        System.out.println("\n1D Array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        input.close();
    }
}
