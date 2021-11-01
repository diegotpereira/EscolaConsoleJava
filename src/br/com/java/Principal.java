package br.com.java;

import java.security.DrbgParameters.NextBytes;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.java.modelo.Aluno;
import br.com.java.modelo.Curso;
import br.com.java.modelo.Professor;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		Curso curso = new Curso();
		
		System.out.println("Digite seu nome: ");
		aluno.setNome(entrada.nextLine());
		
		if (aluno.getNome().isEmpty()) {
			System.out.println("O campo nome não pode estar vazio..!");
			
			return;
		} 
		
	
		//aluno.setNome("João");
		
		System.out.println("Digite seu cpf: ");
		aluno.setCpf(entrada.nextLine());
		//aluno.setCpf("824-749-900-20");
		
		System.out.println("Digite seu endereço: ");
		aluno.setEndereco(entrada.nextLine());
		//aluno.setEndereco("Rua Zaire 142, Gravataí - RS-Brasil");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Digite sua data de nascimento: ");
		String nascimento = entrada.nextLine();
		
		
		try {
			aluno.setNascido(sdf.parse(nascimento));
			
			} catch (ParseException e) {
				
			System.err.println("Data informada no formato errado!!!");

			}
		
		System.out.println("Digite o nome do Professor; ");
		professor.setNome(entrada.nextLine());
		
		System.out.println("Digite o nome do curso: ");
		curso.setNome_curso(entrada.next());
		
		
		
		System.out.println("Seu nome é: " + aluno.getNome() + " com cpf: " + aluno.getCpf() + " morando na rua: " + aluno.getEndereco() + " nascido em :" + aluno.getNascido() + " com o professor: " + professor.getNome() + " estudando o curso: " + curso.getNome_curso()); 

	}

}
