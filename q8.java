package Day07;
import java.util.Scanner;
public class q8 {

	public static void Perimeterofrectangle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the lenght value:");
		int l = sc.nextInt();
		
		System.out.println("enter the width value:");
		int w = sc.nextInt();
		
		System.out.println("The perimeter of rectangle: " +(2*(l+w)));
	}
	
	public static void main(String[] args) {
		Perimeterofrectangle();
	}
	
}
