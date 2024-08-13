package org.example;

import org.example.Fades.FurnitureFacade;

public class Client {
    public static void main(String[] args) {
        FurnitureFacade facade = FurnitureFacade.getInstance();
        facade.makeChairTable();
        System.out.println("---------------------------");
        facade.makeChairTelevision();
    }
}