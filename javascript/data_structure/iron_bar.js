function solution(ironBar) {
  let answer = 0;
  const stack = [];

  for (let i = 0; i < ironBar.length; i++) {
    const x = ironBar[i];
    if (x === "(") stack.push(x);
    else {
      if (ironBar[i - 1] === "(") {
        stack.pop();
        answer += stack.length;
      } else {
        stack.pop();
        answer++;
      }
    }
  }
  return answer;
}

const ironBar = "()(((()())(())()))(())";
console.log(solution(ironBar));
