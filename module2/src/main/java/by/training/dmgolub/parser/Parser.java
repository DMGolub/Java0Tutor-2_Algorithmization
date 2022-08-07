package by.training.dmgolub.parser;

import java.util.Scanner;

public class Parser {

    /**
     * Parses integer value from Scanner. If the specified input is not an integer value,
     * asks user to retry input.
     * @param scanner Scanner,
     * @param variableName String variable name.
     * @return integer value parsed from input.
     */
    public static int tryParseInt(Scanner scanner, String variableName) {
        if (scanner == null) {
            throw new IllegalArgumentException("Scanner can not be null!");
        }
        if (variableName == null) {
            throw new IllegalArgumentException("Variable name can not be null!");
        }
        if (variableName.isEmpty()) {
            throw new IllegalArgumentException("Variable name can not be empty!");
        }
        System.out.print("Enter " + variableName + ": ");
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine();
            System.out.println("Wrong input: " + str + ". Please try again.");
            System.out.print("Enter " + variableName + ": ");
        }
        return scanner.nextInt();
    }

    /**
     * Parses double value from Scanner. If the specified input is not a double value,
     * asks user to retry input.
     * @param scanner Scanner,
     * @param variableName String variable name.
     * @return double value parsed from input.
     */
    public static double tryParseDouble(Scanner scanner, String variableName) {
        if (scanner == null) {
            throw new IllegalArgumentException("Scanner can not be null!");
        }
        if (variableName == null) {
            throw new IllegalArgumentException("Variable name can not be null!");
        }
        if (variableName.isEmpty()) {
            throw new IllegalArgumentException("Variable name can not be empty!");
        }
        System.out.print("Enter " + variableName + ": ");
        while (!scanner.hasNextDouble()) {
            String str = scanner.nextLine();
            System.out.println("Wrong input: " + str + ". Please try again.");
            System.out.print("Enter " + variableName + ": ");
        }
        return scanner.nextDouble();
    }
}