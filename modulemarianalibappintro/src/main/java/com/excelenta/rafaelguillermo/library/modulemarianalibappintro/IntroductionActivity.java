package com.excelenta.rafaelguillermo.library.modulemarianalibappintro;

import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro2;

/**
 * @Autor Rafael Guillermo Blanco Banquez
 * mail <rafaelg.blancob@gmail.com>
 * on 24.05.2020
 */
public abstract class IntroductionActivity extends AppIntro2 {

    public static final String TAG = "MarianaLibApp";

    public abstract int[] getIntLayouResourceId();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        int[] layoutResourceIds = getIntLayouResourceId();

        if (layoutResourceIds.length == 0) {
            throw new RuntimeException(TAG + "=>Error.. se debe sobreeescribir el método getIntLayouResourceId() y retornar un arreglo con los ID Layouts a mostrar en la Introducción");
        }
        for (int res : layoutResourceIds) {
            try {
                getApplicationContext().getResources().getLayout(res);
            } catch (Resources.NotFoundException e) {
                Log.e(TAG, TAG + "=>Error, No se encontró el recurso layout con ID=" + res);
                Log.e(TAG, e.getMessage(), e);
                throw e;
            }
            addSlide(SlideManager.newInstance(res));
        }
    }

    /**
     * Intensidad de la vibración
     * @param intensity
     */
    @Override
    public void setVibrateIntensity(int intensity) {
        super.setVibrateIntensity(intensity);
    }

    /**
     * <p>Se habilita la opcion de vibrar al pasar a la siguiente pagina o layout</p>
     * <br /><h3>Nota importante</h3>
     * <p>Recuerde adicionar la propiedad uses-permission android:name="android.permission.VIBRATE" en el
     * AndroidManifiest dentro de la etiqueta </p>
     * @param vibrationEnabled
     */
    @Override
    public void setVibrate(boolean vibrationEnabled) {
        super.setVibrate(vibrationEnabled);
    }

    /**
     * <p>Evento que se llama cuando el usuario hace click en la última pagina o slide, uselo para ejecurtar las acciones que requiera</p>
     * <br /><h3>Acciones que puede ejecutar</h3>
     * <p>Guardar que el usuario a ejecutado o visto la presentación o introducción para que esto no sea ejecutada nuevamente</p>
     * @param currentFragment
     */
    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
    }
}
