package asddsdsd;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main1046 {

	public static void main(String[] args) {		
		Scanner leitor = new Scanner(System.in);
		
		TreeMap<Integer, Integer> numeros = new TreeMap<>();
		
		int N = leitor.nextInt();
		
		for (int i = 0; i < N; i++) {
			int numero = leitor.nextInt();
			if (numeros.containsKey(numero))
				numeros.replace(numero, numeros.get(numero) + 1); //replace(key, value), acessar a key
			//que passou no leitor int e acessar o valor e adicionar +1.
			else
				numeros.put(numero, 1);
		}
		//entrySet retorna todos elementos no Map<> chave e valor, mas pra isso precisamos da interface
		//Entry<key, value>;
		
		for (Entry<Integer, Integer> entry : numeros.entrySet()) {
			System.out.println(entry.getKey() + " aparece " + entry.getValue() + " vez(es)");
		}

    //2 metodo///////////////////////////////////////////////////////////
		System.out.println("Metodo 2: ");
		System.out.println();
		
    Set<Map.Entry<Integer, Integer>> n = numeros.entrySet();
		
		for(Map.Entry<Integer, Integer> it: n) {
			System.out.println(it.getKey() + " aparece " + it.getValue() + " vez(es)");
		
	}
		leitor.close();
		}
}
