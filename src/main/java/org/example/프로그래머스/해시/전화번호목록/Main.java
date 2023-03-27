package org.example.프로그래머스.해시.전화번호목록;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Main {
    public boolean solution(String[] phoneBook) {
        // 1. HashMap을 선언한다.
        Map<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phoneBook.length; i++)
            map.put(phoneBook[i], i);

        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phoneBook.length; i++)
            for (int j = 0; j < phoneBook[i].length(); j++)
                if (map.containsKey(phoneBook[i].substring(0, j)))
                    return false;

        return true;
    }
    public static void main(String[] args) {
        Main main = new Main();

        String[] strings = {"119", "97674223", "1195524421"};
        System.out.println(main.solution(strings));
    }
}
//다른 사람의 풀이
//class Solution {
//    public boolean solution(String[] phoneBook) {
//        for(int i=0; i<phoneBook.length-1; i++) {
//            for(int j=i+1; j<phoneBook.length; j++) {
//                if(phoneBook[i].startsWith(phoneBook[j])) {return false;}
//                if(phoneBook[j].startsWith(phoneBook[i])) {return false;}
//            }
//        }
//        return true;
//    }
//}