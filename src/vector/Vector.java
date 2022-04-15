package vector;

import java.util.Arrays;

public class Vector {

    private int[] values;

    public Vector(int size) {

        values = new int[size];
    }

    public int length() {

        return values.length;
    }

    public int getValue(int index) {

        return values[index];
    }

    public int[] getValues() {

        return Arrays.copyOf(values, values.length);
    }

    public void setValue(int index, int value) {

        values[index] = value;
    }

    public void addElements(int[] e) {

        for(int i = 0; i < values.length; i++){

            values[i] = e[i];
        }
    }

    public void sortByAscend() {

        boolean isSorted = false;
        int buf;

        while(!isSorted) {

            isSorted = true;
            for(int i = 0; i < values.length - 1; i++) {

                if(values[i] > values[i + 1]) {

                    isSorted = false;
                    buf = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = buf;
                }
            }
        }
    }

    public int searchMaxValue() {

        int max = values[0];
        for(int i = 1; i < values.length; i++) {

            if(max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

    public int searchMinValue() {

        int min = values[0];
        for(int i = 1; i < values.length; i++) {

            if(min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }
}