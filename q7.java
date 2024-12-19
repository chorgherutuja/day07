package Day07;
import java.util.Scanner;
public class q7 {

	public static void squareorcube() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int number =sc.nextInt();
		
		System.out.println("square of number : " + (number*number));
		
		System.out.println("square of number : " + (number*number*number));
}
	
	public static void main(String[] args) {
		squareorcube();
	}
}
