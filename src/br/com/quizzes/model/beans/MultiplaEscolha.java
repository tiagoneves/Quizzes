package br.com.quizzes.model.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="MULTIPLA_ESCOLHA")
public class MultiplaEscolha extends Questao {

	/**
	 * 
	 */
	private static final long serialVersionUID = 756336474079596926L;
	
	@OneToMany(mappedBy="questao")
	private List<Opcao> opcoes;
	
	@OneToOne
	@JoinColumn(name="opcao_id",
			referencedColumnName="id")
	private Opcao correta;

	public List<Opcao> getOpcoes() {
		return opcoes;
	}

	public void setOpcoes(List<Opcao> opcoes) {
		this.opcoes = opcoes;
	}

	public Opcao getCorreta() {
		return correta;
	}

	public void setCorreta(Opcao correta) {
		this.correta = correta;
	}
	
	

}
