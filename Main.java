

import java.util.*;

public class Main {
    // ����� ��� ������������ ������ ����� �����
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            lst.add(i);
        }

        Main testObject = new Main();

        System.out.println(testObject.getAverage(lst));
    }

    //     ����� ������� �� ���� ������ �����
    public List<Integer> removeNegativeValue(List<Integer> list) {
        List<Integer> resultList = new ArrayList<>();
        for (int i : list) if (i % 2 != 0) resultList.add(i);
        return resultList;
    }

    //
    // ����� ����������� ��������
    public Integer getMin(List<Integer> list) {
        int min = list.get(0);
        for (int i : list) if (i < min) min = i;
        return min;
    }

    //
//    // ����� ������������ ��������
    public Integer getMax(List<Integer> list) {
        int max = list.get(0);
        for (int i : list) if (i > max) max = i;
        return max;
    }
    //
//    // ����� ������� ��������
    public Integer getAverage(List<Integer> list) {
        int avg = list.get(0);
        for (int i : list) avg += i;
        System.out.println(avg);
        System.out.println(list.size());
        avg /= list.size();
        return avg;
    }

}