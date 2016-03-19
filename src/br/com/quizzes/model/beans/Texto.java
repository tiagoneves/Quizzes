package br.com.quizzes.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="TEXTOS")
public class Texto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2768401293767958526L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=50)
	private String titulo;
	
	@Lob
	@Basic(fetch=FetchType.LAZY, optional=false)
	private String corpo;
	
	@ManyToMany
	@JoinTable(name="TEXTO_QUESTAO",
		joinColumns=
	    	@JoinColumn(name="texto_id", referencedColumnName="id"),
	    inverseJoinColumns=
	        @JoinColumn(name="questao_id", referencedColumnName="id")
	 )
	private List<Questao> questoes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	
	

}
