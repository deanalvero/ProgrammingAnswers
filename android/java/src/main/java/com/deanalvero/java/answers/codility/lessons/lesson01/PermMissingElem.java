package com.deanalvero.java.answers.codility.lessons.lesson01;

// PermMissingElem - Time Complexity - Java
// Find the missing element in a given permutation.
// https://codility.com/demo/take-sample-test/perm_missing_elem/
//
// Using int instead of long will give you a WRONG ANSWER
// in the Performance test for the following tests:
// 1) large_range (range sequence, length = ~100,000)
// >> got -2147483647 expected 1
// 2) large2 (large test, length = ~100,000)
// >> got -2147473647 expected 10001
//
public class PermMissingElem {
    public int solution(int[] A) {
        long result = getTotal(A.length + 1);
        for (int a: A)
            result -= a;
        return (int) result;
    }

    public long getTotal(long len){
        return (len * (len + 1) / 2);
    }

    public static void main(String[] args){
        PermMissingElem pME = new PermMissingElem();
        System.out.println(pME.solution(new int[]{2, 3, 1 ,5}));
    }
}