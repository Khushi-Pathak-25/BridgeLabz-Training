import java.util.Scanner;

class StudentCanVote{

    public static void main(String[]args){

        // Create Scanner class object
        Scanner input=new Scanner(System.in);
       
        // Creating an array of ages for 10 students
        int age[] = new int[10];
        
        // Taking input in age array
        for(int i= 0; i<age.length; i++){
            System.out.print(" \nEnter age of students : "+ (i+1) + " = ");
            age[i] = input.nextInt();        
        }

        //Iterating loop for 10 students
        for(int i= 0; i<age.length; i++){
            if(age[i]<0){
                System.out.println("an invalid age");
            }
            else{
                if(age[i]>=18){
                    System.out.println("The student with the age "+ age[i]+" can vote.");
                }
                else{
                     System.out.println("The student with the age "+ age[i]+" cannot vote.");
                }
            }
        }
        
        input.close();
    }
}
