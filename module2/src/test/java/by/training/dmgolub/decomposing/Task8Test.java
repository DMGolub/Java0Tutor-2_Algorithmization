package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task8Test {

    @Test
    public void sumOfThreeElements_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task8.sumOfThreeElements(null, 1));
    }

    @Test
    public void sumOfThreeElements_shouldThrowIllegalArgumentException_whenIndexIsNegative() {
        int[] array = {1, 2, 3};

        assertThrows(IllegalArgumentException.class,
                () -> Task8.sumOfThreeElements(array, -1));
    }

    @Test
    public void sumOfThreeElements_shouldThrowIllegalArgumentException_whenLengthIsLessThanIndexPlus3() {
        int[] array = {1, 2, 3};

        assertThrows(IllegalArgumentException.class,
                () -> Task8.sumOfThreeElements(array, 2));
    }

    @Test
    public void sumOfThreeElements_() {
        int[] array = {1, 2, 3, 4, 5, 6};

        assertEquals(6, Task8.sumOfThreeElements(array, 0));
        assertEquals(12, Task8.sumOfThreeElements(array, 2));
        assertEquals(15, Task8.sumOfThreeElements(array, 3));
    }
}