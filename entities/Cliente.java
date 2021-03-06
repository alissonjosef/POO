package entities;

public abstract class Cliente {

	private String nome;
	private String email;
	private String enderešo;

	public Cliente(String nome, String email, String enderešo) {
		super();
		this.nome = nome;
		this.email = email;
		this.enderešo = enderešo;

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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", enderešo=" + enderešo + "]";
	}

	

	

}
