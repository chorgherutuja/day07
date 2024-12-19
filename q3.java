package Day07;
import java.util.Scanner;
public class q3 {
	
	public static double areaofcircle(double r) {
		return (2*3.14*r*r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius:");
		double radius = sc.nextDouble();
		
		System.out.println("Area of Circle is : "+areaofcircle(radius));
	}

}
