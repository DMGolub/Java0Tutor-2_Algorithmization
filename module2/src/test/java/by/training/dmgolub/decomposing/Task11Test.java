package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task11Test {

    @Test
    public void countDigits_shouldReturn1_whenNumberIs5() {
        assertEquals(1, Task11.countDigits(5));
    }

    @Test
    public void countDigits_shouldReturn1_whenNumberIsMinus5() {
        assertEquals(1, Task11.countDigits(-5));
    }

    @Test
    public void countDigits_shouldReturn1_whenNumberIsMinus5Point0() {
        assertEquals(1, Task11.countDigits(-5.0));
    }

    @Test
    public void countDigits_shouldReturn2_whenNumberIs5Point2() {
        assertEquals(2, Task11.countDigits(5.2));
    }

    @Test
    public void countDigits_shouldReturn2_whenNumberIsMinus5Point3() {
        assertEquals(2, Task11.countDigits(-5.3));
    }
}