import java.util.Scanner;

class VolumeOfCylinder {
    public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
		
	System.out.print("Enter the radius of cylinder : ");
	double radius = s.nextDouble();
		
	System.out.print("Enter the height of cylinder : ");
	double height = s.nextDouble();
	s.close();
		
	double cylinderVolume = Math.PI * radius * radius * height;
	System.out.println("The volume of Cylinder is : " + cylinderVolume);
    }
}