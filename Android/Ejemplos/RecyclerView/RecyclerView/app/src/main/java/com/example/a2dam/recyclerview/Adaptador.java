package com.example.a2dam.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2dam on 10/11/2016.
 */
public class Adaptador extends RecyclerView.Adapter<Adaptador.ClientViewHolder> {

    private List<Calabaza> listaCalabazas;
    

    public Adaptador(List<Calabaza> calabaza){
        this.listaCalabazas = calabaza;
    }

    public static class ClientViewHolder extends RecyclerView.ViewHolder{

        public ImageView img;

        public TextView dia;

        public TextView desc;

        public ClientViewHolder(View v) {

            super(v);

            img = (ImageView) v.findViewById(R.id.imagenCalabaza);

            dia = (TextView) v.findViewById(R.id.DiaSemana);

            desc = (TextView) v.findViewById(R.id.DescSemana);

        }

    }

    public int getItemCount(){

        return this.listaCalabazas.size();

    }

    public ClientViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()) .inflate(R.layout.contenido_calabaza, parent, false);
        return new ClientViewHolder(v);

    }

    public void onBindViewHolder(ClientViewHolder holder, int position) {
        holder.img.setImageResource(this.listaCalabazas.get(position).getImg());
        holder.dia.setText(this.listaCalabazas.get(position).getDia());
        holder.desc.setText(this.listaCalabazas.get(position).getDesc());

    }

}
