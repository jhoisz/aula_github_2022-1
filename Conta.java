public abstract class Conta {

	protected int numero;
	protected float saldo = 0;
	protected String extrato = "";
	protected Cliente titular;

	public abstract boolean sacar(float valor);

	public abstract boolean transferir(Conta conta, float valor);

	public abstract boolean depositar(float valor);

	public abstract boolean saldo(Conta conta);

	public void exibirExtrato() {
		System.out.println(this.extrato);
	};

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	protected void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public String getExtrato() {
		return extrato;
	}

	public void setExtrato(String extrato) {
		this.extrato = extrato;
	}
}
