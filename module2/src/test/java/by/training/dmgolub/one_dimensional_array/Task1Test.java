package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @Test
    public void sumOfMultiples_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task1.sumOfMultiples(null, 2));
    }

    @Test
    public void sumOfMultiples_shouldReturn0_whenArraySizeIs0() {
        int[] array = new int[0];

        assertEquals(0, Task1.sumOfMultiples(array, 2));
    }

    @Test
    public void sumOfMultiples_shouldReturn0_whenThereAreNoMultiples() {
        int[] array = {1, 3, 5, 7, 9};

        assertEquals(0, Task1.sumOfMultiples(array, 2));
    }

    @Test
    public void sumOfMultiples_shouldReturnSum_whenThereAreMultiples() {
        int[] array = {1, 2, 3, 4, 5, 6};

        assertEquals(12, Task1.sumOfMultiples(array, 2));
    }
}