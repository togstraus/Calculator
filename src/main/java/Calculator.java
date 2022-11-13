import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@Getter
@Setter
public class Calculator {

    public static double sum(int a, int b) {
        return a + b;
    }

    public static double sub(int a, int b) {
        return a - b;
    }

    public static double mult(int a, int b) {
        return a * b;
    }

    public static double div(int a, int b) {
        return (double) a / (double) b;
    }

    static double result;
    public static void actions(String action, int a, int b) {
        switch (action) {

            case "+" -> result = sum(a, b);
            case "-" -> result = sub(a, b);
            case "*" -> result = mult(a, b);
            case "/" -> result = div(a, b);
        }
    }

    public static void  main(String[] args) {
        String action;
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Введите знак действия (+ - * /):");
                action = sc.next("[\\+\\-\\*\\/]");
                break;
            } catch (Exception e) {
                System.out.println("Введен неверный символ. Повторите ввод.");
            }
        }
        int a;
        while (true) {
            try {
                Scanner sc1 = new Scanner(System.in);
                System.out.println("Введите значение первой переменной:");
                a = sc1.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введен неверный символ. Повторите ввод.");
            }
        }
        int b;
        while (true) {
            try {
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Введите значение второй переменной:");
                b = sc2.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Введен неверный символ. Повторите ввод.");
            }
        }
        actions(action, a, b);
        System.out.printf("Результат: %.2f", result);
    }
}