package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView resultado;
    private double num1, num2;
    private int operacion;//Suma = 1, Resta = 2, Multiplicacion = 3, Division = 4, Raiz = 5, Potencia = 6
    private boolean esResultado = false;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0,
                btnSuma, btnResta, btnMultiplicacion, btnDivision, btnPotencia, btnRaiz,
                btnBorrar, btnIgual;

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);
        btnSuma = findViewById(R.id.btnSuma);
        btnResta = findViewById(R.id.btnResta);
        btnMultiplicacion = findViewById(R.id.btnMultiplicacion);
        btnDivision = findViewById(R.id.btnDivision);
        btnPotencia = findViewById(R.id.btnPotencia);
        btnRaiz = findViewById(R.id.btnRaiz);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnIgual = findViewById(R.id.btnIgual);

        resultado = findViewById(R.id.resultado);

        btn1.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "1");
        });
        btn2.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "2");
        });
        btn3.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "3");
        });
        btn4.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "4");
        });
        btn5.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "5");
        });
        btn6.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "6");
        });
        btn7.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "7");
        });
        btn8.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "8");
        });
        btn9.setOnClickListener(view -> {
            if(esResultado){
                resultado.setText("");
                esResultado = false;
            }
            resultado.setText(resultado.getText().toString()+ "9");
        });
        btn0.setOnClickListener(view -> {
            if(!resultado.getText().toString().isEmpty()){
                if(esResultado){
                    resultado.setText("");
                    esResultado = false;
                }
                resultado.setText(resultado.getText().toString()+ "0");
            }
        });

        btnSuma.setOnClickListener(view -> {
            if(!resultado.getText().toString().isEmpty()){
                num1 = Double.parseDouble(resultado.getText().toString());
                operacion = 1;
                resultado.setText("");
            }
        });

        btnResta.setOnClickListener(view -> {
            if(!resultado.getText().toString().isEmpty()){
                num1 = Double.parseDouble(resultado.getText().toString());
                operacion = 2;
                resultado.setText("");
            }
        });

        btnMultiplicacion.setOnClickListener(view -> {
            if(!resultado.getText().toString().isEmpty()){
                num1 = Double.parseDouble(resultado.getText().toString());
                operacion = 3;
                resultado.setText("");
            }
        });

        btnDivision.setOnClickListener(view -> {
            if(!resultado.getText().toString().isEmpty()){
                num1 = Double.parseDouble(resultado.getText().toString());
                operacion = 4;
                resultado.setText("");
            }
        });

        btnRaiz.setOnClickListener(view -> {
            if(!resultado.getText().toString().isEmpty()){
                num1 = Double.parseDouble(resultado.getText().toString());
                operacion = 5;
                resultado.setText("");
                btnIgual.performClick();
            }
        });

        btnPotencia.setOnClickListener(view -> {
            if(!resultado.getText().toString().isEmpty()){
                num1 = Double.parseDouble(resultado.getText().toString());
                operacion = 6;
                resultado.setText("");
            }
        });

        btnBorrar.setOnClickListener(view -> resultado.setText(""));

        btnIgual.setOnClickListener(view -> {
            if(operacion != 5){
                num2 = Double.parseDouble(resultado.getText().toString());
            }
            double total;
            esResultado = true;
            switch (operacion){
                case 1: //Suma
                    total = num1 + num2;
                    resultado.setText(""+total);
                    break;
                case 2: //Resta
                    total = num1 - num2;
                    resultado.setText(""+total);
                    break;
                case 3: //Multiplicacion
                    total = num1 * num2;
                    resultado.setText(""+total);
                    break;
                case 4: //Division
                    total = num1 / num2;
                    resultado.setText(""+total);
                    break;
                case 5: //Raiz
                    total = Math.sqrt(num1);
                    resultado.setText(""+total);
                    break;
                case 6: //Potencia
                    total = Math.pow(num1, num2);
                    resultado.setText(""+total);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + operacion);
            }
        });
    }
}