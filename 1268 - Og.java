import java.util.Scanner;

public class Main1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt();
		int R = sc.nextInt();
		while(L > 0 && R > 0){
			int a = L + R;
			System.out.println(a);
			
			L = sc.nextInt();
			R = sc.nextInt();
		}
		sc.close();
		}
}
