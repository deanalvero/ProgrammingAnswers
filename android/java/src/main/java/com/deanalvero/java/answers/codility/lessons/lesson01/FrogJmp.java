package com.deanalvero.java.answers.codility.lessons.lesson01;

/**
 * Created by Dean on 6/25/2015.
 *
 * FrogJmp - Time Complexity - Java
 * Count minimal number of jumps from position X to Y.
 * https://codility.com/demo/take-sample-test/frog_jmp/
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int diff = Y - X;
        int result = diff / D;
        if (diff % D != 0){
            result++;
        }
        return result;
    }

    public static void main(String[] args){
        FrogJmp fJ = new FrogJmp();
        System.out.println(fJ.solution(10, 85, 30));
    }
}
