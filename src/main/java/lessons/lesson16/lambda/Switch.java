package lessons.lesson16.lambda;

import java.util.ArrayList;
import java.util.List;

public class Switch {
    private List<ElectricityConsumer> listeners = new ArrayList<>();

    public void addElectricityListener(ElectricityConsumer listener){
        listeners.add(listener);
    }

    public void removeElectricityListener(ElectricityConsumer listener){
        listeners.remove(listener);
    }

    void switchOn(){
        System.out.println("Switch ON!");

        for (ElectricityConsumer ec : listeners){
            ec.electricityOn();
        }
    }
}
