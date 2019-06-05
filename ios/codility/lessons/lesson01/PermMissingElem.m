#import <Foundation/Foundation.h>
//
// PermMissingElem - Time Complexity - Objective-C
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

int solution(NSMutableArray *A);
long getTotal(long len);

int solution(NSMutableArray *A) {
    long len = [A count];
    long result = getTotal(len + 1);
    for (int i = 0; i < len; i++){
        result -= [A[i] longValue];
    }
    return (int) result;
}

long getTotal(long len){
    return (len * (len + 1) / 2);
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        NSLog(@"result = %d", solution([NSMutableArray arrayWithObjects: @2, @3, @1, @5, nil]));
    }
    return 0;
}