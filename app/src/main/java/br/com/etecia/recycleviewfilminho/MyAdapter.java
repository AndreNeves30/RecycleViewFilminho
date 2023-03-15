package br.com.etecia.recycleviewfilminho;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private Context mCon;
    private List<Filmes> listaFilmes;

    public MyAdapter(Context mCon, List<Filmes> listaFilmes) {
        this.mCon = mCon;
        this.listaFilmes = listaFilmes;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView idTitulo;
        ImageView idImg;
        CardView idCard;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            idTitulo = itemView.findViewById(R.id.idTituloFilmes);
            idImg = itemView.findViewById(R.id.idImgFilmes);
            idCard = itemView.findViewById(R.id.idCardFilmes);

        }
    }

}
