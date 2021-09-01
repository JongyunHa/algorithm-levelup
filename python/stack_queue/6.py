from collections import deque

"""
Inflearn section5. data structure (stack queue) 응급실
"""


def solution(m: int, patients: deque) -> int:
    target: int = patients[m]
    count: int = 1
    while (current_max := max(patients)) != target:
        p = patients.popleft()
        if current_max != p:
            patients.append(p)
        else:
            count += 1
    return count


if __name__ == "__main__":
    k, m = map(int, input().split())
    patients = deque(map(int, input().split()))
    print(solution(m, patients))
