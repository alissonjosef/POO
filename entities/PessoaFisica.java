package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PessoaFisica extends Cliente {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String cpf;
	private int idade;
	private String cnh;
	private Date dataNascimento;
	
	
	
	public PessoaFisica(String nome, String email, String endereço, String cpf, int idade, String cnh,
			Date dataNascimento) {
		super(nome, email, endereço);
		this.cpf = cpf;
		this.idade = idade;
		this.cnh = cnh;
		this.dataNascimento = dataNascimento;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public String getCnh() {
		return cnh;
	}



	public void setCnh(String cnh) {
		this.cnh = cnh;
	}



	public Date getDataNascimento() {
		return dataNascimento;
	}



	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}



	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + cpf + ", idade=" + idade + ", cnh=" + cnh + " (" + sdf.format(dataNascimento) + ") - "
				+ "]";
	}
	
	
	
	
	
	

}
