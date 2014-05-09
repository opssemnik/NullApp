package com.nullsoft.app;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BackgroundFragment extends Fragment {
    public static Fragment onEventoRecebido(Context contexto,int idDaTab){
        return new BackgroundFragment();
    }
    @Override
    public void onCreate(Bundle _appAntigo){
        super.onCreate(_appAntigo);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        if(rootView != null){
            TextView texto = (TextView)rootView.findViewById(R.id.section_label);
            texto.setText("Bry e gay\nBr Hu3 2.0");
            texto.setTextColor(Color.WHITE);
        }
        return rootView;
    }
    @Override
    public void onAttach(Activity activity) {

        }
        }
