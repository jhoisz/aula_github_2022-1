
public class ContaPoupanca extends Conta {

	private float rendimento;
	private float saldo;

	@Override
	public boolean sacar(float valor) {
		if (saldo >= valor) {
			setSaldo(saldo - valor);
			setExtrato(this.getExtrato()+"Saque: "+valor+"\n");
			return true;
		}
		return false;
	}

	@Override
	public boolean transferir(Conta conta, float valor) {
		if (saldo >= valor) {
			setSaldo(saldo - valor);
			conta.setSaldo(conta.getSaldo() + valor);
			setExtrato(this.getExtrato()+"Transferência: "+valor+"\n");
			return true;
		}
		return false;
	}

	@Override
	public boolean depositar(float valor) {
		setSaldo(saldo + valor);
		setExtrato(this.getExtrato()+"Depósito: "+valor+"\n");
		return true;
	}

	public boolean saldo(Conta conta) {
		System.out.println("Seu saldo: " + conta.getSaldo());
		return true;
	}

}
