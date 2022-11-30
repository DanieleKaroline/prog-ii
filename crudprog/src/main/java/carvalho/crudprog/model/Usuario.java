package carvalho.crudprog.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.*;

@Entity(name = "usuario")
public class Usuario {
	@NotNull (message = "O nome precisa ser preenchido!")
	private String name;
	@NotNull (message = "O e-mail precisa ser preenchido!")
	private String email;
	@NotNull (message = "O telefone precisa ser preenchido!")
	private String phone;
	@NotNull (message = "O CPF precisa ser preenchido!")
	private String cpf;
	@NotNull (message = "A senha precisa ser preenchido!")
	@Size(min = 6, max = 20, message = "A senha deve ter de 6 a 20 caracteres!")
	private String pass;
	@Id
	@GeneratedValue
	private Integer id;
	@Transient
	private String aux;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	
}
