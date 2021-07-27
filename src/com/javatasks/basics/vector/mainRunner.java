package com.javatasks.basics.vector;

public class mainRunner {
    public static void main(String[] args) {

        System.out.print("asd");
        Vector vector = new Vector(2, 3, 1);
        double vectorLength = vector.getVectorLength();
        Vector vector2 = new Vector(4, 5, 2);

        System.out.println(vectorLength);

        double ScalarProduct = Vector.getScalarProduct(vector, vector2);
        System.out.println(ScalarProduct);

        double a = Vector.getAngleBetweenVectors(vector, vector2);
        System.out.println(a);

        Vector sumVector = Vector.getSumVectors(vector, vector2);
        System.out.println(sumVector.toString());

        Vector difVector = Vector.getDifferenceVectors(vector, vector2);
        System.out.println(difVector.toString());

        Vector.generate(4);
    }
}
