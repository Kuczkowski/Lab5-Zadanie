package com.company;

public class Main {

    public static void main(String[] args) {
        Vehicle samochod = new Vehicle("Mazda", "Rx-7",
                new Color("Oliwkowy"),
                new Size("Samochód sportowy, mały"),
                new Engine("Silnik Wankla"));

        System.out.println(samochod);
		} }
