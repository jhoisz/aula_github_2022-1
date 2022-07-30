import java.util.ArrayList;

public class Banco {
    private String nome;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean buscaCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf() == cpf) {
                return true;
            }
        }
        return false;
    }

}
