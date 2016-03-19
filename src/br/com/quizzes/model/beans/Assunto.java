package br.com.quizzes.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ASSUNTOS")
public class Assunto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4266192712272701105L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length=100, nullable=false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(name="materia_id",
			referencedColumnName="id")
	private Materia materia;
	
	@ManyToMany
	@JoinTable(name="ASSUNTO_QUESTAO",
		joinColumns=
	    	@JoinColumn(name="assunto_id", referencedColumnName="id"),
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	
	

}
