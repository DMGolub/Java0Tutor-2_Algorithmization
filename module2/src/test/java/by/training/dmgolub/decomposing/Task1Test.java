package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void greatestCommonDivisor_shouldReturn3_whenA3B15() {
        assertEquals(3, Task1.greatestCommonDivisor(3, 15));
    }

    @Test
    public void greatestCommonDivisor_shouldReturn3_whenA3BMinus15() {
        assertEquals(3, Task1.greatestCommonDivisor(3, -15));
    }

    @Test
    public void greatestCommonDivisor_shouldReturn5_whenA0B5() {
        assertEquals(5, Task1.greatestCommonDivisor(0, 5));
    }

    @Test
    public void greatestCommonDivisor_shouldReturn5_whenA5B0() {
        assertEquals(5, Task1.greatestCommonDivisor(5, 0));
    }

    @Test
    public void smallestCommonMultiple_shouldReturn30_whenA3B10() {
        assertEquals(30, Task1.smallestCommonMultiple(3, 10));
    }

    @Test
    public void smallestCommonMultiple_shouldReturn80_whenA16B20() {
        assertEquals(80, Task1.smallestCommonMultiple(16, 20));
    }

    @Test
    public void smallestCommonMultiple_shouldReturn80_whenAMinus16B20() {
        assertEquals(80, Task1.smallestCommonMultiple(-16, 20));
    }

    @Test
    public void smallestCommonMultiple_shouldReturn0_whenA0B5() {
        assertEquals(0, Task1.smallestCommonMultiple(0, 5));
    }

    @Test
    public void smallestCommonMultiple_shouldReturn0_whenA5B0() {
        assertEquals(0, Task1.smallestCommonMultiple(5, 0));
    }

    @Test
    public void smallestCommonMultiple_shouldReturn0_whenA0B0() {
        assertEquals(0, Task1.smallestCommonMultiple(0, 0));
    }
}