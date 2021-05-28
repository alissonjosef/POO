package entities;

public class PessoaJuridica extends Cliente {
	
	
	private String cnpj;

	public PessoaJuridica(String nome, String email, String endereço, String cnpj) {
		super(nome, email, endereço);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "PessoaJuridica [cnpj=" + cnpj + "]";
	}
	
	
	
	
	

}
