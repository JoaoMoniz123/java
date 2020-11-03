
package ex11b;

import java.util.Scanner;

public class ex11b {
	
	public static String[] nome = new String[20];
	public static String[] ultimonome = new String[20];
	public static String[] freguesia = new String[20];
	public static String[] conselho = new String[20];
	public static int[] idade = new int[20];
	public static int[] id = new int[20];
	public static int x = 0;
	
	public static void main(String[] args) {
		
		menu();
		
	}
	
	static void menu(){
	
		Scanner input = new Scanner(System.in);
		
		int menu;
		
		System.out.print(""
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "*  GESTÃO DE ALUNOS  *\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "1 - Inscrever aluno\r\n"
				+ "\r\n"
				+ "2 - Consultar alunos\r\n"
				+ "\r\n"
				+ "3 - Listar alunos\r\n"
				+ "\r\n"
				+ "4 - Sair: \n");
		
		menu = input.nextInt();
		
		switch(menu){
		
		case 1:
			
			inscrever();
			
		break;
		case 2:
			
			consultar();
			
		break;
		case 3:
			
			listar();
			
		break;
		case 4:
			
			System.out.println("Volte sempre até já.");
			System.exit(0);
			
		break;
		default:
			
			System.out.println("Insira uma opção válida.");
			menu();
			
		break;
		}
		
		input.close();
		
	}
	
	static void inscrever() {
		
		Scanner input = new Scanner(System.in);
			
			id[0] = 1;
				
				if(id[x] > 0) {
					
					System.out.println("Insira o primeiro nome do aluno: ");
					
					 nome[x] = input.nextLine();
					 
					 System.out.println("Insira o ultimo nome do aluno: ");
						
					 ultimonome[x] = input.nextLine();
					 
					 System.out.println("Insira a idade do aluno: ");
						
					 idade[x] = input.nextInt();
					 input.nextLine();
					 
					 System.out.println("Insira a freguesia do aluno: ");
						
					 freguesia[x] = input.nextLine();
					 
					 System.out.println("Insira o conselho do aluno: ");
						
					 conselho[x] = input.nextLine();
					 
					 x++;
					 
					 menu();
					
				}else {
					
					id[x] = id[x-1] + 1;
					inscrever();
					
				}
				
				input.close();
				
			}
			 
	
	static void consultar() {
		
		Scanner input = new Scanner(System.in);
		
		 System.out.println("Insira o id do aluno: ");
			
		 int ver = input.nextInt();
		 
		 System.out.println("ID: " + id[ver - 1] + " Nome: " + nome[ver - 1] + " " + ultimonome[ver - 1] + "\n" + "Freguesia: " + freguesia[ver - 1] + "\nConselho: " + conselho[ver - 1]);
		
		 
		 menu();
		 
		input.close();
		
	}

	static void listar() {
	
		Scanner input = new Scanner(System.in);
		
		
		for(int z = 0; id[z] > 0; z++) {
			
			System.out.println("ID: " + id[z] + " Nome: " + nome[z] + " " + ultimonome[z]);
			
		}
		
		System.out.println("\n\n");
		
		menu();
		
		input.close();
	
	}
	
}

