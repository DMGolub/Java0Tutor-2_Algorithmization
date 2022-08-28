package by.training.dmgolub.decomposing;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.junit.jupiter.api.Assertions.*;

class Task14Test {

    @Test
    public void countDigits_shouldReturn1_whenNumberIs5() {
        assertEquals(1, Task11.countDigits(5));
    }

    @Test
    public void countDigits_shouldReturn1_whenNumberIsMinus5() {
        assertEquals(1, Task11.countDigits(-5));
    }

    @Test
    public void countDigits_shouldReturn1_whenNumberIsMinus5Point0() {
        assertEquals(1, Task11.countDigits(-5.0));
    }

    @Test
    public void countDigits_shouldReturn2_whenNumberIs5Point2() {
        assertEquals(2, Task11.countDigits(5.2));
    }

    @Test
    public void countDigits_shouldReturn2_whenNumberIsMinus5Point3() {
        assertEquals(2, Task11.countDigits(-5.3));
    }

    @Test
    public void isArmstrongNumber_shouldReturnTrue_whenNumberIs153() {
        assertTrue(Task14.isArmstrongNumber(153));
    }

    @Test
    public void isArmstrongNumber_shouldReturnTrue_whenNumberIs370() {
        assertTrue(Task14.isArmstrongNumber(370));
    }

    @Test
    public void isArmstrongNumber_shouldReturnTrue_whenNumberIs371() {
        assertTrue(Task14.isArmstrongNumber(371));
    }

    @Test
    public void isArmstrongNumber_shouldReturnFalse_whenNumberIs372() {
        assertFalse(Task14.isArmstrongNumber(372));
    }

    @Test
    public void printArmstrongNumbers_shouldPrintFrom1To9_whenNumberIs20() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        StringJoiner expected = new StringJoiner(System.lineSeparator());
        expected.add("1")
                .add("2")
                .add("3")
                .add("4")
                .add("5")
                .add("6")
                .add("7")
                .add("8")
                .add("9");

        Task14.printArmstrongNumbers(1, 20);

        assertEquals(expected.toString() + System.lineSeparator(), out.toString());
    }
}