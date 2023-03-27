package org.example.정렬이분검색과결정알고리즘.LRU캐시카카오변형;

import java.util.Scanner;

class Main {

    public int[] solution(int size, int[] arr) {
        int [] cache = new int[size];
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) pos = i;
            }
            if (pos == -1) {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }

            } else {
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }
    public static void main(String[] args){
        Main main = new Main();
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int [] arr = new int[input2];
        for(int i = 0; i < input2; i++) arr[i] = sc.nextInt();
        for(int x : main.solution(input1, arr))  System.out.print(x + " ");
    }
}
