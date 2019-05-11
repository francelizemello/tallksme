package com.example.talksme.ui.holder;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.talksme.R;
import com.example.talksme.model.Frase;
import com.example.talksme.model.Serie;
import com.example.talksme.ui.interfaces.RecyclerViewOnClickListenerHack;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FraseHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView _tvTitulo;
    private TextView _tvMensagem;
    private AppCompatImageView _imgAtor;

    private RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack;
    private List<Frase> frases;

    public FraseHolder(View itemView, RecyclerViewOnClickListenerHack recyclerViewOnClickListenerHack, List<Frase> frases) {
        super(itemView);
        this.recyclerViewOnClickListenerHack = recyclerViewOnClickListenerHack;
        this.frases = frases;
        _tvTitulo = itemView.findViewById(R.id.tv_frase_titulo_item);
        _tvMensagem = itemView.findViewById(R.id.tv_frase_mensagem_item);
        _imgAtor = itemView.findViewById(R.id.iv_frase_item);
        itemView.setOnClickListener(this);
    }

    public void bindFrase(Context context, Frase frase) {
        _tvMensagem.setText(frase.getDescricao());
        //Picasso.get().load(serie.getCartaz()).into(_imgAtor);
    }

    @Override
    public void onClick(View v) {
        if (this.recyclerViewOnClickListenerHack != null) {
            this.recyclerViewOnClickListenerHack.onClickListener(v, getLayoutPosition(), frases.get(getLayoutPosition()));
        }
    }

}

