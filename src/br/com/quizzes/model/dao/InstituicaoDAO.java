package br.com.quizzes.model.dao;

import br.com.quizzes.model.beans.Instituicao;

public class InstituicaoDAO extends JPADAO<Instituicao>{

	public InstituicaoDAO() {
		super(Instituicao.class);
	}

}
