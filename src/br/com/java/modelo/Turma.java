package br.com.java.modelo;

public class Turma {
	
	private int id_turma;
	private String turma;
	
	public Turma() {
		super();
	}
	
	public Turma(int id_turma, String turma) {
		super();
		this.id_turma = id_turma;
		this.turma = turma;
	}
	public int getId_turma() {
		return id_turma;
	}
	public void setId_turma(int id_turma) {
		this.id_turma = id_turma;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
}
