package heranca_animal;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int op;
		
		chorro dogin=new chorro(null,"Rex", 7,"Carn�voro", "Boiadeiro-bern�s");
		juan CAVALOOO=new juan(null,"Potrancoso",1,"Herb�voro", "Puro Sangue Ingles");
		preguica ZZZZZZ=new preguica(null,"Preguis", 1, "Herb�voro", "Pregui�a-de-coleira");
		
		do {
			System.out.println("\n -----------------------------");	
			System.out.printf("\n 1) cachorro");	
			System.out.printf("\n 2) cavalo");
			System.out.printf("\n 3) bicho preguiça");
			System.out.printf("\n Opção: "); 
			System.out.println("\n -----------------------------");
			op = scan.nextInt();

				
			switch (op) {
			
			case 1: dogin.print();	
			System.out.print("\n -----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 2) Exibir ação");
			System.out.print("\n Opção: "); 
			op = scan.nextInt();
			while (op >=1 || op <= 2) {	
				if (op == 1) { 
					dogin.som(); 
					break;
					} if (op == 2) { 
						dogin.correr(); 
						break; 
						}
			}
			break;
			
			case 2: CAVALOOO.print();	
			System.out.print("\n -----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 2) Exibir ação");
			System.out.print("\n Opção: "); 
			op = scan.nextInt();
			while (op >=1 || op <= 2) {	
				if (op == 1) { 
					CAVALOOO.som(); 
					break; 
					} 
				if (op == 2) { 
					CAVALOOO.correr(); 
					break; 
					}
			}
			break;
			
			case 3: ZZZZZZ.print();	
			System.out.print("\n -----------------------------");
			System.out.print("\n 1) Emitir som");
			System.out.print("\n 2) Exibir ação");
			System.out.print("\n Opção: "); 
			op = scan.nextInt();
			while (op >=1 || op <= 2) {	
				if (op == 1) { 
					ZZZZZZ.som(); 
					break; 
					} 
				if (op == 2) { 
					ZZZZZZ.subir(); 
					break; 
					}
			}
			break;
			
			default: System.out.println("\n opção invalida"); break;
				}
			} while (op != 0);
		}
	}