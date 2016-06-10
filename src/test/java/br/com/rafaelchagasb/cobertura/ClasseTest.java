package br.com.rafaelchagasb.cobertura;

import org.junit.Test;

import br.com.rafaelchagasb.cobertura.Classe;

public class ClasseTest {
	
	@Test
	public void testMetodoCoberto(){
		
		new Classe().metodoCoberto();
		
	}
	
	@Test
	public void testMetodoParcialmenteCoberto(){
		
		new Classe().metodoParcialmenteCoberto(false);
		
	}
	
}
