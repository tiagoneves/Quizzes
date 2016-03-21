package br.com.quizzes.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.quizzes.model.enums.Roles;

@Entity
@Table(name="ROLES")
public class Role implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7700873645970960973L;
	
	@Id
	@Enumerated(EnumType.STRING)
	@Column(length=12, nullable=false, unique=true)
	private Roles nome;
	
	@OneToMany(mappedBy="role")
	private List<RoleUsuario> rolesUsuarios;

	public Roles getNome() {
		return nome;
	}

	public void setNome(Roles nome) {
		this.nome = nome;
	}

	public List<RoleUsuario> getRolesUsuarios() {
		return rolesUsuarios;
	}

	public void setRolesUsuarios(List<RoleUsuario> rolesUsuarios) {
		this.rolesUsuarios = rolesUsuarios;
	}
	
	

}
