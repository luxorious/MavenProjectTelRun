package lessons.lesson26.lessoncode.generic2;

public class AccountGeneric<T extends Number> {

    private int id;
    private T sum;

    @Override
    public String toString() {
        return "AccountGeneric{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public T getSum() {
        return sum;
    }

    public void setSum(T sum) {
        this.sum = sum;
    }

    public AccountGeneric(int id, T sum) {
        this.id = id;
        this.sum = sum;
    }
}
