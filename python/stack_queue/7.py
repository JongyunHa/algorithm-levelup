from collections import deque

need: deque = deque(input())
n: int = int(input())
for i in range(n):
    plan: str = input()
    dq: deque = deque(need)

    for x in plan:
        if x in dq:
            if x != dq.popleft():
                print(f"{i + 1} NO")
                break
    else:
        if not dq:
            print(f"#{i + 1} YES")
        else:
            print(f"#{i + 1} NO")
