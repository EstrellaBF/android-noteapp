package com.example.pollo.test;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // definiendo vista y poniéndole nombre
        View rootView;
        // Llenándola, y se pasa 3 parámetros; el fragmento, el viewgroup y el atach null si no se usará
        rootView = inflater.inflate(R.layout.fragment_layout,container, false);
        return rootView;
    }
}
