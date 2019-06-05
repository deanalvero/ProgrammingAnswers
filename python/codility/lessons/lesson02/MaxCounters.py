#
# MaxCounters - Counting Elements - Python
# Calculate the values of counters after applying all alternating operations: increase counter by 1; set value of all counters to current maximum.
# https://codility.com/demo/take-sample-test/max_counters/
#
def solution(N, A):
    B = [0] * N
    count = 0
    last = 0
    
    for i in xrange(len(A)):
        if (A[i] > N):
            last = count
        else:
            B[A[i] - 1] = max(B[A[i] - 1], last) + 1
            count = max(count, B[A[i] - 1])
        
    for i in xrange(len(B)):
        B[i] = max(B[i], last)
    return B

def main():
    print solution(5, [3])
    print solution(5, [3, 4])
    print solution(5, [3, 4, 4])
    print solution(5, [3, 4, 4, 6])
    print solution(5, [3, 4, 4, 6, 1])
    print solution(5, [3, 4, 4, 6, 1, 4])
    print solution(5, [3, 4, 4, 6, 1, 4, 4])

if __name__ == "__main__":
    main()