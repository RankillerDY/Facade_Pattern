package org.example.Fades;

import org.example.Subsystems.Chair;
import org.example.Subsystems.Table;
import org.example.Subsystems.Television;

public class FurnitureFacade {
    private static FurnitureFacade instance;
    private Chair chair;
    private Table table;
    private Television television;

    public FurnitureFacade() {
        chair = new Chair();
        television = new Television();
        table = new Table();
    }

    public static FurnitureFacade getInstance() {
        if(instance == null) {
            return new FurnitureFacade();
        }
        return instance;
    }

    public void makeChairTelevision() {
        chair.make();
        television.make();
    }

    public void makeChairTable() {
        table.make();
        chair.make();
    }
}
