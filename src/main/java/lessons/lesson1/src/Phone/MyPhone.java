package lessons.lesson1.src.Phone;

public class MyPhone {
    private int number;

    private Phone phone;

    public MyPhone(int number, Phone phone) {
        this.number = number;
        this.phone = phone;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void ring(int callNumber){
        System.out.println("For number " + this.number + " is calling " + callNumber);
    }

    @Override
    public String toString() {
        return "MyPhone{" +
                "number=" + number +
                ", phone=" + phone +
                '}';
    }
}
