package Day07;
import java.util.Scanner;
public class q6 {

	public static int greaternumber(int a, int b) {
		return a+b;
	}
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first  number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the second  number: ");
		int b = sc.nextInt();
		
		if(a<b) {
			System.out.println("b is greater value");
		}else {
			System.out.println("a is greater value");
		}
	}
}
