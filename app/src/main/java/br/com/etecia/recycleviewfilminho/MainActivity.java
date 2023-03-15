package br.com.etecia.recycleviewfilminho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> lFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lFilmes = new ArrayList<>();

        lFilmes.add(
                new Filmes("Interestelar",getString(R.string.inter),"Ficção cinetífica",R.drawable.interestelar)
        );

        MyAdapter adapter = new MyAdapter(getApplicationContext(),lFilmes);

    }
}