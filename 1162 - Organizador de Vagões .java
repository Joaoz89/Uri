import java.util.Scanner;


public class Main1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 
		 for(int i = 0; i < n; i++) {
			int t = sc.nextInt();

			 boolean ft = true, aux2 = false;
			 int swap = 0, aux;		

			 int vagoes[] = new int[t];
			 
			 for(int j = 0; j < t; j++) {
				 vagoes[j] = sc.nextInt();
				 
			 }
			 while(ft == true) {
				 
			 for(int j = 0; j < t - 1; j++) {
				 
				 if(vagoes[j] > vagoes[j + 1]) {
					 aux = vagoes[j];
					 vagoes[j] = vagoes[j + 1];
					 vagoes[j + 1] = aux;
					 swap++;
				 }
			 }			 
			 for(int ji = 0; ji < t - 1; ji++) {
					 if(vagoes[ji] >  vagoes[ji + 1]) {
						 aux2 = true;
						 break;
				 }					 
				 }
			 if(aux2 == false) {
				 ft = false;
			 }else {
				 aux2 = false;
			 }
			 }
			 System.out.println("Optimal train swapping takes " + swap + " swaps.");
		 }
		sc.close();
        }
}
