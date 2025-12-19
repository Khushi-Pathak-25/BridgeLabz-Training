import java.util.Scanner;

class  AverageMarkGradeAndRemarks{
 
    public static void main(String[]args){
     
        // Create Scanner class object
        Scanner input=new Scanner(System.in);

        // Take marks of 3 subjects physics, chemistry and maths.
        System.out.print("\nEnter marks of Physics : ");
        double physics = input.nextDouble();

        System.out.print("\nEnter marks of Chemistry : ");
        double chemistry = input.nextDouble();

        System.out.print("\nEnter marks of Maths : ");
        double maths = input.nextDouble();

        // Compute the percentage
        double percentage = (physics + chemistry + maths) /3 ;
        
        // Calulate the grade
        if(percentage >= 80.0){
            System.out.println("Average Mark : "+ percentage +" Grade : A "+ " Remarks : Level 4, above agency-normalized standards ");
        }
        else if(percentage >= 70.0 && percentage <= 79.0 ){
            System.out.println("Average Mark : "+ percentage +" Grade : B "+ " Remarks : Level 3, at agency-normalized standards ");
        }
        else if(percentage >= 60.0 && percentage <= 69.0 ){
            System.out.println("Average Mark : "+ percentage +" Grade : C "+ " Remarks : Level 2, below, but approaching agency-normalized standards ");
        }
        else if(percentage >= 50.0 && percentage <= 59.0 ){
            System.out.println("Average Mark : "+ percentage +" Grade : D "+ " Remarks : Level 1, well below agency-normalized standards ");
        }
        else if(percentage >= 40.0 && percentage <= 49.0 ){
            System.out.println("Average Mark : "+ percentage +" Grade : D "+ " Remarks : Level 1-, too below agency-normalized standards ");
        }
        else{
            System.out.println("Average Mark : "+ percentage +" Grade : R "+ " Remarks : Remedial Standards ");
        }

        input.close();
    }
}