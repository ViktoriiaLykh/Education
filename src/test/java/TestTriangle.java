import org.example.TriangleCalculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;


public class TestTriangle {

    private static TriangleCalculator triangleCalculator;

    @BeforeAll
    public static void setup() {
        triangleCalculator = new TriangleCalculator();
    }

    @Test
    public void testCalculation() {
        Double triangle = triangleCalculator.calculateSquare(10, 5, 8);
        assertTrue(triangle > 0);
        //данный метод проверяет что результат полученный при вычислении больше 0
    }

    @Test
    public void testInvalidInput() {
        assertThrows(InputMismatchException.class, () -> {
            triangleCalculator.calculateSquare(25, 3, 1);
        });
        //данный метод проверяет теорию, что код написан неверно и имеет ошибки. условие :
        // (a + b <= c || a + c <= b || a + c <= b)
        // имеет 2 проверки на то что a + c <= b, но не имеет проверки на то что c + b <= a
    }

    @Test
    public void testInvalidInputZero() {
        assertThrows(InputMismatchException.class, () -> {
            triangleCalculator.calculateSquare(5, 55, 0);
        });
    }

    @Test
    public void testNegativeInputValueA() {
        assertThrows(InputMismatchException.class, () -> {
            triangleCalculator.calculateSquare(-3, 5, 6);
        });
    } //данный тест проверяет возникновение ошибки при введении a < 0;

    @Test
    public void testNegativeInputValueB() {
        assertThrows(InputMismatchException.class, () -> {
            triangleCalculator.calculateSquare(5, -5, 6);
        });
    } //данный тест проверяет возникновение ошибки при введении b < 0;

    @Test
    public void testNegativeInputValueC() {
        assertThrows(InputMismatchException.class, () -> {
            triangleCalculator.calculateSquare(2, 5, -6);
        });
    } //данный тест проверяет возникновение ошибки при введении c < 0;

    @Test
    public void testStringInput() {
        Double triangle = triangleCalculator.calculateSquare("5", "10", "8");
        assertNotNull(triangle);
    } //тест проверяет возможность считывания чисел для формулы при введении строкового значения


}

