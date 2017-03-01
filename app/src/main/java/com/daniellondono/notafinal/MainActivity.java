/*
* Practica 1 apps moviles
* Nota Final
* Estudiante: Daniel Londoño Echeverri
* cc: 1036946657
* Universidad de Antioquia
* Medellín Colombia
* Febrero 2017
* */
package com.daniellondono.notafinal;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    EditText Practicas;
    EditText Av1;
    EditText Av2;
    EditText Av3;
    EditText Final;
    double NotaFinal;
    Button Calcular;
    TextView Nota;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Practicas = (EditText) findViewById(R.id.et_Practicas);
        Av1 = (EditText) findViewById(R.id.et_Av1);
        Av2 = (EditText) findViewById(R.id.et_Av2);
        Av3 = (EditText) findViewById(R.id.et_Av3);
        Final = (EditText) findViewById(R.id.et_Final);
        Calcular = (Button) findViewById(R.id.Calcular);
        Nota = (TextView) findViewById(R.id.Nota);

        Calcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.Calcular:
                NotaFinal= .6*Float.valueOf(Practicas.getText().toString())+.05*Float.valueOf(Av1.getText().toString())+.07*Float.valueOf(Av2.getText().toString())+.08*Float.valueOf(Av3.getText().toString())+.2*Float.valueOf(Final.getText().toString());
                Nota.setText("Nota Fina = "+NotaFinal);
                if((NotaFinal>=0)&&((NotaFinal<=1))){Toast.makeText(getApplicationContext(),"Estas en el lugar equivocado",Toast.LENGTH_SHORT).show();}
                else if ((NotaFinal>=1.1)&&((NotaFinal<=2))){Toast.makeText(getApplicationContext(),"Remal",Toast.LENGTH_SHORT).show();}
                else if ((NotaFinal>=2.1)&&((NotaFinal<=3))){Toast.makeText(getApplicationContext(),"Es posible recuperarse",Toast.LENGTH_SHORT).show();}
                else if ((NotaFinal>=3.1)&&((NotaFinal<=4))){Toast.makeText(getApplicationContext(),"Normalito",Toast.LENGTH_SHORT).show();}
                else if ((NotaFinal>=4.1)&&((NotaFinal<=4.5))){Toast.makeText(getApplicationContext(),"Muy Bien",Toast.LENGTH_SHORT).show();}
                else if ((NotaFinal>=4.6)&&((NotaFinal<=5))){Toast.makeText(getApplicationContext(),"Excelente estudiante",Toast.LENGTH_SHORT).show();}
                break;
        }
    }
}
