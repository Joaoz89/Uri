import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
		int alice = sc.nextInt();
		int beto = sc.nextInt();
		int clara = sc.nextInt();
		
		if (alice == beto && beto == clara) {
			System.out.println("*");
		}
		else if(alice == beto && !(alice == clara)) {
			System.out.println("C");
		}
		else if(alice == clara && !(alice == beto)) {
			System.out.println("B");
		}
		else {
			System.out.println("A");
		}
		}
		sc.close();
		}
}
