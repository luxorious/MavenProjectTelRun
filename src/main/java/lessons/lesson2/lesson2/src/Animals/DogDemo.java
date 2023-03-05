package lessons.lesson2.lesson2.src.Animals;

public class DogDemo {
    public static void main(String[] args) {
        Dog tuzik = new Dog();

        tuzik.setBreed("taksa");
        Animal newDog = tuzik.createAnimal("black", "tuzik");
        tuzik.setType(newDog);

    }
}
