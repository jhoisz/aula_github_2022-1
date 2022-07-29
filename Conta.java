public abstract class Conta {
	
	private int numero;
	private float saldo;
	private Cliente titular;
	
	public abstract boolean sacar(float valor);
	
	public abstract boolean transferir(Conta conta, float valor);
	
	public abstract boolean depositar(float valor);
	
	public abstract void exibirExtrato();

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

}
