package com.sda.statickeyword;
public class Car {
    //proprietati
    String carName;
    int carId;

    // parametrii: String name, int id
    // parametrii ne ajuta sa transmitem date dintr-o parte in alta a codului
    Car(String name, int id) {
        System.out.println("constructor clasa Car");
        System.out.println(name);
        System.out.println(id);

        carName = name; // salvam valoarea variabilei name in proprietatea carName
        carId = id; // salvam valoarea variabilei id in proprietatea carId
    }

    void printCarName(String parametruCarName) {
        System.out.println("Afisare parametru: " + parametruCarName);
    }
}