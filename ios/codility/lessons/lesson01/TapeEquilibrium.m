#import <Foundation/Foundation.h>
//
// TapeEquilibrium - Time Complexity - Objective-C
// Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
// https://codility.com/demo/take-sample-test/tape_equilibrium/
//
int solution(NSMutableArray *A);
int getSum(NSMutableArray *A);

int solution(NSMutableArray *A) {
	int right = getSum(A), left = 0, result = INT_MAX;
    for (int i = 0; i < [A count] - 1; i++){
        NSInteger item = [[A objectAtIndex: i] integerValue];
        left += item;
        right -= item;
        result = MIN(result, ABS(left - right));
    }
    return result;
}

int getSum(NSMutableArray *A){
    int result = 0;
    for (id a in A){
        result += [a integerValue];
    }
    return result;
}

int main(int argc, const char * argv[]) {
	@autoreleasepool {
		NSLog(@"result = %d", solution([NSMutableArray arrayWithObjects: @3, @1, @2, @4, @3, nil]));
	}
	return 0;
}