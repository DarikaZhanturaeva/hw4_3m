package com.geeks.hw4_3m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geeks.hw4_3m.continent.ContinentFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContinentFragment continentFragment = new ContinentFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainer, continentFragment)
                .commit();
    }
}