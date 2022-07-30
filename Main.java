import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));

		do {
			switch (mainMenu.getSelection()) {
			case 1:
				
				break;
			case 2:
				System.out.println("Digite o CPF do cliente:");
				String cpf = scan.next();
				
				System.out.println("Digite o nome do cliente:");
				String nome = scan.next();
				
				clientes.add(new Cliente(cpf, nome));
				break;
			case 3:
				
				break;
			default:
				break;
			}
			System.out.println(mainMenu.getSelection() + " foi selecionada");			
		}while (mainMenu.getSelection() !=4);

		System.out.println("Fim");
	}
}