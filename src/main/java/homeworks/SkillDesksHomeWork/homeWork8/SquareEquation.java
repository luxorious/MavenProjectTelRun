package homeworks.SkillDesksHomeWork.homeWork8;

import static java.lang.Math.round;

public class SquareEquation {

    private int param1;
    private int param2;
    private int param3;

    public SquareEquation(int param1, int param2, int param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    Roots solution() {
        int d = (param2 * param2) - 4 * (param1 * param3);
        double x1 = (-param2 - Math.sqrt(d)) / (2 * param1);
        double x2 = (-param2 + Math.sqrt(d)) / (2 * param1);

        x1 = round(x1*100)/100.0;
        x2 = round(x2*100)/100.0;

        if (param1 == 0 || d < 0) {
            throw new ArithmeticException();
        } else if (d == 0) {
            return new Roots(x1);
        } else {
            return new Roots(x1, x2);
        }
    }
}
