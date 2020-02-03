package com.example.victor.recyclerviewrepaso;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 01/02/2017.
 */

public class AdaptadorRecyclerViewProfesor extends RecyclerView.Adapter<AdaptadorRecyclerViewProfesor.ClientViewHolder>{

    private List<Profesor>listaProfesor;

    public AdaptadorRecyclerViewProfesor(ArrayList<Profesor> profesores) {
        this.listaProfesor = profesores;
    }

    public static class ClientViewHolder extends RecyclerView.ViewHolder{
       public TextView NombreApellidos;
       public TextView asignatura;
       public TextView telefono;

        public ClientViewHolder(View itemView) {
            super(itemView);

            NombreApellidos = (TextView) itemView.findViewById(R.id.NombreApellidos);
            asignatura = (TextView)itemView.findViewById(R.id.Asignatura);
            telefono = (TextView)itemView.findViewById(R.id.Telefono);
        }
    }

    @Override
    public AdaptadorRecyclerViewProfesor.ClientViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_cliente,parent,false);
        return new ClientViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdaptadorRecyclerViewProfesor.ClientViewHolder holder, int position) {
        holder.NombreApellidos.setText(listaProfesor.get(position).getNombre());
        holder.telefono.setText(listaProfesor.get(position).getTelefono());
        holder.asignatura.setText(listaProfesor.get(position).getasignatura());
    }

    @Override
    public int getItemCount() {
        return listaProfesor.size();
    }
}
