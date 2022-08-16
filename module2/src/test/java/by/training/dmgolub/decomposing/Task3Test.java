package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @Test
    public void calculateTriangle_shouldThrowIllegalArgumentException_whenSideIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task3.calculateRegularTriangleArea(-1));
    }

    @Test
    public void calculateTriangleArea_shouldReturn0_whenSideLengthIs0() {
        assertEquals(0, Task3.calculateRegularTriangleArea(0));
    }

    @Test
    public void calculateTriangleArea_shouldCalculateArea_whenSideLengthIsPositive() {
        double expected = Math.sqrt(3);

        assertEquals(expected, Task3.calculateRegularTriangleArea(2));
    }

    @Test
    public void calculateHexagonArea_shouldThrowIllegalArgumentException_whenSideIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task3.calculateRegularHexagonArea(-1));
    }

    @Test
    public void calculateHexagonArea_shouldReturn0_whenSideLengthIs0() {
        assertEquals(0, Task3.calculateRegularHexagonArea(0));
    }

    @Test
    public void calculateHexagonArea_shouldCalculateArea_whenSideLengthIsPositive() {
        double expected = 6 * Math.sqrt(3);

        assertEquals(expected, Task3.calculateRegularHexagonArea(2));
    }
}