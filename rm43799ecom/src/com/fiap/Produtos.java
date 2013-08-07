package com.fiap;

import javax.face


@ManagedData
public class Produtos {

	private int codProduto;
	private String descricao;
	private String foto;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String btnPesquisar()
	{
		if (getCodProduto()==1)
		{
			setDescricao("Calca");
			setFoto("Calca.jpg");
		}
		else
		{
			setDescricao("Blusa");
			setFoto("Blusa.jpg");
		}	
		
		return "";
	}
	
	public int getCodProduto()
	{
		return codProduto;
	}
	
	public void setCodProduto(int codProduto)
	{
		this.codProduto =codProduto;
		
	}
	
}
