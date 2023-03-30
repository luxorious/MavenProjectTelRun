package lessons.lesson22.lessoncode;

import java.util.Objects;

public class Car {
    String model;
    int id;



    public Car(String model) {
        this.model = model;
    }

    public Car(String model, int id) {
        this.model = model;
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;

        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + id;
        return result;
    }
}
