package Day07;
import java.util.Scanner;
public class q4 {
	
	public static void Perimeter() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the value of side one:");
		double one = sc.nextDouble();
		
		System.out.println("enter the value of side two:");
		double two = sc.nextDouble();
		
		System.out.println("enter the value of side three:");
		double three = sc.nextDouble();
		
		System.out.println(" perimeter of a triangle:"+ (one+two+three));
	}
	
	public static void main(String[] args) {
		Perimeter();
	}

}
