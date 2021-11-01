package br.com.java.modelo;


public class Aluno extends Pessoa {
	
	private int id_aluno;

	public Aluno() {
		
		// TODO Auto-generated constructor stub
	}
	
	

	public Aluno(int id_aluno) {
		super();
		this.id_aluno = id_aluno;
	}



	public int getId_aluno() {
		return id_aluno;
	}

	public void setId_aluno(int id_aluno) {
		this.id_aluno = id_aluno;
	}
}
