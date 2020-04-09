package Chapter8.Exercise;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args)  {
        int[] students = new int[8];
        check(students);

        for (int i = 0; i < students.length; i++) {
            Arrays.sort(students);
            System.out.println("Student " + i + "'s correct count is " + students[i]);
        }


//            for (int k = i + 1; k < students.length; k++) {
//                if (max < students[k]) {
//                    max = students[k];
//                    maxIndex = k;
//                }
//            }
//            if (maxIndex != i) {
//                students[maxIndex] = students[i];
//                students[i] = max;
//            }
    }

    public static void check(int[] students) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

        char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j]) {
                    correctCount++;
                }
            }
            students[i] = correctCount;
        }
    }
}
