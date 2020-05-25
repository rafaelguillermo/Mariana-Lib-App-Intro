package com.excelenta.rafaelguillermo.library.modulemarianalibappintro;

import android.os.Bundle;

/**
 * @Autor Rafael Guillermo Blanco Banquez
 * mail <rafaelg.blancob@gmail.com>
 * on 24.05.2020
 */
public class SlideManager extends FragmentIntroSlide {

    /**
     * @param layoutResId
     * @return
     */
    public static SlideManager newInstance(int layoutResId) {

        SlideManager slideManager = new SlideManager();

        Bundle args = new Bundle();
        args.putInt(ARG_LAYOUT_RES_ID, layoutResId);
        slideManager.setArguments(args);

        return slideManager;
    }
}
