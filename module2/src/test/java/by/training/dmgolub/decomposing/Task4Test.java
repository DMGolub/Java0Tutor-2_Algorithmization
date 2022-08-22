package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    public void findMax_shouldThrowIllegalArgumentException_whenPointsIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task4.findMaxDistanceBetweenPoints(null));
    }

    @Test
    public void findMax_shouldReturn5_whenAX0Y0PointBX2Y0PointCXMinus2Y3PointDX2Y3() {
        Point[] points = {
                new Point(0, 0),
                new Point(2, 0),
                new Point(-2, 3),
                new Point(2, 3)
        };

        assertEquals(5.0, Task4.findMaxDistanceBetweenPoints(points));
    }

    @Test
    public void distance_shouldThrowIllegalArgumentException_whenPointAIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task4.distanceBetweenPoints(null, new Point(1.0, 2.0)));
    }

    @Test
    public void distance_shouldThrowIllegalArgumentException_whenPointBIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task4.distanceBetweenPoints(new Point(1.0, 2.0), null));
    }

    @Test
    public void distance_shouldReturn2_whenPointAX0Y0PointBX2Y0() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);

        assertEquals(2.0, Task4.distanceBetweenPoints(a, b));
    }

    @Test
    public void distance_shouldReturn4_whenPointAXMinus2Y3PointBX2Y3() {
        Point a = new Point(-2, 3);
        Point b = new Point(2, 3);

        assertEquals(4.0, Task4.distanceBetweenPoints(a, b));
    }

    @Test
    public void distance_shouldReturn5_whenPointAXMinus2Y3PointBX2Y0() {
        Point a = new Point(-2, 3);
        Point b = new Point(2, 0);

        assertEquals(5.0, Task4.distanceBetweenPoints(a, b));
    }
}