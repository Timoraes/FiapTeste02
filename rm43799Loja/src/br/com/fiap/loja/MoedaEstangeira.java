package br.com.fiap.loja;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * MoedaEstangeira. Classe responsável pelo tratameno da moeda americana
 * @author - Leandro David
 */
public class MoedaEstangeira {
	
	
	/**
	 * Converter dolar.
	 *
	 * @param valor the valor
	 * @return the int
	 */
	public int converterDolar(int valor){
		if (valor <0) return 0;
		return valor*2;
		
	}
	



}