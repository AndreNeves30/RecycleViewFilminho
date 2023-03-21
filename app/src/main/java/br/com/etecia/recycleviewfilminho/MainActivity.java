package br.com.etecia.recycleviewfilminho;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView idRecyclerView;
    List<Filmes> lFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idRecyclerView = findViewById(R.id.idListaFilmes);

        lFilmes = new ArrayList<>();

        lFilmes.add(
                new Filmes("Interestelar",getString(R.string.inter),"Ficção cinetífica",R.drawable.interestelar));
        lFilmes.add(
                new Filmes("Interestelar",getString(R.string.inter),"Ficção cinetífica",R.drawable.interestelar));
        lFilmes.add(
                new Filmes("Interestelar",getString(R.string.inter),"Ficção cinetífica",R.drawable.interestelar));
        lFilmes.add(
                new Filmes("Interestelar",getString(R.string.inter),"Ficção cinetífica",R.drawable.interestelar));

        MyAdapter adapter = new MyAdapter(getApplicationContext(),lFilmes);

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));

        idRecyclerView.setHasFixedSize(true);

        idRecyclerView.setAdapter(adapter);
    }
}