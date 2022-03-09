package ru.gb.lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        String TEXT = "Заходит в бар бесконечное число математиков...";

        System.out.println(checkSum(10, 11));
        checkNum(0);
        System.out.println(checkNum2(0));
        textCount(TEXT, 5);
        System.out.println(checkYear(400));
    }
    /* 1. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    в противном случае – false.*/
    public static boolean checkSum(int a, int b) {
        int sumAB = a + b;
        return sumAB >= 10 && sumAB <= 20;
    }
    /* 2. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.*/
    public static void checkNum(int num) {
        if (num >= 0){
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    /* 3. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.*/
    public static boolean checkNum2(int num) {
        return num < 0;
    }
    /* 4. Написать метод, которому в качестве аргументов передается строка и число,
    метод должен отпечатать в консоль указанную строку, указанное количество раз*/
    public static void textCount(String text, int numCount) {
        for (int i = 0; i < numCount; i++){
            System.out.println(text);
        }
    }
    /*5. Написать метод, который определяет, является ли год високосным,
    и возвращает boolean (високосный - true, не високосный - false).
    Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.*/
    public static boolean checkYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
