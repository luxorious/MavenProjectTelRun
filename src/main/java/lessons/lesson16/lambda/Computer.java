package lessons.lesson16.lambda;

public class Computer implements ElectricityConsumer{
    void computerOn(){
        System.out.println("Computer is working");
    }

    @Override
    public void electricityOn() {
        computerOn();
    }
}
