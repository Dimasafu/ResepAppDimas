package com.example.user.resepappdimas;

/**
 * Created by User on 12-Oct-17.
 */

public class ResepModel {
    private String namaMasakan;
    private int gambarMasakan;

    public ResepModel() {
    }

    public ResepModel(String namaMasakan, int gambarMasakan) {
        this.namaMasakan = namaMasakan;

        this.gambarMasakan = gambarMasakan;
    }

    public String getNamaMasakan() {
        return namaMasakan;
    }

    public void setNamaMasakan(String namaMasakan) {
        this.namaMasakan = namaMasakan;
    }


    public int getGambarMasakan() {
        return gambarMasakan;
    }

    public void setGambarMasakan(int gambarMasakan) {
        this.gambarMasakan = gambarMasakan;
    }
}
