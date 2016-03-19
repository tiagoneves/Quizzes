package br.com.quizzes.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="RESOLUCOES_OBJETIVAS")
public class ResolucaoObjetiva extends Resolucao{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9120807644817767766L;
	
	@Column(nullable=false)
	private Boolean acertou;

	public Boolean getAcertou() {
		return acertou;
	}

	public void setAcertou(Boolean acertou) {
		this.acertou = acertou;
	}
	
	


}
