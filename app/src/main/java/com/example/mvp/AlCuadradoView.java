package com.example.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoView extends AppCompatActivity implements AlCuadrado.View{
    TextView tvalcuadrado;
    EditText edalcuandrado;
    AlCuadrado.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edalcuandrado=(EditText) findViewById(R.id.etalcuadrado);
        tvalcuadrado=(TextView) findViewById(R.id.tvresultado);
        presenter= new AlCuadradoPresenter(this);

    }
    public void calcular(View view){
        presenter.alcuadrado(edalcuandrado.getText().toString());
    }

    @Override
    public void showResult(String result) {
        tvalcuadrado.setText(result);
    }

    @Override
    public void showError(String error) {
        tvalcuadrado.setText(error);
    }
}