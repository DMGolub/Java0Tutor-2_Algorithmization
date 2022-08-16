package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    public void greatestCommonDivisor_shouldReturn3_whenA15B21C81D9() {
        int a = 15;
        int b = 21;
        int c = 18;
        int d = 9;

        assertEquals(3, Task2.greatestCommonDivisor(a, b, c, d));
    }
}