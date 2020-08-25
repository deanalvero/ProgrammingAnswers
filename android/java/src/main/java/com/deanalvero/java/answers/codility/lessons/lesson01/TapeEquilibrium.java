package com.deanalvero.java.answers.codility.lessons.lesson01;

/**
 * Created by Dean on 6/24/2015.
 *
 * TapeEquilibrium - Time Complexity - Java
 * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
 * https://codility.com/demo/take-sample-test/tape_equilibrium/
 *
 */
public class TapeEquilibrium {

    public int solution(int[] A) {
        int left = 0, right, result = Integer.MAX_VALUE;
        int sum = getSum(A);
        right = sum;

        for (int i = 0; i < A.length - 1; i++){
            left += A[i];
            right -= A[i];
            result = Math.min(result, Math.abs(left - right));
        }
        return result;
    }

    public int getSum(int[] A){
        int result = 0;
        for (int a: A)
            result += a;
        return result;
    }

    public static void main(String[] args){
        TapeEquilibrium tE = new TapeEquilibrium();
        System.out.println(tE.solution(new int[]{3, 1, 2, 4, 3}));
    }
}
