package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    public void swap_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task4.swapMinAndMaxArrayElements(null));
    }

    @Test
    public void swap_shouldSwapElements_whenThereAreMaxAndMinElements() {
        double[] array = {-1.0, 1.0, 0, 2.0};
        double[] expected = {2.0, 1.0, 0, -1.0};

        Task4.swapMinAndMaxArrayElements(array);

        assertArrayEquals(expected, array);
    }
}