package lessons.lesson16.lambda;

public class AppDemo {
    public static void main(String[] args) {
        Switch sw = new Switch();
        Lamp lamp = new Lamp();
        Computer pc = new Computer();
        lamp.model = "Philips";
        TvSet tv = new TvSet();

        tv.model = "Sony";

        sw.addElectricityListener(lamp);
        sw.addElectricityListener(pc);
        sw.addElectricityListener(tv);


        class FireDetector implements ElectricityConsumer{

            @Override
            public void electricityOn() {
                System.out.println("Fire Detection!!!");
            }
        }

        sw.addElectricityListener(new FireDetector());

        //створення анонімного класу
        sw.addElectricityListener(new ElectricityConsumer() {
            public void electricityOn() {
                System.out.println("Fire detection on!!!");
            }
        });

        sw.addElectricityListener(() -> System.out.println("Fire detection on!!!"));

        sw.switchOn();

    }

}
