package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {

        //the basic structure
        CarBasics car = new CarBasics();
        car.color = "green";
        car.number = "88877373";
        car.engine = "544444443456c";
        car.door = "4";
        System.out.println(car.color);
    }

    CarBasics car = new CarBasics();
    
}

