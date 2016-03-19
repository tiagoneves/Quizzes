package br.com.quizzes.model.beans;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="RESOLUCOES_DISCURSIVAS")
public class ResolucaoDiscursiva extends Resolucao {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8411785046722582369L;
	
	@Lob
	@Basic(fetch=FetchType.LAZY, optional=false)
	private String redacao;

	public String getRedacao() {
		return redacao;
	}

	public void setRedacao(String redacao) {
		this.redacao = redacao;
	}
	
	

}
