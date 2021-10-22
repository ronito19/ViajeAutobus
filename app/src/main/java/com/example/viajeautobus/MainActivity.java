package com.example.viajeautobus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_NUM_PASAJEROS = "es.ronito.MainActivity.num_pasajeros";
    public static final String EXTRA_PRECIO_BILLETE = "es.ronito.MainActivity.precio_viaje";
    public static final String EXTRA_INGRESOS = "es.ronito.MainActivity.ingresos";

    private EditText edt_num_pasajeros = null;
    private EditText edt_precio_viaje = null;
    private TextView txt_mostrar_precio_viaje = null;
    //----------------------------------------------------------------------------------

    private int num_pasajeros = 0;
    private double precio_viaje = 0.0;
    private double ingresos = 0.0;

    //----------------------------------------------------------------------------------


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_num_pasajeros = (EditText) findViewById(R.id.edt_pasajeros);
        edt_precio_viaje = (EditText) findViewById(R.id.edt_precio);
        txt_mostrar_precio_viaje = (TextView) findViewById(R.id.tx_mostrar_ingresos);
    }

    public void mostrarIngresos(View view) {
        boolean errores = false;
        String texto_pasajeros = String.valueOf(edt_num_pasajeros.getText());
        if(!texto_pasajeros.isEmpty())
        {
            num_pasajeros = Integer.valueOf(texto_pasajeros);
        }
        else
        {
            edt_num_pasajeros.setError(" Debes introducir el numero de pasajeros ");
            errores = true;
        }

        //-------------------------------------------------------------------------------

        String texto_precio_billete = String.valueOf(edt_precio_viaje.getText());
        if(!texto_precio_billete.isEmpty())
        {
            precio_viaje = Double.valueOf(texto_precio_billete);
        }
        else
        {
            edt_precio_viaje.setError(" Debes introducir el precio del billete ");
            errores = true;
        }

        //-------------------------------------------------------------------------------

        // Voy a terminar si hubo errores anteriormente
        if(errores == true)
        {
            return; // termina si hubo errores
        }

        //--------------------------------------------------------------------------------

        ingresos = num_pasajeros * precio_viaje;
        txt_mostrar_precio_viaje.setText(String.valueOf(ingresos) + " € ");

    }



    public void siguiente(View view) {
        boolean errores = false;
        String texto_pasajeros = String.valueOf(edt_num_pasajeros.getText());
        if(!texto_pasajeros.isEmpty())
        {
            num_pasajeros = Integer.valueOf(texto_pasajeros);
        }
        else
        {
            edt_num_pasajeros.setError(" Debes introducir el numero de pasajeros ");
            errores = true;
        }

        //-------------------------------------------------------------------------------

        String texto_precio_billete = String.valueOf(edt_precio_viaje.getText());
        if(!texto_precio_billete.isEmpty())
        {
            precio_viaje = Double.valueOf(texto_precio_billete);
        }
        else
        {
            edt_precio_viaje.setError(" Debes introducir el precio del billete ");
            errores = true;
        }

        //-------------------------------------------------------------------------------

        // Voy a terminar si hubo errores anteriormente
        if(errores == true)
        {
            return; // termina si hubo errores
        }

        //--------------------------------------------------------------------------------

        ingresos = num_pasajeros * precio_viaje;
        txt_mostrar_precio_viaje.setText(String.valueOf(ingresos) + " € ");

        //--------------------------------------------------------------------------------

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra(EXTRA_NUM_PASAJEROS, num_pasajeros);
        intent.putExtra(EXTRA_PRECIO_BILLETE, precio_viaje);
        intent.putExtra(EXTRA_INGRESOS, ingresos);
        startActivity(intent);

    }
}