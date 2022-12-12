

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex();
    }

    public static int GetInt(String x) {
        boolean temp = false;
        while (temp != true) {
            System.out.print("Введите число " + x + ":");
            Scanner scanner = new Scanner(System.in);
            try {
                int n = Integer.parseInt(scanner.nextLine());
                return n;
            } catch (NumberFormatException e) {
                System.out.println("Введено не число !");
            }
        }
        return 0;
    }

    public static void ex() {
        String dan = "a+b+c + d+c";
        System.out.println("Дано: " + dan);
        dan = String.format(dan).replace(" ", "");
        String[] arr = dan.split("\\+");
        Map<String, Integer> list = new HashMap<>();
        String retr = "1";
        for (String i : arr) {
            if (list.containsKey(i)) {
                list.put(i + retr, list.get(i));
                retr = Integer.toString(Integer.parseInt(retr) + 1);
                continue;
            }
            ;
            list.put(i, GetInt(i));
        }
        System.out.println(list);
        Collection<Integer> temp = list.values();
        int summ = 0;
        for (int i : temp
        ) {
            summ += i;
        }
        System.out.println(dan + " = " + summ);
    }
}

