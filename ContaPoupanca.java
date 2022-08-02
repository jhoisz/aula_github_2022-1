
public class ContaPoupanca extends Conta {

	private float rendimento;
	private float saldo = getSaldo();

	@Override
	public boolean sacar(float valor) {
		setSaldo(saldo - valor); // TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean transferir(Conta conta, float valor) {
		if (saldo > valor) {
			saldo = saldo - valor;
			conta.setSaldo(conta.getSaldo() + valor);
			return true;
		}
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
