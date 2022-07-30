
public class ContaPoupanca extends Conta {

	private float rendimento;
	private float saldo = getSaldo();

	@Override
	public boolean sacar(float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean transferir(Conta conta, float valor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean depositar(float valor) {
		setSaldo(saldo + valor);
		return true;
	}

	@Override
	public void exibirExtrato() {
		// TODO Auto-generated method stub

	}

}
