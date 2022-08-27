package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    public void parseSideSize_shouldThrowIllegalArgumentException_whenScannerIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.parseSideLength(null, "name"));
    }

    @Test
    public void parseSideSize_shouldThrowIllegalArgumentException_whenNameIsNull() {
        Scanner scanner = new Scanner(System.in);

        assertThrows(IllegalArgumentException.class,
                () -> Task9.parseSideLength(scanner, null));
    }

    @Test
    public void computeQuadrilateralArea_shouldReturn12_whenX3Y4Z3T4() {
        assertEquals(12.0, Task9.computeQuadrilateralArea(3, 4, 3, 4));
    }

    @Test
    public void computeRightTriangleArea_shouldThrowIllegalArgumentException_whenAIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.computeRightTriangleArea(-1, 3));
    }

    @Test
    public void computeRightTriangleArea_shouldThrowIllegalArgumentException_whenBIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.computeRightTriangleArea(3, -1));
    }

    @Test
    public void computeRightTriangleArea_shouldReturn8_whenA8B8() {
        assertEquals(32, Task9.computeRightTriangleArea(8, 8));
    }

    @Test
    public void computeTriangleArea_shouldThrowIllegalArgumentExceptionWhenAIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.computeTriangleArea(-1, 1, 1));
    }

    @Test
    public void computeTriangleArea_shouldThrowIllegalArgumentExceptionWhenBIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.computeTriangleArea(1, -1, 1));
    }

    @Test
    public void computeTriangleArea_shouldThrowIllegalArgumentExceptionWhenCIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.computeTriangleArea(1, 1, -1));
    }

    @Test
    public void computeTriangleArea_shouldReturn6_whenA3B4C5() {
        assertEquals(6.0, Task9.computeTriangleArea(3.0, 4.0, 5.0));
    }
}