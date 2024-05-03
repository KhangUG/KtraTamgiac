package org.example;

public class TriangleType {

    public static String getTriangleType(int side1, int side2, int side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            return "Không là tam giác";
        } else if (side1 == side2 && side2 == side3) {
            return "Tam giác đều";
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            return "Tam giác cân";
        } else if (isRightTriangle(side1, side2, side3)) {
            return "Tam giác vuông";
        } else {
            return "Không là tam giác";
        }
    }

    private static boolean isRightTriangle(int side1, int side2, int side3) {
        int maxSide = Math.max(side1, Math.max(side2, side3));
        if (maxSide == side1) {
            return side1 * side1 == side2 * side2 + side3 * side3;
        } else if (maxSide == side2) {
            return side2 * side2 == side1 * side1 + side3 * side3;
        } else {
            return side3 * side3 == side1 * side1 + side2 * side2;
        }
    }
}
