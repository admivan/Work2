package ru.dolgov;

import java.util.Random;

public class Work2 {
    public static void main(String[] args) {

        System.out.println("Задание 1\n");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};// Создание массива

        replace(arr); // Вызов метода и передача массива

        System.out.println("\nЗадание 2\n");

        int[] arr2 = new int[8]; // Создание массива

        fill(arr2);

        System.out.println("\nЗадание 3\n");

        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}; // Создание массива

        myltiplyLess(arr3); // Вызов метода и передача массива

        System.out.println("\nЗадание 4\n");

        int[][] arr4 = new int[4][4]; // Создание массива

        dioganal(arr4); // Вызов метода и передача массива

        System.out.println("\nЗадание 5\n");

        int[] arr5 = new int[10];

        minAndMax(arr5);

    }

    /**
     * Задание 1
     * Замена 1 на 0 && 0 на 1
     *
     * @param arr принимаем целочисленный массив
     */
    public static void replace(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.print(arr[i] + " "); // Вывод массива
        }
        System.out.println();
    }

    /**
     * Задание 2
     * Заполняем пустой массив числами с шагом +3
     *
     * @param arr принимаем целочислинный массив
     */
    public static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " "); // Вывод массива
        }
        System.out.println();
    }

    /**
     * Задание 3
     * Умножаем цисла в массиве на 2
     *
     * @param arr принимаем целочислинный массив
     */
    public static void myltiplyLess(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    /**
     * Задание 4
     * Радномно заполняем массив и заменяем элементы по диоганале
     *
     * @param arr принмаем массив
     */
    public static void dioganal(int[][] arr) {
        Random random = new Random(); //Обращиние к классу Random
        for (int i = 0; i < arr.length; i++) { // проход по 1 измерению
            for (int j = 0; j < arr[i].length; j++) { //проход по 2 измерению
                arr[i][j] = random.nextInt(10); // генерация рандомного числа до 10 не включительно
                if (arr[i] == arr[j]) { //если индекс совпадает то заменяем число на 1
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void minAndMax(int[] arr) {
        /*
         * Заполнение массива рандомными числами
         */
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(999) + 1;
        }

        int min = arr[0]; // Инцилизация переменной мин
        int max = arr[0]; // Инцилизация переменной макс
        /*
        поиск минимального и максимального числа
         */
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
            System.out.print(arr[i] + " "); //Вывод массива
        }
        System.out.println();
        System.out.println("Максимальное число: " + max + " Минимальное число: " + min); //Вывод максимального и минимального
    }
}
