import java.util.Scanner;
public class Calculator {

    public static double sum(double a, double b) {
        return Math.round((a + b) * 100.0) / 100.0;
    }

    public static double sub(double a, double b) {
        return Math.round((a - b) * 100.0) / 100.0;
    }

    public static double mult(double a, double b) {
        return Math.round((a * b) * 100.0) / 100.0;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Делить на ноль нельзя");
        }
        return Math.round((a / b) * 100.0) / 100.0;
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