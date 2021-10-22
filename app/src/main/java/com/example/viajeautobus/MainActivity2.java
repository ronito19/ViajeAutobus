package com.example.viajeautobus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {


    private int num_pasajeros = 0;
    private double precio_billete = 0.0;
    private double ingresos = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // recupero los datos que me han enviado
        Intent intent = getIntent();
        if(intent != null)
        {
            num_pasajeros = intent.getIntExtra(MainActivity.EXTRA_NUM_PASAJEROS,0);
            precio_billete = intent.getDoubleExtra(MainActivity.EXTRA_PRECIO_BILLETE,0);
            ingresos = intent.getDoubleExtra(MainActivity.EXTRA_INGRESOS,0);

            Toast.makeText(this, " numero de pasajeros -> " + String.valueOf(num_pasajeros), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, " precio del billete -> " + String.valueOf(precio_billete), Toast.LENGTH_SHORT).show();
            Toast.makeText(this, " ingresos -> " + String.valueOf(ingresos), Toast.LENGTH_SHORT).show();
        }

    }
}