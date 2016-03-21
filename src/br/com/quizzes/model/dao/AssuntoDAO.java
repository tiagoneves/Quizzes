package br.com.quizzes.model.dao;

import br.com.quizzes.model.beans.Assunto;

public class AssuntoDAO extends JPADAO<Assunto>{

	public AssuntoDAO() {
		super(Assunto.class);
	}

}
