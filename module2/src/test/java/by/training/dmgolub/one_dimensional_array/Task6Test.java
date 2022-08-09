package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task6Test {

    @Test
    public void isPrimeNumber_shouldReturnFalse_whenNumberIsNegative() {
        assertFalse(Task6.isPrimeNumber(-1));
    }

    @Test
    public void isPrimeNumber_shouldReturnTrue_whenNumberIs2() {
        assertTrue(Task6.isPrimeNumber(2));
    }

    @Test
    public void isPrimeNumber_shouldReturnFalse_whenNumberIs4() {
        assertFalse(Task6.isPrimeNumber(4));
    }

    @Test
    public void isPrimeNumber_shouldReturnTrue_whenNumberIs5() {
        assertTrue(Task6.isPrimeNumber(5));
    }

    @Test
    public void sumOfElements_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task6.sumOfElementsWithPrimeIndexes(null));
    }

    @Test
    public void sumOfElements_shouldReturn0_whenArrayIsEmpty() {
        assertEquals(0, Task6.sumOfElementsWithPrimeIndexes(new double[0]));
    }

    @Test
    public void sumOfElements_shouldReturn0_whenThereAreNoSuchElements() {
        double[] array = {1.0, 2.0};

        assertEquals(0, Task6.sumOfElementsWithPrimeIndexes(array));
    }

    @Test
    public void sumOfElements_shouldReturnSum_whenThereAreSuchElements() {
        double[] array = {0.0, 1.0, 2.0, 3.0, 4.0};

        assertEquals(5.0, Task6.sumOfElementsWithPrimeIndexes(array));
    }
}