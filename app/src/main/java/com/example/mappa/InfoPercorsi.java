package com.example.mappa;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InfoPercorsi extends AppCompatActivity {

    TextView markertxt;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_percorsi);
        markertxt = findViewById(R.id.marker);

        String titolo = getIntent().getStringExtra("titolo");
        markertxt.setText(titolo);

    }
}
