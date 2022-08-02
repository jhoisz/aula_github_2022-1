import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static Banco banco = new Banco();

	public static void main(String[] args) {
		String cpf, nome, op;
		Cliente cliente;
		Scanner scan = new Scanner(System.in);
		Menu mainMenu = new Menu("Menu Principal", Arrays.asList("Conta", "Cliente", "Operacoes", "Sair"));

		do {
			switch (mainMenu.getSelection()) {
				case 1:
					System.out.println("Digite o CPF do cliente:");
					cpf = scan.next();

					if (banco.buscaCliente(cpf)) {
						cliente = banco.getCliente(cpf);
						System.out.println("Qual conta deseja criar?\n1-Poupança\n2-Corrente");
						op = scan.next();

						if (op.equals("1")) {
							ContaPoupanca contaPoupanca = new ContaPoupanca();
							contaPoupanca.setTitular(cliente);
							contaPoupanca.setNumero(banco.getId());
							cliente.addConta(contaPoupanca);
							System.out.println("Conta Poupança criada com sucesso!");
						} else if (op.equals("2")) {
							ContaCorrente contaCorrente = new ContaCorrente();
							contaCorrente.setTitular(cliente);
							contaCorrente.setNumero(banco.getId());
							cliente.addConta(contaCorrente);
							System.out.println("Conta Corrente criada com sucesso!");
						} else {
							System.out.println("Opção inválida!");
						}

					} else {
						System.out.println("Cliente não encontrado");
					}

					break;
				case 2:
					System.out.println("Digite o CPF do cliente:");
					cpf = scan.next();

					System.out.println("Digite o nome do cliente:");
					nome = scan.next();

					banco.addCliente(new Cliente(cpf, nome));
					break;
				case 3:
					Menu subMenu = new Menu("Operações", Arrays.asList("Sacar", "Depositar", "Transferir", "Extrato"));

					System.out.println("Digite o CPF do cliente:");
					cpf = scan.next();

					if (banco.buscaCliente(cpf)) {
						cliente = banco.getCliente(cpf);

						switch(subMenu.getSelection()) {
							case 1:
								
								System.out.println("Digite o valor do saque:");
								float valor = scan.nextFloat();
	
								if(cliente.getContas().get(0).sacar(valor)) {
									System.out.println("Saque realizado com sucesso!\nSeu novo saldo é: " + cliente.getContas().get(0).getSaldo());
								} else {
									System.out.println("Saque falhou!");
								}

								break;
							case 2:
	
								break;
							case 3:
	
								break;
							case 4:
	
								break;
							default:
	
								break;
						}
					} else {
						System.out.println("Cliente não encontrado");
					}

					break;
				case 4:
					System.out.println("Saindo...");
					return;
				default:
					break;
			}
		} while (true);
	}
}