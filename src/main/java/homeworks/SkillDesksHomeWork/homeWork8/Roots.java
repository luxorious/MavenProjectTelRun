package homeworks.SkillDesksHomeWork.homeWork8;

public class Roots {
    double x1;
    double x2 = Double.MIN_VALUE;

    public Roots(double x1, double x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    public Roots(double x1) {
        this.x1 = x1;
    }

    @Override
    public String toString() {
        return "x1 = " + x1 + (x2 != Double.MIN_VALUE ? "\nx2 = " + x2 : "");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Roots roots)) return false;

        if (Double.compare(roots.x1, x1) != 0) return false;
        return Double.compare(roots.x2, x2) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(x1);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(x2);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
