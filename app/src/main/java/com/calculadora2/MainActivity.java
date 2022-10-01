package com.calculadora2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView Resultados;
    float NumeroA = 0.0f;
    float NumeroB = 0.0f;
    String Operacion="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resultados = findViewById(R.id.Resultados);
    }

    public void uno(View view) {
        float valor  = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("1");
        }else{
            Resultados.setText(Resultados.getText() + "1");
        }
    }

    public void dos(View view) {
        float valor  = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("2");
        }else{
            Resultados.setText(Resultados.getText() + "2");
        }
    }
    public void tres(View view) {
        float valor = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("3");
        }else{
            Resultados.setText(Resultados.getText() + "3");
        }
    }
    public void cuatro(View view) {
        float valor = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("4");
        }else{
            Resultados.setText(Resultados.getText() + "4");
        }
    }
    public void cinco(View view) {
        float valor  = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("5");
        }else{
            Resultados.setText(Resultados.getText() + "5");
        }
    }
    public void seis(View view) {
        float valor = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("6");
        }else{
            Resultados.setText(Resultados.getText() + "6");
        }
    }
    public void siete(View view) {
        float valor = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("7");
        }else{
            Resultados.setText(Resultados.getText() + "7");
        }
    }
    public void ocho(View view) {
        float valor  = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("8");
        }else{
            Resultados.setText(Resultados.getText() + "8");
        }
    }
    public void nueve(View view) {
        float valor  = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("9");
        }else{
            Resultados.setText(Resultados.getText() + "9");
        }
    }
    public void cero(View view) {
        float valor  = Float.parseFloat(Resultados.getText().toString());
        if (valor == 0.0f){
            Resultados.setText("0");
        }else{
            Resultados.setText(Resultados.getText() + "0");
        }
    }
    public void borrar(View view) {
        Resultados.setText("0");
        NumeroA = 0.0f;
        NumeroB = 0.0f;
        Operacion = "";
    }

    public void dividir(View view) {
        NumeroA = Float.parseFloat(Resultados.getText().toString());
        Operacion = "/";
        Resultados.setText("0");
    }

    public void sumar(View view){
        NumeroA = Float.parseFloat(Resultados.getText().toString());
        Operacion = "+";
        Resultados.setText("0");
    }
    public void multiplicar(View view){
        NumeroA = Float.parseFloat(Resultados.getText().toString());
        Operacion = "*";
        Resultados.setText("0");
    }
    public void restar(View view){
        NumeroA = Float.parseFloat(Resultados.getText().toString());
        Operacion = "-";
        Resultados.setText("0");
    }
    public void porcentaje(View view){
        NumeroA = Float.parseFloat(Resultados.getText().toString());
        Operacion = "%";
        Resultados.setText("0");
    }



    public void igual(View view) {
        NumeroB = Float.parseFloat(Resultados.getText().toString());
        if(Operacion.equals("/")){
            if(NumeroB == 0.0f){
                Resultados.setText("0");
                Toast.makeText(this,"Operacion no valida",Toast.LENGTH_LONG).show();

            }else{
                float result = NumeroA / NumeroB;
                int result_A = Math.round(result);
                Resultados.setText(result_A + "");
            }
        }else if (Operacion.equals("*")){
            float result = NumeroA * NumeroB;
            int result_A = Math.round(result);
            Resultados.setText(result_A + "");

        }else if (Operacion.equals("+")){
            float result = NumeroA + NumeroB;
            int result_A = Math.round(result);
            Resultados.setText(result_A + "");
        }else if (Operacion.equals("-")){
            float result = NumeroA - NumeroB;
            int result_A = Math.round(result);
            Resultados.setText(result_A + "");
        }else if (Operacion.equals("%")) {
            float result = NumeroA * NumeroB / 100;
            int result_A = Math.round(result);
            Resultados.setText(result + "");
        }



        NumeroA = 0.0f;
        NumeroB = 0.0f;
        Operacion = "";
    }



}