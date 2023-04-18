package lessons.lesson31.object;

public class Crossbow {

    private int arrows = 10;

    synchronized void fire() {
        for (int i = arrows; i >= 0; i--) {
            if (i != 0) {
                System.out.println("The arrow " + (arrows - i + 1) + " right on the target");
            } else {
                System.out.println("The arrows are over");
                arrows = 0;
                System.out.println("count arrows " + arrows);
                try{
                    wait();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Carry a new quiver with arrows");
            }
        }
    }

    synchronized public void reload(){
        System.out.println("new arrows on the way");
        arrows = 10;
        System.out.println("count arrows " + arrows);
        notify();
    }
}

