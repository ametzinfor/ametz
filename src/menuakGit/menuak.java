package menuakGit;

import java.util.Scanner;

public class menuak {
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int aukera=0;
		int z1=0;
		int z2=0; 
		do{
			System.out.println("Menu: 1-Suma, 2-Resta, 3-Multiplicacion, 4-Division");
			aukera=Integer.parseInt(scan.nextLine());
		
			System.out.println("Sartu lehenengo zenbakia");
			z1=Integer.parseInt(scan.nextLine());
			System.out.println("Sartu bigarren zenbakia");
			z2=Integer.parseInt(scan.nextLine());
			
			switch (aukera){
			
			case 1: // 1 aukera Suma
				System.out.println("Suma");
				System.out.println(z1 + z2);
				break;
			case 2: // 2 aukera resta
				System.out.println("Resta");
				System.out.println(z1 - z2);
				break;
				
			case 3: // 3 aukera multiplicación
				System.out.println("Multiplicacion");
				System.out.println(z1 * z2);
				break;
			case 4: // 4 aukera dividir
				System.out.println("Dividir");
				System.out.println(z1 / z2);
				break;
			
			
			}
			
		}while(aukera!=0);
		
	}

}
