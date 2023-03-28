package org.example.프로그래머스.스택큐.같은숫자는싫어;

import java.util.*;

class Main {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int temp = -1;
        for(int n : arr) {
            if(temp != n) list.add(n);
            temp = n;
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(main.solution(arr)));

    }
}
