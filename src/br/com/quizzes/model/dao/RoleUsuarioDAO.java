package br.com.quizzes.model.dao;

import br.com.quizzes.model.beans.RoleUsuario;

public class RoleUsuarioDAO extends JPADAO<RoleUsuario>{

	public RoleUsuarioDAO() {
		super(RoleUsuario.class);
	}

}
