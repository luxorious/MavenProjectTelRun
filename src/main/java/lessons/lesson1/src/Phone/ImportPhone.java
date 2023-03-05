package lessons.lesson1.src.Phone;

public class ImportPhone {
    private String manufactor;

    private Phone phone;

    public ImportPhone(String manufactor, Phone phone) {
        this.manufactor = manufactor;
        this.phone = phone;
    }

    public String getManufactor() {
        return manufactor;
    }

    public void setManufactor(String manufactor) {
        this.manufactor = manufactor;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ImportPhone{" +
                "manufactor='" + manufactor + '\'' +
                ", phone=" + phone +
                '}';
    }
}
