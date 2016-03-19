package br.com.quizzes.model.enums;

import java.io.Serializable;

public enum TipoQuestao implements Serializable {
	
	CERTO_OU_ERRADO("Certo ou Errado"),
	DISCURSIVA("Discursiva"),
	MULTIPLA_ESCOLHA("Múltipla Escolha");
	
	private final String texto;
	
	private TipoQuestao(String texto){
		this.texto = texto;
	}
	
	@Override
	public String toString() {
		return texto;
	}

}
