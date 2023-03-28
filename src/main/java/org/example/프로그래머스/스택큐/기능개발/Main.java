package org.example.프로그래머스.스택큐.기능개발;

import java.util.ArrayList;
import java.util.List;

class Main {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        for (int progress : progresses) {
            list.add(100 - progress);
        }
        System.out.println("list = " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % speeds[i] == 0) {
                list2.add(list.get(i) / speeds[i]);
            } else {
                list2.add((list.get(i) / speeds[i]) + 1);
            }
        }
        System.out.println("list2 = " + list2);

//        int count = 0;
//        for (int i = 0; i < list2.size() - 1; i++) {
//            Integer first = list2.get(i);
//            System.out.println("first" + i + "= " + first);
//            System.out.println("list2.get(i + 1) = " + list2.get(i + 1));
//            if (first > list2.get(i + 1)) {
//                ++count;
//                System.out.println(count);
//            } else {
//                ++count;
//                System.out.println(count + "더함");
//                list3.add(count);
//                count = 0;
//            }
//            System.out.println("list3 = " + list3);
//            System.out.println();
//        }

        int count = 0;
        for (int i = 0; i < list2.size() - 1; i++) {
            Integer first = list2.get(i);
            System.out.println("first" + i + "= " + first);

            for (int j = 1; j < list2.size() - 1; j++) {
                System.out.println("list2= " + list2.get(j));
            }
        }


        System.out.println("count = " + count);

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[] progresses = {93,30,55};
        int[] speeds = {1,30,5};
        main.solution(progresses, speeds);
    }
}
