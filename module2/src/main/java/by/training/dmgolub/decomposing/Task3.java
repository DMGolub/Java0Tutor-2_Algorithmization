package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.awt.color.ICC_ColorSpace;
import java.util.Scanner;

/*  Вычислить площадь правильного шестиугольника со стороной a,
    используя метод вычисления площади треугольника.        */
public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double a = Parser.tryParseDouble(scanner, "a");
            while (a < 0) {
                System.out.println("Hexagon side size can not"
                        + " be negative. Please try again");
                a = Parser.tryParseDouble(scanner, "a");
            }
            System.out.println("Hexagon area = " + calculateRegularHexagonArea(a));
        }
    }

    /**
     * Calculates the area of a regular hexagon with a given side length.
     * @param sideLength double hexagon side length.
     * @return hexagon area.
     * @throws IllegalArgumentException when side length is negative.
     * @author DMGolub
     */
    public static double calculateRegularHexagonArea(double sideLength) {
        if (sideLength < 0) {
            throw new IllegalArgumentException("Hexagon side length can not be negative");
        }
        final int HEXAGON_SIDES_NUMBER = 6;
        return HEXAGON_SIDES_NUMBER * calculateRegularTriangleArea(sideLength);
    }

    /**
     * Calculates the area of a regular triangle with a given side length.
     * @param sideLength double triangle side length.
     * @return triangle area.
     * @throws IllegalArgumentException when side length is negative.
     * @author DMGolub
     */
    public static double calculateRegularTriangleArea(double sideLength) {
        if (sideLength < 0) {
            throw new IllegalArgumentException("Triangle side length can not be negative");
        }
        return sideLength * sideLength * Math.sqrt(3) / 4;
    }
}