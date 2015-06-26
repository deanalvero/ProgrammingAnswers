#
# PermCheck - Counting Elements - Python
# Check whether array A is a permutation.
# https://codility.com/demo/take-sample-test/perm_check/
#

def solution(A):
	length = len(A)
	B = [False] * (length + 1)
	for i in xrange(length):
		if A[i] > length or B[A[i]]:
			return 0
		B[A[i]] = True
	return 1

def main():
    print solution([4, 1, 3, 2])
    print solution([4, 1, 3])

if __name__ == "__main__":
    main()