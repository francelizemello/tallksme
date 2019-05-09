package com.example.talksme.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.talksme.R;
import com.example.talksme.model.Serie;
import com.example.talksme.ui.adapter.CatalagoAdapter;
import com.example.talksme.ui.interfaces.RecyclerViewOnClickListenerHack;

import java.util.ArrayList;
import java.util.List;


public class CatalagoFragment extends Fragment implements RecyclerViewOnClickListenerHack {

    private RecyclerView _rvCatalago;

    private CatalagoAdapter adapter;
    private  List<Serie>series;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_catalago, container, false);
        inicializarObjetos(view);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    public void inicializarObjetos(View view) {
        _rvCatalago = view.findViewById(R.id.rv_catalago);
        configuraViews();
    }

    public void configuraViews() {
        try {
            series = new ArrayList<>();
            Serie serie1 =new Serie();
            serie1.setNome("THE ORIGINALS");
            serie1.setId(1);
            serie1.setTipo(1);
            serie1.setCartaz("https://i2.wp.com/espalhafactos.com/wp-content/uploads/2017/02/CrxsGqWWEAACpeD.jpg?resize=540%2C500&ssl=1");

            Serie serie2 =new Serie();
            serie2.setNome("THE VAMPIRE DIARIES");
            serie2.setId(1);
            serie2.setTipo(1);
            serie2.setCartaz("https://s2.glbimg.com/nC_2OGxIcYPhXv_A5rmR67CZpmw=/0x600/s.glbimg.com/po/tt2/f/original/2014/09/11/0030e9a2012c450412313b030e0a.jpeg");

            Serie serie3 =new Serie();
            serie3.setNome("GOSSIP GIRL");
            serie3.setId(1);
            serie3.setTipo(1);
            serie3.setCartaz("http://g1.globo.com/Noticias/PopArte/foto/0,,15199139,00.jpg");

            Serie serie4 =new Serie();
            serie4.setNome("THE 100");
            serie4.setId(1);
            serie4.setTipo(1);
            serie4.setCartaz("https://contosereconto.files.wordpress.com/2015/05/the100.jpeg");

            if (adapter == null || adapter.getItemCount() == 0) {
                series.add(serie1);
                series.add(serie2);
                series.add(serie3);
                series.add(serie4);
            }
            configuraRecyclerView(series);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void configuraRecyclerView(List<Serie> series) {
        adapter = new CatalagoAdapter(getContext(), series);
        adapter.setRecyclerViewOnClickListenerHack(this);
        _rvCatalago.setAdapter(adapter);
    }


    @Override
    public void onClickListener(View view, int position, Object item) {

    }
}
