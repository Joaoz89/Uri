import java.util.Scanner;


public class Main1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int C = sc.nextInt();
		char T = sc.next().charAt(0);
		
		double[][] arr = new double[12][12];
		
		double r = 0;
		if(T == 'S') {
			for(int i = 0; i<12; i++) {
				for(int j = 0; j<=12; j++) {
					arr[i][j] = sc.nextDouble();
					
				}
				r += arr[i][C];
			}
			
		}else {
			for(int i = 0; i<12; i++) {
				for(int j = 0; j<12; j++) {
					arr[i][j] = sc.nextDouble();
					
				}
				r += arr[i][C];
			}
			r = r / 12;

		}
		System.out.printf("%.1f\n", r);
		sc.close();
	}
}
