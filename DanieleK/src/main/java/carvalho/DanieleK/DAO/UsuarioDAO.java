package carvalho.DanieleK.DAO;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.*;

import carvalho.DanieleK.model.Usuario;

public class UsuarioDAO{
    protected EntityManager entityManager;
  
  	@Inject
      private EntityManager em;
  	
  	public Usuario findById(Long id) {
          return em.find(Usuario.class, id);
      }
  	
  	public List<Usuario> findAll(){
  		//Cria objeto que fará consulta
  		CriteriaBuilder cb = em.getCriteriaBuilder();
  		//Retorno é da classe Usuario
          CriteriaQuery<Usuario> criteria = cb.createQuery(Usuario.class);
          //From usuario
          Root<Usuario> usuario = criteria.from(Usuario.class);
          //Select todos os usuários
          criteria.select(usuario);
          //Executa a consulta e traz o retorno
          return em.createQuery(criteria).getResultList();
  	}
  	
  	public List<Usuario> findAllHQL() {
  	    return em.createQuery("SELECT cpf,nome FROM Usuario", 
  	    		Usuario.class).getResultList();      
  	}
  	
  	public void save(Usuario u) {
  		em.persist(u);
  	}
}
