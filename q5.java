package Day07;
import java.util.Scanner;
public class q5 {

	public static void positiveornegative() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		
		if( number < 0) {
			System.out.println("Number is Negative");
		}else {
			System.out.println("Number is Positive");
		}
	}
	
	public static void main(String[] args) {
		positiveornegative();
	}
}
