package com.example.pertemuan4_1918070;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class IkanAdapter extends RecyclerView.Adapter<IkanAdapter.IkanViewHolder>{
    private ArrayList<Ikan> dataList;
    public IkanAdapter(ArrayList<Ikan> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public IkanAdapter.IkanViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_ikan, parent, false);
        return new IkanViewHolder(view);
    }
    public void onBindViewHolder(IkanViewHolder holder, int position) {
        holder.Foto.setImageResource(dataList.get(position).getFoto());
        holder.Nama.setText(dataList.get(position).getNama());
        holder.Asal.setText(dataList.get(position).getAsal());
        holder.Ciriciri.setText(dataList.get(position).getCiriciri());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class IkanViewHolder extends RecyclerView.ViewHolder{
        private TextView Nama, Asal, Ciriciri;
        private ImageView Foto;
        public IkanViewHolder(View itemView) {
            super(itemView);
            Foto = (ImageView) itemView.findViewById(R.id.foto);
            Nama = (TextView)itemView.findViewById(R.id.nama);
            Asal = (TextView) itemView.findViewById(R.id.asal);
            Ciriciri = (TextView) itemView.findViewById(R.id.ciriciri);
        }
    }
}
