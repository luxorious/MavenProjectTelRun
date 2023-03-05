package lessons.lesson12.lesson12Practice;

public class ArrayRepository implements StringRepository{

    private String[] dataBase = new String[0];

    @Override
    public void save(String text) {
        //...
        dataBase[0] = text;
    }
}
