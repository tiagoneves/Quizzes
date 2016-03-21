package br.com.quizzes.model.dao;

import br.com.quizzes.model.beans.Usuario;

public class UsuarioDAO extends JPADAO<Usuario>{

	public UsuarioDAO() {
		super(Usuario.class);
	}

}
