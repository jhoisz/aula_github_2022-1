import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Menu mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));

		do {
//			mainMenu =  new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));
			System.out.println(mainMenu.getSelection() + " foi selecionada");			
		}while (mainMenu.getSelection() !=4);

		System.out.println("Fim");
	}
}