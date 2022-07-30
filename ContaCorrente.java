
public class ContaCorrente extends Conta {
    private float limite;
    private float taxaManutencao;

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
        if (saldo + valor > limite) {
            System.out.println("Limite execedido!");
            return false;
        } else {
            setSaldo(saldo + valor);
            return true;
        }
    }

    @Override
    public void exibirExtrato() {
        // TODO Auto-generated method stub

    }

}