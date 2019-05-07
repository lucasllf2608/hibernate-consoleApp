package br.com.hibernateConsole.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.SessionFactory;

import com.fasterxml.classmate.AnnotationConfiguration;

import br.com.hibernateConsole.Model.entity.Game;
import br.com.hibernateConsole.util.JpaUtil;

public class GameController {

	EntityManagerFactory emf;
	EntityManager em;
	
	
	public GameController() {
		emf= Persistence.createEntityManagerFactory("game");
		em = emf.createEntityManager();
	}
	
	
	public List<Game> listarGames(){

		em.getTransaction().begin();
		Query consulta = em.createNativeQuery("select * from game");
		consulta.getResultList();
		List<Game> games 	= null;
		em.getTransaction().commit();
		emf.close();
		
		return games;
	}
	
	
	public void salvarGame(Game game) {
		em.getTransaction().begin();
		em.merge(game);
		em.getTransaction().commit();
		emf.close();
	}
	
	
	
	public void salvar(Game game) {
			EntityManager em = JpaUtil.getEntityManager();
			em.getTransaction().begin();
			em.persist(game);
			em.getTransaction().commit();
	}
	
	
	public void removerGame(Game game) {
		em.getTransaction().begin();
		Query query = em.createNativeQuery("delete from game where id ="+game.getId());
		query.executeUpdate();
		em.getTransaction().commit();
		emf.close();
	}
	
}
