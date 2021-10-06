package com.example.hola_mundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtHola;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHola=findViewById(R.id.txtView);
        txtHola.setText("Hola a todos");
        //una nueva ramificación o branch
    }
}