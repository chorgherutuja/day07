package Day07;
import java.util.Scanner;
public class q2 {
	
	public static double avgfunction(double a , double b, double c, double d){
		return (a+b+c+d)/4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter marks of math subject:");
		double math = sc.nextDouble();
		
		System.out.println("enter marks of TCS subject:");
		double TCS = sc.nextDouble();
		
		System.out.println("enter marks of FDS subject:");
		double FDS = sc.nextDouble();
		
		System.out.println("enter marks of JAVA subject:");
		double JAVA = sc.nextDouble();
		
		System.out.println("Average of four subject:" +avgfunction(math, TCS, FDS, JAVA));
	}

}
