package br.com.quizzes.model.dao;

import br.com.quizzes.model.beans.Texto;

public class TextoDAO extends JPADAO<Texto>{

	public TextoDAO() {
		super(Texto.class);
	}

}
