
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		while(n > 0) {

		int maria = 0, joao = 0;
		int[] array = new int[n];

		for(int i = 0; i<n; i++) {
			array[i] = sc.nextInt();
			if (array[i] == 0) {
				maria++;
			}else {
				joao++;
			}
		}
		System.out.println("Mary won " + maria + " times and John won " + joao + " times");

		n = sc.nextInt();
		}
		sc.close();
		}

}
