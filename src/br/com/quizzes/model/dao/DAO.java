package br.com.quizzes.model.dao;

import java.io.Serializable;
import java.util.List;

public interface DAO<T> {
	
	void salvar(T bean);
	void atualizar(T bean);
	void excluir(T bean);
	T getBean(Serializable codigo);
	List<T> getBeans();

}
