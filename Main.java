//*+Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.


import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(ex1());
//        System.out.println(ex2(4));
//        ex3(1000);
//        ex4();
        ex5("2?", "?5", "69");
    }

    public static int ex1() {
        System.out.println("Введите число n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 1; i < n; i++) {
            result = n + i;
        }
        return result;
    }

    public static int ex2(int n) {
        if (n == 0) return 1;
        return n * ex2(n - 1);
    }

    public static void ex3(int n) {
        String result = "2, ";
        for (int i = 2; i != n; i++) {
            if (i > 7) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    result += i + ", ";
                }
            } else {
                if (i % 2 != 0) {
                    result += i + ", ";
                }
            }
        }
        System.out.println(result);
    }

    public static void ex4() {
        System.out.print("Введите первое n: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.print("Введите второе n: ");
        int n2 = scanner.nextInt();
        System.out.print("\033[H\033[J");
        System.out.println("1: Сумма");
        System.out.println("2: Умножение");
        System.out.println("3: Деление");
        System.out.print("Выберите действие:");
        int mode = scanner.nextInt();
        if (mode == 1) System.out.printf("%d+%d=%d", n1, n2, n1 + n2);
        if (mode == 2) System.out.printf("%dx%d=%d", n1, n2, n1 * n2);
        if (mode == 3) System.out.printf("%d:%d=%d", n1, n2, n1 / n2);
        else System.out.println("ERROR");
    }

    public static void ex5(String q, String w, String e) {
        String[] array = new String[]{q, w, e};
        for (String j : array) {
            String[]temp = j.split("");
            System.out.println(temp[0]=="?"); //WTF false ????
        }


    }
}

