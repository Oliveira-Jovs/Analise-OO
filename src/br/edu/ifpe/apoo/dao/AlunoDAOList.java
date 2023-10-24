package br.edu.ifpe.apoo.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.apoo.entidades.Aluno;

public class AlunoDAOList implements AlunoDAO{

	List<AlunoDAOList> lista = new ArrayList<>();
	public void inserir(AlunoDAOList aluno) {
		lista.add(aluno);
		
	}

	
	public void atualizar(Aluno aluno) {
	
		
	}

	
	public boolean remover(long id) {
		
		return false;
	}

	@Override
	public Aluno get(long id) {

		return null;
	}


	@Override
	public Aluno consultarAluno(long id) {
		
		return null;
	}


	@Override
	public void inserir(Aluno aluno) {
		// TODO Auto-generated method stub
		
	}

	 
}
