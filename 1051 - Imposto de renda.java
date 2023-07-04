import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double salary = sc.nextDouble();
		double tax = 0;
		
		if (salary > 2000.00 && salary < 3000.00) {
			salary -= 2000.00; 
			tax = 8 * salary / 100;
			System.out.printf("R$ %.2f%n", (tax));
			
		}else if(salary > 3000.00 && salary < 4500.00) {
			salary -= 3000.00; 
			tax = 8 * 1000.00 / 100;
			tax += 18 * salary / 100;
			System.out.printf("R$ %.2f%n", (tax));

		}else if (salary > 4000.00) {
			salary -= 4500.00; 
			tax = 8 * 1000.00 / 100;
			tax += 18 * 1500.00 / 100;
			tax += 28 * salary / 100;
			System.out.printf("R$ %.2f%n", (tax));

		}else {
			System.out.println("Isento");
		}
		sc.close();
		}
}
