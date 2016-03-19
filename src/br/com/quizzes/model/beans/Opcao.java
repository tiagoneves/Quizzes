package br.com.quizzes.model.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="OPCOES")
public class Opcao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3098176751049908809L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private Character letra;
	
	@Column(length=100, nullable=false)
	private String assertiva;
	
	@ManyToOne
	@JoinColumn(name="questao_id",
			referencedColumnName="id")
	private Questao questao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Character getLetra() {
		return letra;
	}

	public void setLetra(Character letra) {
		this.letra = letra;
	}

	public String getAssertiva() {
		return assertiva;
	}

	public void setAssertiva(String assertiva) {
		this.assertiva = assertiva;
	}

	public Questao getQuestao() {
		return questao;
	}

	public void setQuestao(Questao questao) {
		this.questao = questao;
	}
	
	

}
