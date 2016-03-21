package br.com.quizzes.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class Usuario implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1183994322708788077L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=50, nullable=false)
	private String nome;
	
	@Column(length=20, nullable=false)
	private String senha;
	
	@OneToOne
	@JoinColumn(name="email", 
		referencedColumnName="nomeusuario")
	private RoleUsuario roleUsuario;
		
	@OneToMany(mappedBy="usuario")
	private List<Resolucao> resolucoes;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public RoleUsuario getRoleUsuario() {
		return roleUsuario;
	}

	public void setRoleUsuario(RoleUsuario roleUsuario) {
		this.roleUsuario = roleUsuario;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List<Resolucao> getResolucoes() {
		return resolucoes;
	}

	public void setResolucoes(List<Resolucao> resolucoes) {
		this.resolucoes = resolucoes;
	}
	

}
