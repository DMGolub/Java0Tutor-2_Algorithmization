package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    public void factorial_shouldThrowIllegalArgumentException_whenNumberIsNegative() {
        assertThrows(IllegalArgumentException.class,
                () -> Task7.factorial(-1));
    }

    @Test
    public void factorial_shouldReturn1_whenNumberIs0() {
        assertEquals(1, Task7.factorial(0));
    }

    @Test
    public void factorial_shouldReturn1_whenNumberIs1() {
        assertEquals(1, Task7.factorial(1));
    }

    @Test
    public void factorial_shouldReturn6_whenNumberIs3() {
        assertEquals(6, Task7.factorial(3));
    }

    @Test
    public void factorial_shouldReturn120_whenNumberIs5() {
        assertEquals(120, Task7.factorial(5));
    }

    @Test
    public void sumOfFactorialsOfOddNumbers_shouldReturn368047_whenNumberIs9() {
        assertEquals(368047, Task7.sumOfFactorialsOfOddNumbers(9));
    }
}