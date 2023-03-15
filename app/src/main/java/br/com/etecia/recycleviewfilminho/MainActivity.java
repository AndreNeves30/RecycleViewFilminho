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
                new Filmes("Interestelar","Uma equipe de exploradores viaja além desta galáxia através de um buraco de minhoca recém-descoberto para descobrir se a humanidade tem futuro entre as estrelas.\n","Ficção cinetífica",R.drawable.interestelar)
        );

        MyAdapter adapter = new MyAdapter(getApplicationContext(),);

    }
}