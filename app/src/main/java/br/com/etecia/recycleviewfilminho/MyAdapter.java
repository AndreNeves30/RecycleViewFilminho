package br.com.etecia.recycleviewfilminho;


import android.content.Context;
import android.view.LayoutInflater;
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

        View view;

        LayoutInflater inflater = LayoutInflater.from(mCon);
        view = inflater.inflate(R.layout.modelo_filminhos,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.idTitulo.setText((listaFilmes.get(position).getTitulo()));
        holder.idImg.setImageResource((listaFilmes.get(position).getImagem()));
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
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
