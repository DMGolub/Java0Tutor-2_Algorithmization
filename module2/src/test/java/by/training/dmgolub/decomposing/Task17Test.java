package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task17Test {

    @Test
    public void countIterations_shouldThrowIllegalArgumentException_whenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task17.countIterations(-1));
    }

    @Test
    public void countIterations_shouldReturn1_whenNumberIs9() {
        assertEquals(1, Task17.countIterations(9));
    }

    @Test
    public void countIterations_shouldReturn2_whenNumberIs11() {
        assertEquals(2, Task17.countIterations(11));
    }

    @Test
    public void countIterations_shouldReturn12_whenNumberis111() {
        assertEquals(12, Task17.countIterations(111));
    }

    @Test
    public void sumOfDigits_shouldReturn3_whenNumberIs111() {
        assertEquals(3, Task17.sumOfDigits(111));
    }

    @Test
    public void sumOfDigits_shouldReturn6_whenNumberIs123() {
        assertEquals(6, Task17.sumOfDigits(123));
    }

    @Test
    public void sumOfDigits_shouldReturn6_whenNumberIsMinus123() {
        assertEquals(6, Task17.sumOfDigits(-123));
    }
}