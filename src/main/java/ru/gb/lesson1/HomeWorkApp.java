package ru.gb.lesson1;
import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }
    public static void printColor() {
        String RED_COLOUR = "Красный";
        String YELLOW_COLOUR = "Желтый";
        String GREEN_COLOUR = "Зеленый";

        int startNum = 200;
        Random rnd = new Random();
        int value = startNum - rnd.nextInt(300);

        if (value <= 0) {
            System.out.println(RED_COLOUR);
        } else if (value <= 100) {
            System.out.println(YELLOW_COLOUR);
        } else {
            System.out.println(GREEN_COLOUR);
        }
    }
    public static void compareNumbers() {
        int a = (int) (Math.random() * 10);
        int b = (int) (Math.random() * 10);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}