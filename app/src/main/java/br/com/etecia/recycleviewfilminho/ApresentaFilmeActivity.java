package br.com.etecia.recycleviewfilminho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ApresentaFilmeActivity extends AppCompatActivity {

        TextView mTitulo, mCategoria, mDescricao;

        ImageView mImagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apresenta_filme_layout);

        mTitulo = findViewById(R.id.mTituloFilme);
        mCategoria = findViewById(R.id.mGeneroFilme);
        mDescricao = findViewById(R.id.mDescricaoFilme);
        mImagem = findViewById(R.id.mImagemFilme);

        Intent intent = getIntent();

        String titulo, descricao, categoria;
        int imagemFilme;

        titulo = intent.getExtras().getString("Titulo");
        descricao = intent.getExtras().getString("Descricao");
        categoria = intent.getExtras().getString("Categoria");

        imagemFilme = intent.getExtras().getInt("ImagemFilme");

        mTitulo.setText(titulo);
        mDescricao.setText(descricao);
        mCategoria.setText(categoria);
        mImagem.setImageResource(imagemFilme);

    }
}