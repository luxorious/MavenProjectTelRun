package lessons.lesson16.lambda;

public class TvSet implements ElectricityConsumer{
    String model;

    void tvOn(){
        System.out.println("Tv " + model + " working");
    }

    @Override
    public void electricityOn() {
        tvOn();
    }
}
