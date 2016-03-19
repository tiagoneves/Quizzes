package br.com.quizzes.model.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="DISCURSIVAS")
public class Discursiva extends Questao {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4961762073161054961L;

	@Column(nullable=false)
	private Integer minimoLinhas;
	
	@Column(nullable=false)
	private Integer maximoLinhas;

	public Integer getMinimoLinhas() {
		return minimoLinhas;
	}

	public void setMinimoLinhas(Integer minimoLinhas) {
		this.minimoLinhas = minimoLinhas;
	}

	public Integer getMaximoLinhas() {
		return maximoLinhas;
	}

	public void setMaximoLinhas(Integer maximoLinhas) {
		this.maximoLinhas = maximoLinhas;
	}
	
	

}
