import sys
#
# TapeEquilibrium - Time Complexity - Python
# Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
# https://codility.com/demo/take-sample-test/tape_equilibrium/
#
def solution(A):
	left = 0
	right = sum(A)
	result = sys.maxint
    
	for i in range(0, len(A) - 1):
		left += A[i]
		right -= A[i]
		result = min(result, abs(left - right))
	return result

def main():
	print solution([3, 1, 2, 4, 3]);
	
if __name__ == "__main__":
	main()