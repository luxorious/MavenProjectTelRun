package lessons.lesson3.interfaces;

public class PopMusician implements Musician{
    private String name;

    @Override
    public void dance() {
        System.out.println("Dancing Pop");
    }

    @Override
    public void playMusic() {

    }

    @Override
    public void sing() {
        System.out.println("SInging Pop");
    }

    @Override
    public void greeting() {

    }

    @Override
    public String getName() {
        return name;
    }
}
