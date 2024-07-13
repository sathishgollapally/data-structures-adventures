package com.dsa.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingMain {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
    List<Integer> integers = new ArrayList<>();
    
    for(Integer grade: grades) {
        Integer nextMultiiple = (grade / 5) * 5 + 5;
        if(grade < 40) {
            integers.add(grade);
        } else if (nextMultiiple - grade < 3) {
            integers.add(nextMultiiple);
        } else {
            integers.add(grade);
        }
    }
        return integers;
    }

}

class Grading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> grades = new ArrayList<>();

        for(int i = 0; i < n; i++) {
            grades.add(scanner.nextInt());
        }
        GradingMain.gradingStudents(grades).stream().forEach(grade ->{
            System.out.println(grade);
        });
    }
}
