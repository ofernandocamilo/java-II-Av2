package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Contato;

public class BuscarID {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		Contato contato = manager.find(Contato.class, 1L);
		
		System.out.println("Registro encontrado! " + contato.getNome());

	}
	
	public static Contato buscarID(Contato contato) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		contato = manager.find(Contato.class, contato.getId());
		
		System.out.println("Registro encontrado! " + "\n" + 
		                    "Nome: " + contato.getNome() + "\n" +
		                    "Email: " + contato.getEmail() + "\n" +
		                    "Endere�o: " + contato.getEndereco() +
		                    "\n"
				);
		manager.close();
		return contato;	
	}

}
