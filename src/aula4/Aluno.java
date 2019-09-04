package aula4;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.*;

@Named("aluno")
@RequestScoped
public class Aluno implements Cloneable{
	@Size(min=2, max=30, message="Nome precisa ter entre 2 a 30 caracteres")
	private String ra;
	private String nome;
	private String sobrenome;
	private String email;
	private String genero;
	@Inject
	private Endereco endereco;
	
	public Aluno() { 
	}
	
	public Aluno(String ra, String nome, String sobrenome) {    
		this.ra = ra;    
		this.nome = nome;    
		this.sobrenome = sobrenome;    
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
	protected Object clone() throws
    CloneNotSupportedException 
	{ 
		return super.clone(); 
	} 
	
}
