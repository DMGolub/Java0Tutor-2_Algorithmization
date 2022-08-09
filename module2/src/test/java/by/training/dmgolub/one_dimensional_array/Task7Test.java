package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task7Test {

    @Test
    public void findMax_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task7.findMaxOfPairs(null));
    }

    @Test
    public void findMax_shouldThrowIllegalArgumentException_whenArrayLengthInNotEven() {
        double[] array = new double[5];

        assertThrows(IllegalArgumentException.class,
                () -> Task7.findMaxOfPairs(array));
    }

    @Test
    public void findMax_shouldReturnMax_whenThereIsOnePair() {
        double[] array = {1.0, 2.0};

        assertEquals(3.0, Task7.findMaxOfPairs(array));
    }

    @Test
    public void findMax_shouldReturnMax_whenThereAreSeveralPairs() {
        double[] array = {1.0, 2.0, 3.0, 3.0, 6.0, 6.0};

        assertEquals(8.0, Task7.findMaxOfPairs(array));
    }
}