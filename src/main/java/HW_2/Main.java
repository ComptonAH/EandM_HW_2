package HW_2;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
        // Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
        Main.floatReturn();


        // Задание 2
        try {
            int d = 0;
            double catchedRes1 = (double) 8 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }


        // Задание 3
            try {
                int a = 90;
                int b = 3;
                System.out.println(a / b);
                printSum(23, 234);
                int[] abc = { 1, 2 };
                abc[3] = 9;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            }


        // Задание 4
            Scanner scanner = new Scanner(System.in);
            System.out.print("Write smth: ");
            String msg = scanner.nextLine();
            if (msg.length() == 0) throw new NullPointerException("You can't enter empty strings");
//
    }

    public static void floatReturn() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the float number: ");
            Float number = scanner.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("You didn't enter the float number. Please try again! ");
        }
    }
    public static void printSum(Integer a, Integer b) {
            System.out.println(a + b);
    }

}
