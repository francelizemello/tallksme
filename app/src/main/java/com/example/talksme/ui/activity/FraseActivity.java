package com.example.talksme.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.talksme.R;
import com.example.talksme.model.Frase;
import com.example.talksme.ui.adapter.CatalagoAdapter;
import com.example.talksme.ui.adapter.FraseAdapter;
import com.example.talksme.ui.interfaces.RecyclerViewOnClickListenerHack;

import java.util.ArrayList;
import java.util.List;

public class FraseActivity extends AppCompatActivity implements RecyclerViewOnClickListenerHack {

    private RecyclerView _rvFrase;
    private List<Frase> mFrasesList;
    private FraseAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frase);
    }

    private  void instanciarViews () {
        _rvFrase = findViewById(R.id.rv_frase);
    }

    private  void configurarRecicleView (List<Frase> frasesList){
        mAdapter = new FraseAdapter(this, frasesList);
        mAdapter.setRecyclerViewOnClickListenerHack(this);
        _rvFrase.setAdapter(mAdapter);
    }

    private void getLisFrase(){
        mFrasesList = new ArrayList<>();
        Frase frase = new Frase();
        frase.setId(1);
        frase.setDescricao("essa frase aqui é do Damon Salvatore");
        frase.setIdPersonagem(1);
        frase.setIdPersonagem(1);

        Frase frase2 = new Frase();
        frase2.setId(1);
        frase2.setDescricao("essa frase aqui é do Damon Salvatore");
        frase2.setIdPersonagem(1);
        frase2.setIdPersonagem(1);

        Frase frase3 = new Frase();
        frase3.setId(1);
        frase3.setDescricao("essa frase aqui é do Damon Salvatore");
        frase3.setIdPersonagem(1);
        frase3.setIdPersonagem(1);

        Frase frase4 = new Frase();
        frase4.setId(1);
        frase4.setDescricao("essa frase aqui é do Damon Salvatore");
        frase4.setIdPersonagem(1);
        frase4.setIdPersonagem(1);

        Frase frase5 = new Frase();
        frase5.setId(1);
        frase5.setDescricao("essa frase aqui é do Damon Salvatore");
        frase5.setIdPersonagem(1);
        frase5.setIdPersonagem(1);

        mFrasesList.add(frase);
        mFrasesList.add(frase2);
        mFrasesList.add(frase3);
        mFrasesList.add(frase4);
        mFrasesList.add(frase5);

    }

    @Override
    public void onClickListener(View view, int position, Object item) {

    }
}
