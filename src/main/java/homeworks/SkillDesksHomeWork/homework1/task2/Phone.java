package homeworks.SkillDesksHomeWork.homework1.task2;

public class Phone {
//    2.Класс Phone.
//    Создайте класс Phone, который содержит переменные number, model и weight.
//    Создайте три экземпляра этого класса.
//    Выведите на консоль значения их переменных.

    private long number;
    private String model;
    private float weight;

    public Phone(long number, String model, float weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void receiveCall(String name){
        System.out.printf("call {%s}\n", name);
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
