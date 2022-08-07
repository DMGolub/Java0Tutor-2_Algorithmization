package by.training.dmgolub.one_dimensional_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void replaceAllMembers_shouldThrowIllegalArgumentException_whenSequenceIsNull() {
        assertThrows(IllegalArgumentException.class,
                () -> Task2.replaceAllMembersLargerThanGiven(null, 2.0));
    }

    @Test
    public void replaceAllMembers_shouldReturn0_whenSequenceSizeIs0() {
        double[] sequence = new double[0];

        assertEquals(0, Task2.replaceAllMembersLargerThanGiven(sequence, 2.0));
    }

    @Test
    public void replaceAllMembers_shouldReplaceMembersAndReturnCount_whenThereAreSuchMembers() {
        double[] sequence = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] expected = {1.0, 2.0, 3.0, 3.0, 3.0};
        int count = Task2.replaceAllMembersLargerThanGiven(sequence, 3.0);

        assertEquals(2, count);
        assertArrayEquals(expected, sequence);
    }

    @Test
    public void replaceAllMembers_shouldNotReplaceMembersAndReturn0_whenThereAreNoSuchMembers() {
        double[] sequence = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        int count = Task2.replaceAllMembersLargerThanGiven(sequence, 6.0);

        assertEquals(0, count);
        assertArrayEquals(expected, sequence);
    }
}