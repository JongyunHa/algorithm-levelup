function solution(str) {
  const stack = [];
  for (x of str) {
    if (x === ")") {
      while (stack.pop() !== "(");
    } else stack.push(x);
  }

  return stack.join("");
}

const str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
console.log(solution(str));
