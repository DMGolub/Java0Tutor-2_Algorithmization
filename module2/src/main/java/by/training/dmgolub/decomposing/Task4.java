package by.training.dmgolub.decomposing;

import by.training.dmgolub.parser.Parser;

import java.util.Scanner;

/*  На плоскости заданы своими координатами n точек. Написать метод(ы),
    определяющие, между какими из пар точек самое больше расстояние.
    Указание: коррдинаты точек занести в массив.                    */
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = Parser.tryParseInt(scanner, "points count");
            while (n < 2) {
                System.out.println("Number of points can not be less than 2. Please try again.");
                n = Parser.tryParseInt(scanner, "points count");
            }
            Point[] points = new Point[n];
            for (int i = 0; i < n; i++) {
                String pointName = "point[" + i + "]";
                double x = Parser.tryParseDouble(scanner, pointName + " x");
                double y = Parser.tryParseDouble(scanner, pointName + " y");
                points[i] = new Point(x, y);
            }
            double maxDistance = findMaxDistanceBetweenPoints(points);
            System.out.println("Maximum distance = " + maxDistance);
        }
    }

    /**
     * Finds maximum distance between given points.
     * @param points Points array.
     * @return maximum distance.
     * @throws IllegalArgumentException when points array is null or array length is less than 2.
     * @author DMGolub
     */
    public static double findMaxDistanceBetweenPoints(Point[] points) {
        if (points == null) {
            throw new IllegalArgumentException("array of points can not be null");
        }
        if (points.length < 2) {
            throw new IllegalArgumentException("number of points can not be less than 2");
        }
        double maxDistance = Double.MIN_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                double distance = distanceBetweenPoints(points[i], points[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }

    /**
     * Calculates distance between two given points with coordinates x, y.
     * @param a double coordinate x,
     * @param b double coordinate y.
     * @return calculated distance.
     * @throws IllegalArgumentException when point is null.
     * @author DMGolub
     */
    public static double distanceBetweenPoints(Point a, Point b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Point can not be null");
        }
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2.0) + Math.pow(b.getY() - a.getY(), 2.0));
    }
}