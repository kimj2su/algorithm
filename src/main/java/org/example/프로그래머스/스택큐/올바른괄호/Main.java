package org.example.프로그래머스.스택큐.올바른괄호;

import java.util.Stack;

class Main {
    boolean solution(String s) {
        boolean answer = true;
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (")".equals(s.substring(0, 1))) {
                answer = false;
                break;
            }
            String substring = s.substring(i, i + 1);
            if (!stack.empty() && ")".equals(substring)) {
                if (stack.peek().equals("(")) {
                    System.out.println("before stack : " + stack);
                    stack.pop();
                    System.out.println("after stack : " + stack);
                    answer = true;
                } else {
                    stack.push(substring);
                    System.out.println("else stack : " + stack);
                    answer = false;
                }
            } else {
                stack.push(substring);
                System.out.println("else stack : " + stack);
                answer = false;
            }
        }

//        if (stack.size() != 0) {
//            answer = false;
//        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.solution("()))))))"));
    }

}
