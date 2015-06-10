package com.company;

/**
 * Created by Yolland on 6/10/2015.
 */
public class Pencipta {
    public String NamaPencipta;
    public String AsalPencipta;

    public Pencipta(String namaPencipta, String asalPencipta) {
        NamaPencipta = namaPencipta;
        AsalPencipta = asalPencipta;
    }

    public String getNamaPencipta() {
        return NamaPencipta;
    }

    public void setNamaPencipta(String namaPencipta) {
        NamaPencipta = namaPencipta;
    }

    public String getAsalPencipta() {
        return AsalPencipta;
    }

    public void setAsalPencipta(String asalPencipta) {
        AsalPencipta = asalPencipta;
    }


    @Override
    public String toString() {
        return "Pencipta{" +
                "NamaPencipta='" + NamaPencipta + '\'' +
                ", AsalPencipta='" + AsalPencipta + '\'' +
                '}';
    }
}
