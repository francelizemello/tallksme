package com.example.talksme.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.talksme.R;
import com.example.talksme.model.Serie;
import com.example.talksme.ui.holder.CatalagoHolder;
import com.example.talksme.ui.interfaces.RecyclerViewOnClickListenerHack;

import java.util.List;

public class CatalagoAdapter extends RecyclerView.Adapter<CatalagoHolder> {

    private Context context;
    private List<Serie> series;
    private RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack;

    public CatalagoAdapter(Context context, List<Serie> series) {
        this.context = context;
        this.series = series;
    }

    public void setRecyclerViewOnClickListenerHack(RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack) {
        this.recyclerViewOnClickListenerHack = recyclerViewOnClickListenerHack;
    }

    @NonNull
    @Override
    public CatalagoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CatalagoHolder(LayoutInflater.from(context).inflate(R.layout.item_catalago,
                parent, false), this.recyclerViewOnClickListenerHack, series);
    }

    @Override
    public void onBindViewHolder(@NonNull CatalagoHolder holder, int position) {
        holder.bindCatalago(context, series.get(position));
    }

    @Override
    public int getItemCount() {
        return series != null ? series.size() : 0;
    }
}
