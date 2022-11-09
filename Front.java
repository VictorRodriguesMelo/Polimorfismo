import java.util.Scanner;

import entites.Names;
import entites.Victor;

public class Front {

	public static void main(String[] args) {		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o nome: ");
		String name = sc.next();
		System.out.println("Digite o endereço: ");
		String end  = sc.next();
		System.out.println("Digite: ");
		String nameDois = sc.next();
		
		Victor victor = new Victor(name, end, nameDois);	
		
		
		

		System.out.println("Digite o nome: ");
		String namesDois = sc.next();
		System.out.println("Digite o endereço: ");
		String endDois  = sc.next();
		System.out.println("Digite: ");
		String nameDoisDois = sc.next();
		
		Names names = new Names(namesDois, endDois, nameDoisDois);	
		
		System.out.println(victor + "" + names);
		sc.close();
		

	}

}
