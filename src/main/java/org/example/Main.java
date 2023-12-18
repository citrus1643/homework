package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1 задача
        int[] arr = {5, 2, 9, 1, 5, 6};


        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));



        //задача 2
        int[] arr1 = {5, 2, 9, 1, 6, 8, 3, 7};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenArray[evenIndex++] = num;
            } else {
                oddArray[oddIndex++] = num;
            }
        }

        System.out.println("Массив четных чисел: " + Arrays.toString(evenArray));
        System.out.println("Массив нечетных чисел: " + Arrays.toString(oddArray));

        //3 задача
        char[] letters = {'g', 'a', 't', 'z', 'p', 'e', 'b'};

        int m = letters.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (letters[j] > letters[j + 1]) {
                    char temp = letters[j];
                    letters[j] = letters[j + 1];
                    letters[j + 1] = temp;
                }
            }
        }

        System.out.println("Отсортированные буквы в верхнем регистре:" + Arrays.toString(letters));

        //задача на сравнение
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};

        boolean isEqual = arraysAreEqual(array1, array2);

        if (isEqual) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }

        //задача с сортировкой на возрастание
        int[] arr3 = {5, -3, 2, 8, 0};
        sortAscending(arr);
        System.out.println("Отсортированный массив в порядке возрастания: " + Arrays.toString(arr3));

        // задача с сортировкой float
        float[] arr4 = {12.23f, 56.03f, 118.72f, 0.95f};

        sortFloatByDecimalPart(arr4);

        System.out.println("Отсортированный массив в порядке возрастания части после точки: " + Arrays.toString(arr4));

        //задача с массивом из байтов
        byte[] arr5 = {0, 0, 0, 0, 0, 1, 0, 1};

        System.out.println("Массив: " + Arrays.toString(arr5));

        int decimalValue = convertBinaryToDecimal(arr5);

        System.out.println("Число в десятичной системе: " + decimalValue);
    }
    public static boolean arraysAreEqual(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }


        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;


    }
    public static void sortAscending(int[] arr3) {
        int n = arr3.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr3[j] > arr3[j + 1]) {
                    int temp = arr3[j];
                    arr3[j] = arr3[j + 1];
                    arr3[j + 1] = temp;
                }
            }
        }
    }
    public static void sortFloatByDecimalPart(float[] arr4) {
        int n = arr4.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                float decimalPart1 = arr4[j] - (int) arr4[j];
                float decimalPart2 = arr4[j + 1] - (int) arr4[j + 1];

                if (decimalPart1 > decimalPart2) {
                    float temp = arr4[j];
                    arr4[j] = arr4[j + 1];
                    arr4[j + 1] = temp;
                }
            }
        }
    }

    public static int convertBinaryToDecimal(byte[] arr5) {
        int decimalValue = 0;
        for (int i = arr5.length - 1, power = 0; i >= 0; i--, power++) {
            if (arr5[i] == 1) {
                decimalValue += (1 << power);
            }
        }

        return decimalValue;
    }
}





