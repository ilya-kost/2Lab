package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        double[] vector = {1,7,2,9,12};
        MyVector array = new MyVector(5, vector);
        System.out.println("Размер вектора: " + array.GetSize());
        //Устанавливаем значение
        array.SetElement(1,0);
        //Извлекаем значение
        System.out.println("Мы извлекли число: " + array.GetElement(2));

        System.out.println("Минимальное значение вектора: " + array.GetMinElement());
        System.out.println("Максимальное значение вектора: " + array.GetMaxElement());

        System.out.println("Массив до сортировки: " + array.toString());

        array.Sort();
        System.out.println("Массив после сортировки: " + array.toString());

        System.out.println("Евклидова норма: " + array.EuclidNorma());

        array.MultiplicationVector(5);
        System.out.println("Умножение вектора на число: " + array.toString());

        double[] vector2 = {7,6,5,1,0};
        array.Summ(vector2);
        System.out.println("Сложение cо вторым вектором: " + array.toString());

        array.MultiplicationVectorToVector(vector2);
        System.out.println("Скалярное произведение двух векторов: "
                + array.toString());
    }
}
