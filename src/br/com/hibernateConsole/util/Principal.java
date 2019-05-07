package br.com.hibernateConsole.util;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fasterxml.classmate.AnnotationConfiguration;

import br.com.hibernateConsole.Model.entity.Game;
import br.com.hibernateConsole.controller.GameController;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leitor = new Scanner(System.in);
		

		//Game jogo = new Game();
		//jogo.setNome("counter strike");
		//jogo.setDescricao("jogo de tiro");
	
		int opt = 1;
	
	while (opt != 0) {
		
		System.out.println("Iniciar");
		System.out.println("Listar Jogos - 1");
		System.out.println("Cadastrar Jogo - 2");
		System.out.println("Remover Jogo - 3");
		System.out.println("Sair - 0");
		opt = leitor.nextInt();	
		
		switch (opt) {
		case 1:
			
			
			

			
			break;
		case 2:
			Game game = new Game();
			System.out.println("Nome do Game:");
			game.setNome(leitor.next());
			System.out.println("Descrição do Game:");
			game.setDescricao(leitor.next());
			System.out.println(game.toString());
			
			GameController gc = new GameController();
			gc.salvar(game);
			
			break;
		case 3:
			Game game2 = new Game();
			game2.setId(6);
			GameController gc2 = new GameController();
			gc2.removerGame(game2);
			
			break;	
			
		default:
			break;
		}
		
		if(opt == 0) {
			System.out.println("Fim");
		}
		

		
		
	}
	
		

		
		
	//	EntityManager em = JpaUtil.getEntityManager();
		
		//em.getTransaction().begin();
		//em.persist(jogo);
		//em.getTransaction().commit();
		
	
		
	
		

	}

}
