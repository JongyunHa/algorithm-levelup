function solution(board, moves) {
  let answer = 0;
  const stack = [];

  moves.forEach((pos) => {
    for (let i = 0; i < board.length; i++) {
      const target = board[i][pos - 1];
      if (target) {
        board[i][pos - 1] = 0;
        if (stack[stack.length - 1] === target) {
          stack.pop();
          answer += 2;
        } else stack.push(target);
        break;
      }
    }
  });

  return answer;
}

const board = [
  [0, 0, 0, 0, 0],
  [0, 0, 1, 0, 3],
  [0, 2, 5, 0, 1],
  [4, 2, 4, 4, 2],
  [3, 5, 1, 3, 1],
];

const moves = [1, 5, 3, 5, 1, 2, 1, 4];
console.log(solution(board, moves));
