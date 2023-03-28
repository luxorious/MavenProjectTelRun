package homeworks.SkillDesksHomeWork.homeWork8;

public class SquareDemo {

    public static void main(String[] args) {
        SquareEquation sq = new SquareEquation(1, 3, 1);
        SquareEquation sq1 = new SquareEquation(1, 2, 1);
        SquareEquation sq2 = new SquareEquation(4, -3, 1);
        SquareEquation sq3 = new SquareEquation(0, -3, 1);


        System.out.println(sq.solution());
        System.out.println(sq1.solution());
        System.out.println(sq2.solution());// d = 0 - call ArithmeticException
        System.out.println(sq3.solution());// param1 = 0 - call ArithmeticException
    }
}
