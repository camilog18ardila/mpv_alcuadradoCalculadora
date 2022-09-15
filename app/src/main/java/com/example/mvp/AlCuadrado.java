package com.example.mvp;

public interface AlCuadrado {

    interface View{
        void showResult(String result);
        void showError(String error);
    }
    interface Presenter{
        void showResult(String result);
        void alcuadrado(String data);
        void showError(String error);
    }
    interface Model{
        void alcuadrado(String data);
    }
}
