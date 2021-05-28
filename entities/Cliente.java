package entities;

public abstract class Cliente {

	private String nome;
	private String email;
	private String endere�o;

	public Cliente(String nome, String email, String endere�o) {
		super();
		this.nome = nome;
		this.email = email;
		this.endere�o = endere�o;

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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", endere�o=" + endere�o + "]";
	}

	

	

}
