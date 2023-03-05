package lessons.lesson2.lesson2.src.tasks;

public class Fish extends Animal{

    private boolean eatable;

    public boolean isEatable() {
        return eatable;
    }

    public void setEatable(boolean eatable) {
        this.eatable = eatable;
    }

    @Override
    void breath() {
        System.out.println("Gills");
    }

}
