//��������� n-�� ������������ �����(����� ����� �� 1�� n)
//��������� n!(������������ ����� �� 1 �� n)
//������� ��� ������� ����� �� 1�� 1000(������� �����-��� ����� ������� ������� ������ �� ���� � �� ������� ��� �������.����� ����� ������� �� ������� ����������� ��������%,�������� 10%3����� ����� �������)
//����������� ������� �����������("������� ������ �����"..."������� ������ �����"..."������� ��������, ������� ���� ��������� � ����� �������"..."�����: ...")
//*+������ ��������� ���� q+w=e,q,w,e>=0.��������� ����� ����� ���� �������� ������ �������,�������� 2?+?5=69.��������� ������������ ��������� �� ������� ���������.���������� ���� �� ���� ������� ��� ��������,��� ��� ���.


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
        System.out.println("������� ����� n");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static int ex2(int n) {
        if (n == 0) return 1;
        return n * ex2(n - 1);
    }

    public static void ex3(int n) {
        String result = "";
        int temp = 0;
        for (int i = 2; i < n; i++) {
            temp = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    temp = 0;
                    break;
                }
            }
            if (temp == 1) {
                result += i + ", ";
            }
        }
        System.out.println(result);
    }

    public static void ex4() {
        System.out.print("������� ������ n: ");
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        System.out.print("������� ������ n: ");
        int n2 = scanner.nextInt();
        System.out.print("\033[H\033[J");
        System.out.println("������ ����� = "+n1);
        System.out.println("������ ����� = "+n2);
        System.out.println("1: �����");
        System.out.println("2: ���������");
        System.out.println("3: �������");
        System.out.print("�������� ��������:");
        int mode = scanner.nextInt();
        if (mode == 1) System.out.printf("%d+%d=%d", n1, n2, n1 + n2);
        if (mode == 2) System.out.printf("%dx%d=%d", n1, n2, n1 * n2);
        if (mode == 3) System.out.printf("%d:%d=%d", n1, n2, n1 / n2);
    }

    public static void ex5(String q, String w, String e) {
        String[] array = new String[]{q, w, e};
        for (String j : array) {
            String[] temp = j.split("");
            System.out.println(temp[0] == "?"); //WTF false ????
        }


    }
}

