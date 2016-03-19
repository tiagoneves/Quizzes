package br.com.quizzes.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CERTAS_OU_ERRADAS")
public class CertoErrado extends Questao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4555990902201181049L;

	@Column(nullable=false)
	private Boolean certo;

	public Boolean getCerto() {
		return certo;
	}

	public void setCerto(Boolean certo) {
		this.certo = certo;
	}

	

}
