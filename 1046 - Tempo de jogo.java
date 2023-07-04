
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int ini, end;
		int hour = 0;
		int aux = 0;
    
		ini = sc.nextInt();
		end = sc.nextInt();
			
		if (ini > end) {
			hour = (24 - ini) + end;
		}
		else if (ini < end) {
			hour = end - ini;
		}else{
			hour = 24;
		}
		 --------------------------------------------------------//2 method
		if(ini >= end) {
		while( ini < 24) {
			hour ++;
			ini ++;
		}
		hour += end;
		}
		
		while(ini < end) {
			hour ++;
			ini++;
		}
		System.out.println("O JOGO DUROU " + hour + " HORAS(S)");
		
		sc.close();
	}

}
