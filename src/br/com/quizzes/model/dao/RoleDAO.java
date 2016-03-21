package br.com.quizzes.model.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.quizzes.model.beans.Role;
import br.com.quizzes.model.enums.Roles;

public class RoleDAO extends JPADAO<Role>{

	public RoleDAO() {
		super(Role.class);
	}
	
	public Role obterRolePorNome(Roles nomeRole){
		
		EntityManager em = getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		
		StringBuilder q = new StringBuilder("select r from Role r ")
		.append("where r.nome = :nomeRole");
	
		Query query = em.createQuery(q.toString())
				.setParameter("nomeRole", nomeRole);
		
		Role role = (Role) query.getSingleResult();
				
		em.getTransaction().commit();
		em.close();
		
		return role;
		
	}

}
