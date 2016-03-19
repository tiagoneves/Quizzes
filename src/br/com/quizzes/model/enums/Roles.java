package br.com.quizzes.model.enums;

import java.io.Serializable;

public enum Roles implements Serializable {
	
	ADMIN("Administrador"),
	CONCURSEIRO("Concurseiro"),
	VESTIBULANDO("Vestibulando"),
	PROFESSOR("Professor"),
	ALUNO("Aluno");
	
	private final String texto;
	
	private Roles(String texto){
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return texto;
	}

}
