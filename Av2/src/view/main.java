package view;

import java.util.Scanner;

import controller.Atualizar;
import controller.BuscarID;
import controller.BuscarRegistros;
import controller.Cadastrar;
import controller.Deletar;
import model.Contato;

public class main {

	public static void main(String[] args) {
		Contato contato = new Contato();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******Cadastro de Contatos******");
		System.out.println("Seja bem vindo(a)!" + "\n");
		
	    System.out.println("1 - Cadastrar novo contato;");
	    System.out.println("2 - Atualizar contato;");
	    System.out.println("3 - Listar todos contatos;");
	    System.out.println("4 - Buscar por ID;");
	    System.out.println("5 - Excluir contato;");
	    System.out.println("0 - Sair"  + "\n");
		
		System.out.print("Digite a op��o desejada: ");
		int op = sc.nextInt();
		
		sc.nextLine();
		
		while(op != 0) {
			if(op == 1) {
				Contato contato2 = new Contato();
				
				System.out.println("\n");
				System.out.println("---> Cadastrar novo contato: ");
				
				System.out.print("Nome do contato: ");
				String nome = sc.nextLine();
				//sc.nextLine();
				
				System.out.print("Email do contato: ");
				String email = sc.nextLine();
				
				System.out.print("Endere�o do contato: ");
				String end = sc.nextLine();
				
				System.out.println("\n"); 
				
				contato2.setNome(nome);
				contato2.setEmail(email);
				contato2.setEndereco(end);
				
				Cadastrar.cadastrarContato(contato2);
				System.out.println("Contato " + nome + " cadastrado com sucesso!");
				System.out.println("\n");
			} else if (op == 2) {
				System.out.println("\n");
				System.out.println("---> Atualizar contato: ");
				
				System.out.print("Digite o ID do contato: ");
				Long id = sc.nextLong();
				sc.nextLine();
				
				System.out.print("Novo nome do contato: ");
				String nome = sc.nextLine();
				//sc.nextLine();
				
				System.out.print("Novo Email do contato: ");
				String email = sc.nextLine();
				
				System.out.print("Novo Endere�o do contato: ");
				String end = sc.nextLine();
		
				contato.setId(id);
				contato.setNome(nome);
				contato.setEmail(email);
				contato.setEndereco(end);
				
				Atualizar.atualizarContato(contato);
				
				System.out.println("Contato atualizado com sucesso!" + "\n" + "ID: " + contato.getId() + " // Nome: " + contato.getNome());
				System.out.println("\n");
				
			} else if(op == 3) {
				System.out.println("\n");
				System.out.println("---> Lista de todos os registros: ");
				
				BuscarRegistros.listarRegistros();
				
			} else if(op == 4) {
				System.out.println("\n");
				System.out.println("---> Bsucar por ID ");
				
				System.out.print("Digite o ID do contato: ");
				Long id = sc.nextLong();
				sc.nextLine();
				
				contato.setId(id);
				
				BuscarID.buscarID(contato);
			} else if(op == 5) {
				System.out.println("\n");
				System.out.println("---> Deletar contato");
				
				System.out.print("Digite o ID do contato: ");
				Long id = sc.nextLong();
				sc.nextLine();
				
				contato.setId(id);
				
				Deletar.deletarContato(contato);
				
				System.out.println("Contato de ID: " + contato.getId() + " deletado com sucesso!" + "\n");
	
			} else {
				System.out.println("\n");
				System.out.println("Op��o inv�lida!");
				System.out.println("\n");
			}
			
			System.out.print("Para sair digite 0 ou a op��o desejada: ");
			op = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("Programa encerrado.");
		
	}

}
