package com.example.mvp;

public class AlCuadradoPresenter implements AlCuadrado.Presenter{
    private AlCuadrado.View view;
    private AlCuadrado.Model model;

    public AlCuadradoPresenter(AlCuadrado.View view) {//no esta en la interfaz
        this.view = view;
        model = new AlcuadradoModel(this) ;
    }
    @Override
    public void showResult(String result) {
        if (view!=null){
            view.showResult(result);
        }
    }

    @Override
    public void alcuadrado(String data) {
        if (view!=null){
            model.alcuadrado(data);
        }
    }

    @Override
    public void showError(String error) {
        if (view!=null){
            view.showError(error);
        }
    }
}
