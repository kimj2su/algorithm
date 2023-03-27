package org.example.프로그래머스.해시.폰켓몬;

/*
1. N마리의 폰켓몬중 N/2 마리를 가져도 된다.
2. 같은 종류의 포켓몬은 같은 번호를 가지고 있다.
3. 실행 풀이 index 와 set중 작은 수를 리턴
 */

import java.util.HashSet;
import java.util.Set;

class Main {
    public int solution(int[] nums) {
        int answer = 0;
        int index = nums.length / 2;
        System.out.println("index = " + index);
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        answer = Math.min(set.size(), index);

        return answer;
    }
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        Main main = new Main();
        System.out.println(main.solution(nums));
    }
}
//다른 사람의 풀이
//import java.util.Arrays;
//import java.util.stream.Collectors;
//
//class Solution {
//    public int solution(int[] nums) {
//        return Arrays.stream(nums)
//                .boxed()
//                .collect(Collectors.collectingAndThen(Collectors.toSet(),
//                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
//    }
//}
