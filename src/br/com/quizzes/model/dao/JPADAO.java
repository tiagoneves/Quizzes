package br.com.quizzes.model.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.quizzes.model.dao.DAO;

public class JPADAO<T> implements DAO<T> {
	
	private Class<T> classe;
	
	private static EntityManagerFactory emf;
	
	public static void init() {
		emf = Persistence.createEntityManagerFactory("modelo-quizzes");
	}

	public static EntityManagerFactory getEntityManagerFactory() {
		if (emf == null)
			init();
		return emf;
	}
	
	public JPADAO(Class<T> classe) {
		super();
		this.classe = classe;
	}

	@Override
	public void salvar(T bean) {

		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.persist(bean);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void atualizar(T bean) {

		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.merge(bean);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public void excluir(T bean) {

		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		em.remove(bean);
		em.getTransaction().commit();
		em.close();
		
	}

	@Override
	public T getBean(Serializable codigo) {
		
		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		T bean = em.find(classe, codigo);
		em.getTransaction().commit();
		em.close();
		return bean;
		
	}

	@Override
	public List<T> getBeans() {
		
		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<T> cq = cb.createQuery(classe);
		Root<T> bean = cq.from(classe);
		cq.select(bean);
		TypedQuery<T> q = em.createQuery(cq);
		List<T> beans = q.getResultList();
		em.getTransaction().commit();
		em.close();
		return beans;
		
	}


}
