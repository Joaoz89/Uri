import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	   double A, B, C, aux;
	   
	   A = sc.nextDouble();
	   B = sc.nextDouble();
	   C = sc.nextDouble();
	
	   if (A < B) {
		   aux = A;
		   A = B;
		   B = aux;
	   }
	   if (A < C) {
		   aux = A;
		   A = C;
		   C = aux;
	   }
	   if (B > C) {
		   aux = B;
		   B = C;
		   C = aux;
	   }
	   if (A >= B + C) {
		   System.out.println("NAO FORMA UM TRIANGULO");
	   }else {
		   if (A == B && A == C)
			   System.out.println("TRIANGULO EQUILATERO");
		   if (A * A == (B * B + C * C)) 
			   System.out.println("TRIANGULO RETANGULO");
		   if (A * A > (B * B + C * C)) 
				System.out.println("TRIANGULO OBTUSANGULO");
		   if (A * A < (B * B + C * C))
			   System.out.println("TRIANGULO ACUTANGULO");
		   if (A == B && !(B == C) || A == C && !(C == B) || C == B && !(B == A))
			   System.out.println("TRIANGULO ISOSCELES");
	   }
	   /*
	    * double tempA = Math.max(A, Math.max(B, C));
		double tempB = 0;
		double tempC = 0;
		
		if (tempA == A) {
			tempB =Math.max(B, C);
			tempC =Math.min(B, C);
		}
		if (tempA == B) {
			tempB =Math.max(A, C);
			tempC =Math.min(A, C);
		}
		if (tempA == C) {
			tempB =Math.max(B, A);
			tempC =Math.min(B, A);
		}
		-----
		if (tempA >= (tempB + tempC)) {
			System.out.print("NAO FORMA TRIANGULO\n");
	    */
		
	    sc.close();

		}
}
