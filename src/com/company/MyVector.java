package com.company;

import java.util.Arrays;

public class MyVector
{
    double[] vector;
    int size;

    //Конструктор
    MyVector(int size, double[] vector)
    {
        //this.vector = new double[size];
        this.size = size;
        this.vector = vector;
    }


    public double GetElement(int numberOfElement)
    {
        return vector[numberOfElement];
    }
    public void SetElement(int numberOfElement, double value)
    {
        vector[numberOfElement] = value;
    }

    //Размер вектора
    public int GetSize()
    {
        return size;
    }

    //Находим минимальный элемент
    public double GetMinElement()
    {
        double min = vector[0];
        for (int i = 0; i < size; i++)
        {
            if (min > vector[i])
            {
                min = vector[i];
            }
        }
        return min;
    }

    //Находим максимальный элемент
    public double GetMaxElement()
    {
        double max = vector[0];
        for (int i = 0; i < size; i++)
        {
            if (max < vector[i])
            {
                max = vector[i];
            }
        }
        return max;
    }

    //Сортировка по убыванию пузырькем
    public void Sort()
    {
        for(int start = 0; start < size - 1; start++)
        {
            for (int index = 0; index < size - 1 - start; index++)
            {
                if (vector[index] < vector[index + 1])
                {
                    Swap(index);
                }
            }
        }
    }

    //Перестановка для сортировки
    private void Swap(int i)
    {
        double temp = vector[i];
        vector[i] = vector[i + 1];
        vector[(i + 1)] = temp;
    }

    //Нахождение евклидовой нормы
    public double EuclidNorma()
    {
        double sum = 0.0f;
        for (int i = 0; i < size; ++i)
            sum += vector[i] * vector[i];
        return Math.sqrt(sum);
    }

    //Сложение двух векторов
    public double[] Summ(double[] vector2)
    {
        for (int i = 0; i < size; i++)
        {
            vector[i]+=vector2[i];
        }
        return vector;
    }

    //Умножение вектора на число
    public double[] MultiplicationVector(double variable)
    {
        for (int i = 0; i < size; i++)
        {
            vector[i] = vector[i] * variable;
        }
        return vector;
    }

    //Нахождение скалярного произведения двух векторов
    public double[] MultiplicationVectorToVector(double[] vector2)
    {
        for (int i = 0; i < size; i++)
        {
            vector[i] = vector[i] * vector2[i];
        }
        return vector;
    }

    @Override
    public String toString() {
        return "MyVector{" +
                "vector=" + Arrays.toString(vector) +
                ", size=" + size +
                '}';
    }
}
