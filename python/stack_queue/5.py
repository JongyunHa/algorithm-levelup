from collections import deque


def solution(n: int, k: int) -> int:
    princes: deque = deque(map(int, range(1, n + 1)))
    while len(princes) > 1:
        for _ in range(k - 1):
            pop_prince = princes.popleft()
            princes.append(pop_prince)
        princes.popleft()

    return princes[0]


if __name__ == "__main__":
    n, k = map(int, input().split())
    print(solution(n, k))
