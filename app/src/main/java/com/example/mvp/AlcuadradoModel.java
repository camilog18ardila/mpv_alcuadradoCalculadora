package com.example.mvp;

public class AlcuadradoModel implements AlCuadrado.Model{
    private AlCuadrado.Presenter presenter;
    private double resultado;

    public AlcuadradoModel(AlCuadrado.Presenter presenter){
        this.presenter=presenter;
    }

    @Override
    public void alcuadrado(String data) {
        if (data.equals("")){
            presenter.showError("Error: El campo no puede estar vacio");
        }else {
            resultado = Double.valueOf(data)*Double.valueOf(data);
            presenter.showResult(String.valueOf(resultado));
        }
    }
}
