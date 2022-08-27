package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  Даны числа X, Y, Z, T - длины сторон четырехугольника.
    Написать метод (методы) вычисления его площади, если
    угол между сторонами длиной X и Y - прямой.         */
public class Task9 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double x = parseSideLength(scanner, "X");
            double y = parseSideLength(scanner, "Y");
            double z = parseSideLength(scanner, "Z");
            double t = parseSideLength(scanner, "T");
            System.out.println("Area = " + computeQuadrilateralArea(x, y, z, t));
        }
    }

    /**
     * Parses quadrilateral side length from console.
     * @param scanner Scanner.
     * @param name String quadrilateral size name.
     * @return parsed length.
     * @throws IllegalArgumentException when scanner or side name is null.
     * @author DMGolub
     */
    public static double parseSideLength(Scanner scanner, String name) {
        if (scanner == null) {
            throw new IllegalArgumentException("Scanner can not be null");
        }
        if (name == null) {
            throw new IllegalArgumentException("Name can not be null");
        }
        double size = Parser.tryParseDouble(scanner, name);
        while (size <= 0) {
            System.out.println("Side length can not be <= 0. Please try again.");
            size = Parser.tryParseDouble(scanner, name);
        }
        return size;
    }

    /**
     * Computes area of the given quadrilateral by its sides.
     * The angle between sides X and Y is 90 degrees.
     * @param x double first side length,
     * @param y double second side length,
     * @param z double third side length,
     * @param t double fourth side length.
     * @return calculated area.
     * @throws IllegalArgumentException when any of given sides length is negative or zero.
     * @author DMGolub
     */
    public static double computeQuadrilateralArea(double x, double y, double z, double t) {
        if (x <= 0 || y <= 0 || z <= 0 || t <= 0) {
            throw new IllegalArgumentException("Quadrilateral side length must be >= 0");
        }
        double hypotenuse = computeHypotenuse(x, y);
        return computeRightTriangleArea(x, y) + computeTriangleArea(hypotenuse, z, t);
    }

    /**
     * Computes area of the given right triangle by its sides.
     * @param a double first triangle cathet length,
     * @param b double second triangle cathet length.
     * @return calculated sum.
     * @throws IllegalArgumentException when any of cathets length is negative or zero.
     * @author DMGolub
     */
    public static double computeRightTriangleArea(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Triangle side length must be >= 0");
        }
        return a * b / 2.0;
    }

    /**
     * Computes area of the given triangle by its sides.
     * @param a double first triangle side length,
     * @param b double second triangle side length,
     * @param c double third triangle side length.
     * @return calculated sum.
     * @throws IllegalArgumentException when any of triangle sides length is negative or zero.
     * @author DMGolub
     */
    public static double computeTriangleArea(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Triangle side length must be >= 0");
        }
        double halfPerimeter = (a + b + c) / 2.0;
        return Math.sqrt(halfPerimeter * (halfPerimeter - a) *
                (halfPerimeter - b) * (halfPerimeter - c));
    }

    /**
     * Computes length of the triangle hypotenuse by two cathets sizes.
     * @param a double first triangle cathet length,
     * @param b double second triangle cathet length.
     * @return hypotenuse length.
     * @throws IllegalArgumentException when any of cathets length is negative or zero.
     * @author DMGolub
     */
    public static double computeHypotenuse(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Triangle side length must be >= 0");
        }
        return Math.sqrt(a * a + b * b);
    }
}