package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task9Test {

    @Test
    public void findMostCN_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.findMostCommonNumber(null));
    }

    @Test
    public void findMostCN_shouldReturnMostCommonNumber_whenThereIsOneSuchNumber() {
        int[] array = {1, 2, 3, 3, 4};

        assertEquals(3, Task9.findMostCommonNumber(array));
    }

    @Test
    public void findMostCN_shouldReturnMinimumOfMCNumbers_whenThereAreTwoSuchNumbers() {
        int[] array = {1, 2, 2, 3, 3, 4};

        assertEquals(2, Task9.findMostCommonNumber(array));
    }

    @Test
    public void findMax_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task9.findMax(null));
    }

    @Test
    public void findMax_shouldReturnMaxElement_whenArrayContainsElements() {
        int[] array = {5, 2, 4, 1, 3};

        assertEquals(5, Task9.findMax(array));
    }
}