#
# PermMissingElem - Time Complexity - Python
# Find the missing element in a given permutation.
# https://codility.com/demo/take-sample-test/perm_missing_elem/
#

def solution(A):
    return getTotal(len(A) + 1) - sum(A)

def getTotal(pLen):
    return (pLen * (pLen + 1) / 2)

def main():
    print solution([2, 3, 1, 5])

if __name__ == "__main__":
    main()