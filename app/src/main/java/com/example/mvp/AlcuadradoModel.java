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
            presenter.showError("Error: Campo Vacio");
        }else {
            resultado = Double.valueOf(data)*Double.valueOf(data);
            presenter.showResult(String.valueOf(resultado));
        }
    }
}
