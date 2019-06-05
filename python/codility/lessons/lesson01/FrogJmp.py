#
# FrogJmp - Time Complexity - Python
# Count minimal number of jumps from position X to Y.
# https://codility.com/demo/take-sample-test/frog_jmp/
#

def solution(X, Y, D):
    diff = Y - X
    result = diff / D
    if diff % D != 0:
        result = result + 1
    return result;

def main():
    print solution(10, 85, 30)

if __name__ == "__main__":
    main()