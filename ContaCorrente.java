
public class ContaCorrente extends Conta {
    private float limite;
    private float taxaManutencao = 2.5f;

    private float saldo = getSaldo();

    @Override
    public boolean sacar(float valor) {
        setSaldo(calculaTaxa() - valor);
        return true;
    }

    private float calculaTaxa() {
        saldo -= taxaManutencao;
        return saldo;
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
        if (saldo + valor > limite) {
            System.out.println("Limite execedido!");
            return false;
        } else {
            setSaldo(saldo + valor);
            return true;
        }
    }

    public boolean saldo(Conta conta) {
        System.out.println("Seu saldo: " + conta.getSaldo());
        return true;
    }

    @Override
    public void exibirExtrato() {
        // TODO Auto-generated method stub

    }

}