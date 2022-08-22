package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    public void findSecondMaximum_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task5.findSecondMaximum(null));
    }

    @Test
    public void findSecondMaximum_shouldReturnSecondMaximum_whenArrayIsAscending() {
        int[] numbers = {1, 2, 3, 4, 5};

        assertEquals(4, Task5.findSecondMaximum(numbers));
    }

    @Test
    public void findSecondMaximum_shouldReturnSecondMaximum_whenArrayIsDescending() {
        int[] numbers = {5, 4, 3, 2, 1};

        assertEquals(4, Task5.findSecondMaximum(numbers));
    }

    @Test
    public void findSecondMaximum_shouldReturnSecondMaximum_whenThereAreTwoMaximumElements() {
        int[] numbers = {5, 1, 2, 3, 4, 5};

        assertEquals(4, Task5.findSecondMaximum(numbers));
    }
}