package br.com.fiap.loja;

import java.util.Scanner;

public class LojaFreeShop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		MoedaEstangeiraProxy converter = new MoedaEstangeiraProxy();
		System.out.println("Digite o valor em Dolar:");
		
		try
		{
			Scanner teclado = new Scanner(System.in);
			int valorDolar =teclado.nextInt();
			int valorReal=converter.converterDolar(valorDolar);
			System.out.println("Valor em Real:"+valorReal);
		}
		catch (Exception e)
		{
			System.out.println("Erro. Tente Mais tarde")
		}

	}

}
