package com.example.quadradocubo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Forma 2
        // lógica para atender o click no botão Cubo:
        Button btnCubo = findViewById(R.id.idBtnCubo);
        btnCubo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //pegar o valor digitado pelo usuário:
                EditText txtvalor = findViewById(R.id.idValor);
                float valor = Float.parseFloat(txtvalor.getText().toString());
                TextView txtresultado = findViewById(R.id.idResultado);
                txtresultado.setText("O cubo vale " + (valor*valor*valor));
            }
        });

        //para atender o click no botão Raiz (pela Forma 3):
        Button btnRaiz = findViewById(R.id.idBtnRaiz);
        btnRaiz.setOnClickListener(this);
    }

    //Forma 1
    //evento de click, cabeçalho obrigatório, nome qualquer que coincida no XML
    public void calculaQuadrado(View v) {
        EditText txtvalor = findViewById(R.id.idValor);
        float valor = Float.parseFloat(txtvalor.getText().toString());
        TextView txtresultado = findViewById(R.id.idResultado);
        txtresultado.setText("O quadrado vale " + (valor*valor));
    }

    //Forma 3
    //para atender o click no botão Raiz:
    public void onClick(View v) {
        if(v.getId() == R.id.idBtnRaiz) { //clicou no botão Raiz
            EditText txtvalor = findViewById(R.id.idValor);
            float valor = Float.parseFloat(txtvalor.getText().toString());
            TextView txtresultado = findViewById(R.id.idResultado);
            txtresultado.setText("A raiz vale " + Math.sqrt(valor));
        }
    }

}