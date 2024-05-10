import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a:");
        float a = in.nextInt();
        System.out.println("Введите число b:");
        float b = in.nextInt();

        if (a > b) {
            System.out.println("a > b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
        if (a == b) {
            System.out.println("a = b");
        }

        System.out.println("Введитте действие (+,-,/,*):");
        String str = in.next();
        switch (str) {
            case "+":
                System.out.println("a + b = " + (a + b));
                break;
            case "-":
                System.out.println("Из какого числа вычитаем?");
                str = in.next();
                if (str.equals("a") || str.equals("а")) {
                    System.out.println("a - b = " + (a - b));
                    break;
                }
                if (str.equals("b") || str.equals("б")) {
                    System.out.println("b - a = " + (b - a));
                    break;
                } else {
                    System.out.println("Таких чисел нет.");
                    break;
                }

            case "/":
                System.out.println("Какие число делим?");
                str = in.next();
                if (str.equals("a") || str.equals("а")) {
                    if (b != 0) {
                        System.out.println("b / a = " + (b / a));
                        break;
                    } else {
                        System.out.println("На 0 делить нельзя!");
                        break;
                    }
                }
                if (str.equals("b") || str.equals("б")) {
                    if (a != 0) {
                        System.out.println("b / a =  " + (b / a));
                        break;
                    } else {
                        System.out.println("На 0 делить нельзя!");
                        break;
                    }
                } else {
                    System.out.println("Таких чисел нет.");
                    break;
                }
            case "*":
                System.out.println("a * b = " + (a * b));
                break;
        }
    }
}