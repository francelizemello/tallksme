package com.example.talksme.ui.holder;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.talksme.R;
import com.example.talksme.model.Serie;
import com.example.talksme.ui.interfaces.RecyclerViewOnClickListenerHack;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CatalagoHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView _tvNome;
    private AppCompatImageView _imgCartaz;

    private RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack;
    private List<Serie> series;

    public CatalagoHolder(View itemView, RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack, List<Serie> series) {
        super(itemView);
        this.recyclerViewOnClickListenerHack = recyclerViewOnClickListenerHack;
        this.series = series;
        _tvNome = itemView.findViewById(R.id.tv_catalago_item);
        _imgCartaz = itemView.findViewById(R.id.iv_catalago_item);
        itemView.setOnClickListener(this);
    }

    public void bindCatalago(Context context, Serie serie) {
        _tvNome.setText(serie.getNome());
        Picasso.get().load(serie.getCartaz()).into(_imgCartaz);
    }

    @Override
    public void onClick(View v) {
        if (this.recyclerViewOnClickListenerHack != null) {
            this.recyclerViewOnClickListenerHack.onClickListener(v, getLayoutPosition(), series.get(getLayoutPosition()));
        }
    }

}
