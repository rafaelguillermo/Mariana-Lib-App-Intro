package com.excelenta.rafaelguillermo.library.marianalibappintro;

import android.os.Bundle;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.excelenta.rafaelguillermo.library.modulemarianalibappintro.IntroductionActivity;

public class TestIntroductionActivity extends IntroductionActivity {

    @Override
    public int[] getIntLayouResourceId() {
        return new int[]{
                R.layout.fragment_intro_slide_1,
                R.layout.fragment_intro_slide_2,
                R.layout.fragment_intro_slide_3,
                R.layout.fragment_intro_slide_4,
                R.layout.fragment_intro_slide_5,
                R.layout.fragment_intro_slide_6
        };
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setVibrate(true);
        setVibrateIntensity(30);

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        Toast.makeText(getApplicationContext(), "Mensaje", Toast.LENGTH_LONG).show();
    }

}
