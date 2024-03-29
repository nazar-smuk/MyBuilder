package com.company;

public class Main {

    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and
        //without any inconsistent state or arguments management issues
        //commit 1
        //commit 2
        //commit 3
        Computer comp = new Computer.ComputerBuilder(
            "500 GB", "2 GB").setBluetoothEnabled(true)
            .setGraphicsCardEnabled(true).build();

        System.out.println(comp.getHDD());
        System.out.println(comp.getRAM());
    }
}
