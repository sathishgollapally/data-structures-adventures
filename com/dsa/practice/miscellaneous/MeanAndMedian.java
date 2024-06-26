package com.dsa.practice.miscellaneous;

import java.io.*;
import java.util.*;

public class MeanAndMedian {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Main. */

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        int sum = 0;
        for(int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            sum += A[i];
        }
        float mean = sum/N;


        double median;
        if(N %2 == 1) {
            median = A[N / 2];
        } else {
            median = (A[N / 2 - 1] + A[N / 2 ]) / 2.0;
        }

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int number: A) {
            frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
        }

        int mode = A[0];

        int maxFrequency = frequencyMap.get(mode);

        for(int num: A) {
            int frequency = frequencyMap.get(num);
            if(frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }

        System.out.printf("%.2f %.2f %d\n", mean, median, mode);

    }
}