package lessons.lesson2.lesson2.src.tasks;

public class AnimalDemo {

    public static void main(String[] args) {
        Fish firstAnimal = new Fish();
        Dog secondAnimal = new Dog();
        Warm thirdAnimal = new Warm();

        firstAnimal.breath();
        secondAnimal.breath();
        thirdAnimal.breath();

        System.out.println();

        Animal[] animals = {firstAnimal,secondAnimal,thirdAnimal};

        for (int i = 0; i < animals.length; i++) {
            Animal currentAnimal = animals[i];
            currentAnimal.breath();

//            або
//            animals[i].breath();
        }
    }
}
