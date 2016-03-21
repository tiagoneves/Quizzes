package br.com.quizzes.controller.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import br.com.quizzes.model.beans.Role;
import br.com.quizzes.model.beans.RoleUsuario;
import br.com.quizzes.model.beans.Usuario;
import br.com.quizzes.model.dao.RoleDAO;
import br.com.quizzes.model.dao.RoleUsuarioDAO;
import br.com.quizzes.model.dao.UsuarioDAO;
import br.com.quizzes.model.enums.Roles;

public class LoadServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8520321712941345891L;
	
	private static final boolean TESTE = true;
	
	private RoleDAO roleDao = new RoleDAO();
	private RoleUsuarioDAO roleUsuarioDao = new RoleUsuarioDAO();
	private UsuarioDAO usuarioDao = new UsuarioDAO();


	
	@Override
	public void init() throws ServletException {
		
		super.init();
		
		if (TESTE){
			
			cadastrarRoles();
			
			cadastrarUsuarios();
			
		}
		
		
	}
	
	private void cadastrarRoles(){
				
		Role admin = new Role();
		admin.setNome(Roles.ADMIN);			
		roleDao.salvar(admin);
		
		Role concurseiro = new Role();
		concurseiro.setNome(Roles.CONCURSEIRO);
		roleDao.salvar(concurseiro);
	}
	
	private void cadastrarUsuarios(){
		
		Role admin = roleDao.obterRolePorNome(Roles.ADMIN);
		RoleUsuario adminRole = new RoleUsuario();
		adminRole.setNomeUsuario("admin@mail.com");
		adminRole.setRole(admin);
		roleUsuarioDao.salvar(adminRole);
		Usuario adminUsuario = new Usuario();
		adminUsuario.setNome("Administrador");
		adminUsuario.setRoleUsuario(adminRole);
		adminUsuario.setSenha("abc123");
		usuarioDao.salvar(adminUsuario);
		
		Role concurseiro = roleDao.obterRolePorNome(Roles.CONCURSEIRO);
		RoleUsuario concurseiroRole = new RoleUsuario();
		concurseiroRole.setNomeUsuario("concurseiro@mail.com");
		concurseiroRole.setRole(concurseiro);
		roleUsuarioDao.salvar(concurseiroRole);
		Usuario concurseiroUsuario = new Usuario();
		concurseiroUsuario.setNome("Concurseiro");
		concurseiroUsuario.setRoleUsuario(concurseiroRole);
		concurseiroUsuario.setSenha("123abc");
		usuarioDao.salvar(concurseiroUsuario);
		
	}
	
}
