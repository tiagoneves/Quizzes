package br.com.quizzes.model.dao;

import br.com.quizzes.model.beans.Materia;

public class MateriaDAO extends JPADAO<Materia>{

	public MateriaDAO() {
		super(Materia.class);
	}

}
