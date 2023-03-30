package homeworks.SkillDesksHomeWork.homeWork8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class SquareEquationTest {

    @Test
    public void ifParamFirstEquals0() {
        SquareEquation sq = new SquareEquation(0, 1, 2);
        Assertions.assertThrows(ArithmeticException.class, sq::solution);
    }

    @Test
    public void ifParamDEqualsDNegative() {
        SquareEquation sq2 = new SquareEquation(4, -3, 1);
        Assertions.assertThrows(ArithmeticException.class, sq2::solution);
    }

    @Test
    public void ifEquationHasOneRoot() {
        SquareEquation sq = new SquareEquation(1, 2, 1);
        Roots expected = new Roots(-1.0);
        Roots actual = sq.solution();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifEquationHas2Roots() {
        SquareEquation sq = new SquareEquation(1, 3, 1);
        Roots expected = new Roots(-2.62, -0.38);
        Roots actual = sq.solution();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifEquationHas2RootsMock() {
        SquareEquation sq = mock(SquareEquation.class);
        when(sq.solution()).thenReturn(new Roots(1.0, 2.0));
        Roots expected = new Roots(1.0, 2.0);
        Roots actual = sq.solution();

        Assertions.assertEquals(expected, actual);
    }
}