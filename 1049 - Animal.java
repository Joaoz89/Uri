import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String t1, t2, t3;
	
		t1 = sc.nextLine();
		t2 = sc.nextLine();
		t3 = sc.nextLine();
		   
		if ( t1.equals("vertebrado")) {
			if(t2.equals("ave")) {
				if(t3.equals("carnivoro")) {
					System.out.println("aguia");
				}else {
					System.out.println("pomba");
				}
		}
			else if(t3.equals("onivoro")) {
				System.out.println("homem");
			}else {
				System.out.println("vaca");
			}
		} 
	
		else if(t2.equals("inseto")) {
		 if(t3.equals("hematofago")) {
			System.out.println("pulga");
		}else {
			System.out.println("lagarta");
		}
		}
		else if(t3.equals("hematofago")){
				System.out.println("sanguessuga");
			}else {
				System.out.println("minhoca");
			}
		sc.close();
		}

}
