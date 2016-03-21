package br.com.quizzes.model.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ROLES_USUARIOS")
public class RoleUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -9208095303552532706L;
	
	@Id
	@Column(length=20, nullable=false, unique=true)
	private String nomeUsuario;
	
	@ManyToOne
	@JoinColumn(name="nome_role",
			referencedColumnName="nome")
	private Role role;
	
	@OneToOne(mappedBy="roleUsuario")
	private Usuario usuario;
	
	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


}
