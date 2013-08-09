package com.fiap.vendas;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        Button botao = (Button)findViewById(R.id.btnPesquisar);
        botao.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) 
	{
		TextView codProduto = (TextView)findViewById(R.id.txtCodProduto2);
		TextView descricao = (TextView)findViewById(R.id.txtDescricao);
		
		AlertDialog.Builder b = new AlertDialog.Builder(this);
		
		if (codProduto.getText().toString().equals("1"))
		{
			descricao.setText("Blusa");
			b.setTitle("10 REAL");
		}
		else
		{
			descricao.setText("Calca");
			b.setTitle("20 REAL");
		}
		
		
		
		b.setMessage("Promoção de liquidação na sexta");
		b.setPositiveButton("OK", null);
		b.show();
	}
    
}
