package com.excelenta.rafaelguillermo.library.modulemarianalibappintro;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * @Autor Rafael Guillermo Blanco Banquez
 * mail <rafaelg.blancob@gmail.com>
 * on 24.05.2020
 */
public class FragmentIntroSlide extends Fragment {

    public static final String ARG_LAYOUT_RES_ID = "layoutResId";

    private int layoutResId;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null && getArguments().containsKey(ARG_LAYOUT_RES_ID)) {
            layoutResId = getArguments().getInt(ARG_LAYOUT_RES_ID);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(layoutResId, container, false);

        return v;
    }
}
