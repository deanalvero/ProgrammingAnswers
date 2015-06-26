#
# FrogRiverOne - Counting Elements - Python
# Find the earliest time when a frog can jump to the other side of a river.
# https://codility.com/demo/take-sample-test/frog_river_one/
#

def solution(X, A):
	B = [-1] * (X + 1)
	count = 0
	for i in xrange(len(A)):
		if B[A[i]] == -1:
			B[A[i]] = i
			count += 1
			if count == X:
				return i
	return -1

def main():
    print solution(5, [1, 3, 1, 4, 2, 3, 5, 4])

if __name__ == "__main__":
    main()