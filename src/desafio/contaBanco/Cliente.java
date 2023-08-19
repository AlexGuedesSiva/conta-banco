package desafio.contaBanco;

public class Cliente extends ContaBancaria{

	private String nome;
	private double cpf;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String nome, double cpf) {
		super();
		this.nome = nome;
		this.cpf= cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCpf() {
		return cpf;
	}

	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	
	
}
