package br.edu.ifpe.apoo.apresentacao;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;

import br.edu.ifpe.apoo.entidades.Aluno;
import br.edu.ifpe.apoo.excecoes.ExcecaoAlunoInvalido;
import br.edu.ifpe.apoo.negocio.ControladorAluno;

public class AlunoApresentacao {
	Scanner input = new Scanner(System.in);

	public void exibirMenu() throws ExcecaoAlunoInvalido {
		System.out.println("Digite a opção desejada");
		System.out.println("1 para inserir um aluno;");
		System.out.println("2 para consultar um aluno;");
		System.out.println("3 para remover um aluno;");
		System.out.println("4 para alterar um aluno;");
		
		Scanner scanner = new Scanner(System.in);
		int opcao = Integer.parseInt(scanner.nextLine());
		if (opcao == 1) {
			this.inserir();
		scanner.close();// sair o botao amarelo
		}
		if (opcao == 2  ) {
			this.atualizar(null);
		}
		
	}
	
	private void inserir() throws ExcecaoAlunoInvalido {
		Aluno aluno = new Aluno();
		aluno.setCpf("789.333.577-77"); // scanner.next...
		aluno.setNome("Victor");
		aluno.setEmail("vl@cin.upfe.br");
		
		
		
		ControladorAluno controlador = new ControladorAluno();
		controlador.inserir(aluno);
	}
	
	private void atualizar(Aluno aluno) throws ExcecaoAlunoInvalido{
		System.out.println("Qual aluno voce deseja alterar?");
		
		String nome = input.nextLine();
		
	consultarAluno
			
			ControladorAluno controlador = new ControladorAluno();
			controlador.inserir(aluno);
		}
		
		
		
	
		private void delete(Aluno aluno) throws ExcecaoAlunoInvalido {
		System.out.println("Qual aluno voce deseja alterar?");
		String nome = input.nextLine();
		if (nome.equals(aluno.getNome())) {
			ControladorAluno controlador = new ControladorAluno();
			controlador.delete(aluno);
		}
	}
}
