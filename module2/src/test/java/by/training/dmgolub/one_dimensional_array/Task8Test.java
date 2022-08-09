package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    public void countElements_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task8.countElements(null, 1));
    }

    @Test
    public void countElements_shouldCountGivenElements_whenThereAreSuchElements() {
        int[] array = {5, 4, 3, 2, 1, 5};

        assertEquals(2, Task8.countElements(array, 5));
    }

    @Test
    public void findMin_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task8.findMin(null));
    }

    @Test
    public void findMin_shouldFindMinElement_whenThereAreElementsInTheArray() {
        int[] array = {5, 4, 3, 2, 1};

        assertEquals(1, Task8.findMin(array));
    }

    @Test
    public void excludeMinElements_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task8.excludeMinElements(null));
    }

    @Test
    public void excludeMinElements_shouldReturnEmptyArray_whenAllElementsAreEqual() {
        int[] array = {1, 1, 1, 1};

        assertArrayEquals(new int[0], Task8.excludeMinElements(array));
    }

    @Test
    public void excludeMinElements_shouldReturnArrayWithoutMinElements_whenElementsAreNotEqual() {
        int[] array = {1, 2, 1, 3, 1, 4};

        int[] expected = {2, 3, 4};

        assertArrayEquals(expected, Task8.excludeMinElements(array));
    }
}