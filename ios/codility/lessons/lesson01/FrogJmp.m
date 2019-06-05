#import <Foundation/Foundation.h>
//
// FrogJmp - Time Complexity - Objective-C
// Count minimal number of jumps from position X to Y.
// https://codility.com/demo/take-sample-test/frog_jmp/
//
int solution(int X, int Y, int D);
int getSum(NSMutableArray *A);

int solution(int X, int Y, int D) {
	int diff = Y - X;
	int result = diff / D;
	if (diff % D != 0){
		result++;
	}
	return result;
}

int main(int argc, const char * argv[]) {
	@autoreleasepool {
		NSLog(@"result = %d", solution(10, 85, 30));
	}
	return 0;
}