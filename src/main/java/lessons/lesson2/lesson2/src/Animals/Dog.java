package lessons.lesson2.lesson2.src.Animals;

public class Dog {
    private String breed;
    private Animal type;

    public void voice (String text){
        System.out.println(text);
    }

    public Animal createAnimal(String color, String name){
        return new Animal(color, name);
    }

//    or
//    public Animal createAnimal(String color, String name){
//        Animal newAnimal = new Animal(color, name)
//        return newAnimal;
//    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Animal getType() {
        return type;
    }

    public void setType(Animal type) {
        this.type = type;
    }
}
