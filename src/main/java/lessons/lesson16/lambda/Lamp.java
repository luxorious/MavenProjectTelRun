package lessons.lesson16.lambda;

public class Lamp implements ElectricityConsumer{
    String model;

    void lampOn(){
        System.out.println("Lamp " + model + " lighting");
    }

    @Override
    public void electricityOn() {
        lampOn();
    }
}
