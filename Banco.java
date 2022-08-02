import java.util.ArrayList;

public class Banco {
    private String nome;
    private int id = 0;

    public int getId() {
        return id;
    }

    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void addCliente(Cliente cliente) {
        id++;

        clientes.add(cliente);
    }

    public boolean buscaCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Cliente> getClientes() {
        return this.clientes;
    }

    public Cliente getCliente(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }
}
