#
# MissingInteger - Counting Elements - Python
# Find the minimal positive integer not occurring in a given sequence.
# https://codility.com/demo/take-sample-test/missing_integer/
#
def solution(A):
	length = len(A)
	B = [False] * (length + 1)
	for i in xrange(length):
		if A[i] > 0 and A[i] <= length and (not B[A[i] - 1]):
			B[A[i] - 1] = True
	for i in xrange(length + 1):
		if B[i] == False:
			return i + 1
	return i + 1
	
def main():
    print solution([1, 3, 6, 4, 1, 2])
    print solution([1])

if __name__ == "__main__":
    main()