package lessons.lesson3.interfaces;

public class RockMusician implements Musician{
    private String name;

    @Override
    public void dance() {
        System.out.println("Dancing Rock");
    }

    @Override
    public void playMusic() {

    }

    @Override
    public void sing() {
        System.out.println("Singing Rock");
    }

    @Override
    public void greeting() {

    }

    @Override
    public String getName() {
        return name;
    }
}
