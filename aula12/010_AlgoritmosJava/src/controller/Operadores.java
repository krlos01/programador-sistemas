package controller;

import util.Teclado;

public class Operadores {

	public static void main(String[] args) {
	String nome;
	
	nome = Teclado.lertexto("Digite o nome do aluno: ");
	
	int nota1,nota2,nota3,nota4;
	nota1 = Teclado.lerInt("Digite a 1° nota: ");	
	nota2 = Teclado.lerInt("Digite a 2° nota: ");	
	nota3 = Teclado.lerInt("Digite a 3° nota: ");
	nota4 = Teclado.lerInt("Digite a 4° nota: ");
	
	int media = nota1 + nota2 + nota3 + nota4;
	media = media/4;
	
	System.out.println("Nome: "+ nome);
    System.out.println("Média: "+ media);
  
	}

}
