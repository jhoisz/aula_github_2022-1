import java.util.ArrayList;

public class Cliente {
	
	private String cpf;
	private String nome;
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	public Cliente(String cpf, String nome) {
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public ArrayList<Conta> getContas() {
		return contas;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}

}
