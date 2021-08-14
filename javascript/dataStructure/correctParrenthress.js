function solution(input) {
  const arr = input.split("");
  let stack = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === "(") stack.push(arr[i]);
    else {
      if (stack.length === 0) return "NO";
      stack.pop();
    }
  }
  if (stack.length) return "NO";
  else return "YES";
}

const str = "(()(()))(()";
console.log(solution(str));
console.log("111");
