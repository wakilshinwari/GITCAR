package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {

        //the basic structure
        CarBasics car = new CarBasics();
        car.color = "green";
        car.number = "789";
        car.engine = "544444c";
        car.door = "3";
        System.out.println(car.color);
    }
}