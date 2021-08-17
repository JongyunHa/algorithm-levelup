function solution(problem) {
  const stack = [];
  for (x of problem) {
    if (Number.isInteger(+x)) stack.push(+x);
    else {
      const rt = stack.pop();
      const lt = stack.pop();
      switch (x) {
        case "+":
          stack.push(lt + rt);
          break;
        case "-":
          stack.push(lt - rt);
          break;
        case "*":
          stack.push(lt * rt);
          break;
        case "/":
          stack.push(lt / rt);
          break;
        default:
          break;
      }
    }
  }

  return stack[0];
}

const problem = "352+*9-";
console.log(solution(problem));
