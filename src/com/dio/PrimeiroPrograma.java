package com.dio;

import com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato gato = new Gato("Gato", "Preto", 30);
		System.out.println(gato.getNome());
		
	}

}

class Livro {
	private String nome;
	private String npag;
}
