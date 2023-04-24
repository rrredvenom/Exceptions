package HW1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(arrayOfDifference(array1, array2)));
    }

    public static int[] arrayOfDifference(int[] ar1, int[] ar2) {
        if (ar1 == null || ar2 == null) {
            throw new RuntimeException("Введен пустой массив");
        }
        if (ar1.length != ar2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        if (!(ar1.getClass().getSimpleName() == "int[]") && (ar2.getClass().getSimpleName() == "int[]")) {
          throw new RuntimeException("Массив состоит не из целочисленны элементов");
        }

        int[] result = new int[ar1.length];
        for (int i = 0; i < ar1.length; i++) {
            result[i] = ar1[i] - ar2[i];
        }
        return result;
    }
}
