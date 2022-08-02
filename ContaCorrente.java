
public class ContaCorrente extends Conta {
    private float limite;
    private float taxaManutencao = 2.5f;

    @Override
    public boolean sacar(float valor) {
        if (saldo >= valor) {
            setSaldo(saldo - valor);
            setExtrato(this.getExtrato() + "Saque: " + valor + "\n");
            return true;
        } else if (saldo + limite >= valor) {
            setExtrato(this.getExtrato() + "Saque: " + valor + "\n");
            valor = valor - saldo;
            setSaldo(0);
            setLimite(limite - valor);
            return true;
        } else if (saldo + limite >= valor) {
            setExtrato(this.getExtrato() + "Saque: " + valor + "\n");
            valor = valor - saldo;
            setSaldo(0);
            setLimite(limite - valor);
            return true;
        }
        return false;
    }

    @Override
    public boolean transferir(Conta conta, float valor) {
        if (saldo > valor) {
            saldo = saldo - valor;
            conta.setSaldo(conta.getSaldo() + valor);
            setExtrato(this.getExtrato() + "Transferência: " + valor + "\n");
            return true;
        }
        return false;
    }

    @Override
    public boolean depositar(float valor) {
        setSaldo(saldo + valor);
        setExtrato(this.getExtrato() + "Depósito: " + valor + "\n");
        return true;
    }

    public boolean saldo(Conta conta) {
        System.out.println("Seu saldo: " + conta.getSaldo());
        return true;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }
}