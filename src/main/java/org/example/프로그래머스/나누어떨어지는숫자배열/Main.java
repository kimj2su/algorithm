package org.example.프로그래머스.나누어떨어지는숫자배열;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (j % divisor == 0) {
                list.add(j);
            }
        }
        if (list.size() == 0) list.add(-1);
        int[] ints = list.stream().mapToInt(x -> x).toArray();
        Arrays.sort(ints);
        return ints;
    }
    public static void main(String[] args) {
        Main main = new Main();
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;
        System.out.println(Arrays.toString(main.solution(arr, divisor)));
    }
}
// 다른 사람의 풀이
// 문제가 개편되었습니다. 이로 인해 함수 구성이나 테스트케이스가 변경되어, 과거의 코드는 동작하지 않을 수 있습니다.
// 새로운 함수 구성을 적용하려면 [코드 초기화] 버튼을 누르세요. 단, [코드 초기화] 버튼을 누르면 작성 중인 코드는 사라집니다.

//class Divisible {
//public int[] solution(int[] arr, int divisor) {
//    int[] answer = Arrays.stream(arr).filter(factor -> factor % divisor == 0).toArray();
//    if(answer.length == 0) answer = new int[] {-1};
//    java.util.Arrays.sort(answer);
//    return answer;
//}
//}