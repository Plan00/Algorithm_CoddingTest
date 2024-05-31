import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

class Solution
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int test_case = 1; test_case <= 10; test_case++)
        {
            int n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            
            Stack<Integer> stack = new Stack<>();
            StringBuilder result = new StringBuilder();
            
            for(int i = 0; i < n; i++) {
                char c = str.charAt(i);
                if(Character.isLetterOrDigit(c)) {
                    result.append(c);
                } else if(c == '(') {
                    stack.push((int)c);
                } else if(c == ')') {
                    while(!stack.isEmpty() && stack.peek() != '(') {
                        result.append((char)(int)stack.pop());
                    }
                    stack.pop(); // '(' 제거
                } else if(c == '+' || c == '-') {
                    while(!stack.isEmpty() && (stack.peek() == '+' || stack.peek() == '-' || stack.peek() == '*' || stack.peek() == '/')) {
                        result.append((char)(int)stack.pop());
                    }
                    stack.push((int)c);
                } else if(c == '*' || c == '/') {
                    while(!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')) {
                        result.append((char)(int)stack.pop());
                    }
                    stack.push((int)c);
                }
            }
            
            while(!stack.isEmpty()) {
                result.append((char)(int)stack.pop());
            }
            
            // 후위 표기식을 계산
            stack.clear();
            for (int i = 0; i < result.length(); i++) {
                char c = result.charAt(i);
                if (Character.isDigit(c)) {
                    stack.push(c - '0');
                } else {
                    int val1 = stack.pop();
                    int val2 = stack.pop();
                    switch (c) {
                        case '+':
                            stack.push(val2 + val1);
                            break;
                        case '-':
                            stack.push(val2 - val1);
                            break;
                        case '*':
                            stack.push(val2 * val1);
                            break;
                        case '/':
                            stack.push(val2 / val1);
                            break;
                    }
                }
            }
            int res = stack.pop();
            
            bw.write("#" + test_case + " " + res + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
