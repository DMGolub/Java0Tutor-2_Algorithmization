package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    public void primeNumbers_shouldReturnTrue_whenA6B8C9() {
        assertTrue(Task6.areMutuallyPrimeNumbers(6, 8, 9));
    }

    @Test
    public void primeNumbers_shouldReturnTrue_whenA8B15C45() {
        assertTrue(Task6.areMutuallyPrimeNumbers(8, 15, 49));
    }

    @Test
    public void primeNumbers_shouldReturnTrue_whenA331B463C733() {
        assertTrue(Task6.areMutuallyPrimeNumbers(331, 463, 733));
    }

    @Test
    public void primeNumbers_shouldReturnFalse_whenA2B4C8() {
        assertFalse(Task6.areMutuallyPrimeNumbers(2, 4, 8));
    }

    @Test
    public void primeNumbers_shouldReturnFalse_whenA3B6C12() {
        assertFalse(Task6.areMutuallyPrimeNumbers(3, 6, 12));
    }
}