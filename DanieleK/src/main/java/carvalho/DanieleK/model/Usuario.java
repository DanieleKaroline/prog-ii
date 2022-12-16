package carvalho.DanieleK.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	@Column(name = "id_us")
	private Integer id_us;
	
	@NotNull (message = "O nome precisa ser preenchido!")
	@Size(min = 3, max = 30, message = "O nome deve ter de 3 a 30 caracteres!")
	@Column(name = "nome")
	private String nome;
	
	@NotNull (message = "O e-mail precisa ser preenchido!")
	@Email(regexp = ".+@.+\\..+")
	@Column(name = "email")
	private String email;
	
	
	@NotNull (message = "A senha precisa ser preenchida!")
	@Size(min = 6, max = 20, message = "A senha deve ter de 6 a 20 caracteres!")
	@Column(name = "pass")
	private String pass;
	
	@NotNull (message = "O CPF precisa ser preenchido!")
	@Column(name = "cpf")
	private String cpf;
	
	
	@Transient
	private String aux;
	
	public String getName() {
		return nome;
	}
	public void setName(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Integer getId_us() {
		return id_us;
	}
	public void setId_us(Integer id_us) {
		this.id_us = id_us;
	}
	
	
	
	
}