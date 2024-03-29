package org.example.프로그래머스.정렬.가장큰수;

import java.util.Arrays;
import java.util.Comparator;

class Main {
    public String solution(int[] numbers) {
        String answer = "";
        //문자열 리턴을 해줄 스트링배열 생성
        String[] str = new String[numbers.length];

        //int배열 String배열로 변환
        for(int i = 0; i < numbers.length; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        //내림차순 정렬
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                System.out.println("a = " + a);
                System.out.println("b = " + b);
                System.out.println("b+a = " + b + a);
                System.out.println("a+b = " + a+b);
                System.out.println("(b+a).compareTo(a+b): "+ (b+a).compareTo(a+b));
                return (b+a).compareTo(a+b);
                //오름차순 정렬 (o1+o2).compareTo(o1+o2);
            }
        });

        //0값이 중복일경우 ex){0,0,0}
        //답이 000이 나오면 안되므로 첫번째값이 0이면 0을 리턴
        if (str[0].equals("0")) return "0";

        //0이 아니면 문자열을 더해준다.
        for(String s: str) answer += s;

        return answer;
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(main.solution(arr));
    }
}
