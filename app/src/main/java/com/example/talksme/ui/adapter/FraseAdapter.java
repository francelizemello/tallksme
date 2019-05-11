package com.example.talksme.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.talksme.R;
import com.example.talksme.model.Frase;
import com.example.talksme.ui.holder.FraseHolder;
import com.example.talksme.ui.interfaces.RecyclerViewOnClickListenerHack;

import java.util.List;

public class FraseAdapter extends RecyclerView.Adapter<FraseHolder> {

    private Context context;
    private List<Frase> frases;
    private RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack;

    public FraseAdapter(Context context, List<Frase> frases) {
        this.context = context;
        this.frases = frases;
    }

    public void setRecyclerViewOnClickListenerHack(RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack) {
        this.recyclerViewOnClickListenerHack = recyclerViewOnClickListenerHack;
    }

    @NonNull
    @Override
    public FraseHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FraseHolder(LayoutInflater.from(context).inflate(R.layout.item_catalago,
                parent, false), this.recyclerViewOnClickListenerHack, frases);
    }

    @Override
    public void onBindViewHolder(@NonNull FraseHolder holder, int position) {
        holder.bindFrase(context, frases.get(position));
    }

    @Override
    public int getItemCount() {
        return frases != null ? frases.size() : 0;
    }
}

