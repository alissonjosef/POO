package entities;

public abstract class Cliente {

	private String nome;
	private String email;
	private String endereço;

	public Cliente(String nome, String email, String endereço) {
		super();
		this.nome = nome;
		this.email = email;
		this.endereço = endereço;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", endereço=" + endereço + "]";
	}

	

	

}
