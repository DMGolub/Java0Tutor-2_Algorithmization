package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task10Test {

    @Test
    public void compressArray_shouldThrowIllegalArgumentException_whenArrayIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task10.compressArray(null));
    }

    @Test
    public void compressArray_shouldReturn1_whenArrayIs1() {
        int[] expected = {1};
        int[] array = {1};

        Task10.compressArray(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void compressArray_shouldReturn10_whenArrayIs12() {
        int[] expected = {1, 0};
        int[] array = {1, 2};

        Task10.compressArray(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void compressArray_shouldReturn130_whenArrayIs123() {
        int[] expected = {1, 3, 0};
        int[] array = {1, 2, 3};

        Task10.compressArray(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void compressArray_shouldReturn1300_whenArrayIs1234() {
        int[] expected = {1, 3, 0, 0};
        int[] array = {1, 2, 3, 4};

        Task10.compressArray(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void compressArray_shouldReturn13500_whenArrayIs12345() {
        int[] expected = {1, 3, 5, 0, 0};
        int[] array = {1, 2, 3, 4, 5};

        Task10.compressArray(array);

        assertArrayEquals(expected, array);
    }

    @Test
    public void compressArray_shouldReturn135000_whenArrayIs123456() {
        int[] expected = {1, 3, 5, 0, 0, 0};
        int[] array = {1, 2, 3, 4, 5, 6};

        Task10.compressArray(array);

        assertArrayEquals(expected, array);
    }
}