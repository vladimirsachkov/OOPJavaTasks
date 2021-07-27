package com.javatasks.basics.vector;

import static java.lang.Math.*;

public class Vector {
    private double x;
    private double y;
    private double z;

    //конструктор с параметрами в виде списка координат x, y, z
    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        System.out.println("Vector was initialized.");
    }

    //метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt():
    public double getVectorLength() {
        double vectorLength = 0;
        int power = 2;
        vectorLength = pow(this.x, power) + pow(this.y, power) + pow(this.z, power);
        vectorLength = sqrt(vectorLength);
        return vectorLength;
    }

    //метод, вычисляющий скалярное произведение
    public static double getScalarProduct (Vector firstVector, Vector secondVector) {
        double scalarProduct = 0;
        scalarProduct = firstVector.getX()*secondVector.getX() + firstVector.getY()*secondVector.getY() + firstVector.getZ()*secondVector.getZ();
        return scalarProduct;
    }

    //метод, вычисляющий векторное произведение с другим вектором
    public static Vector getVectorProduct (Vector firstVector, Vector secondVector) {
        return new Vector(
                firstVector.getY()*secondVector.getZ() - firstVector.getZ()*secondVector.getY(),
                firstVector.getZ()*secondVector.getX() - firstVector.getX()*secondVector.getZ(),
                firstVector.getX()*secondVector.getY() - firstVector.getY()*secondVector.getX()
        );
    }

//    метод, вычисляющий угол между векторами (или косинус угла):
//    косинус угла между векторами равен скалярному произведению векторов,
//    деленному на произведение модулей (длин) векторов:

    public static double getAngleBetweenVectors (Vector firstVector, Vector secondVector) {
        double angleBetweenVectors = 0;
        angleBetweenVectors = getScalarProduct(firstVector, secondVector)/(firstVector.getVectorLength()*secondVector.getVectorLength());
        return angleBetweenVectors;
    }

//    Методы для суммы и разности

//  Сумма
    public static Vector getSumVectors (Vector firstVector, Vector secondVector) {
        return new Vector(
                firstVector.getX()+secondVector.getX(),
                firstVector.getY()+secondVector.getY(),
                firstVector.getZ()+secondVector.getZ()
        );
    }

//  Разность
    public static Vector getDifferenceVectors (Vector firstVector, Vector secondVector) {
        return new Vector(
                firstVector.getX()-secondVector.getX(),
                firstVector.getY()-secondVector.getY(),
                firstVector.getZ()-secondVector.getZ()
        );
    }

//  статический метод, который принимает целое число N,
//  и возвращает массив случайных векторов размером N.
    public static Vector[] generate(int n) {
        Vector[] vectors = new Vector[n];
        for (int i=0; i < n; i++) {
            vectors[i] = new Vector(Math.random(), Math.random(), Math.random());
        }
        return  vectors;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}