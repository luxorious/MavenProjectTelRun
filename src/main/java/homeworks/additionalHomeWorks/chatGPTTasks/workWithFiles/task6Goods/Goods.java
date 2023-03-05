package homeworks.additionalHomeWorks.chatGPTTasks.workWithFiles.task6Goods;

public class Goods {
//    Напишіть програму, яка зберігає у файлі список товарів, їх цін та кількість,
//    а потім дозволяє користувачу додавати нові товари та редагувати наявні.
    private String nameOfGoods;
    private int price;
    private int quantity;


    public Goods(String nameOfGoods, int price, int quantity) {
        this.nameOfGoods = nameOfGoods;
        this.price = price;
        this.quantity = quantity;
    }

    public String getNameOfGoods() {
        return nameOfGoods;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return nameOfGoods + " " + price + " " + quantity;
    }
}
