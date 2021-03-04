package com.company;

public class Vehicle  {
    protected String marka,model;
    Color kolor;
    Size rozmiar;
    Engine silnik;
    public Vehicle(String Marka, String model, Color kolor, Size size, Engine silnik) {
        this.marka = Marka;
        this.model = model;
        this.kolor =kolor ;
        this.rozmiar = size;
        this.silnik = silnik;
    }

    @Override
    public String toString(){
return "Samochód marki: " +marka+"\nModel: " +model+ "\nFarba: "+ kolor.Color+ "\nRodzaj i rozmiar: "
        + rozmiar.Size+ "\nSilnik: " +silnik.Engine;
    } }