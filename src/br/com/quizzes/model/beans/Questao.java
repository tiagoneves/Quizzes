package br.com.quizzes.model.beans;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.quizzes.model.enums.TipoQuestao;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@Table(name="QUESTOES")
public class Questao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 342606134976497607L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="prova_id",
			referencedColumnName="id")
	private Prova prova;
	
	@Column(nullable=false)
	private String enunciado;
	
	@ManyToMany(mappedBy="questoes")
	private List<Assunto> assuntos;
	
	@ManyToMany(mappedBy="questoes")
	private List<Texto> textos;
	
	@Column
	private String comentario;
	
	@OneToMany(mappedBy="questao")
	private List<Resolucao> resolucoes;
	
	@Enumerated(EnumType.STRING)
	@Column(length=16, nullable=false)
	private TipoQuestao tipoQuestao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public List<Assunto> getAssuntos() {
		return assuntos;
	}

	public void setAssuntos(List<Assunto> assuntos) {
		this.assuntos = assuntos;
	}

	public List<Texto> getTextos() {
		return textos;
	}

	public void setTextos(List<Texto> textos) {
		this.textos = textos;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public List<Resolucao> getResolucoes() {
		return resolucoes;
	}

	public void setResolucoes(List<Resolucao> resolucoes) {
		this.resolucoes = resolucoes;
	}

	public TipoQuestao getTipoQuestao() {
		return tipoQuestao;
	}

	public void setTipoQuestao(TipoQuestao tipoQuestao) {
		this.tipoQuestao = tipoQuestao;
	}
	
	

}
