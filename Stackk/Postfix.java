package Stackk;

import java.util.Stack;

public class Postfix {
    public static int evaluate(String[] tokens) {
        int size = tokens.length;
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i<size;i++){
            if(!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")){
                s.push(Integer.valueOf(tokens[i]));
            }else if(tokens[i].equals("+")){
                int v1 = s.pop();
                int v2 = s.pop();
                s.push(v1+v2);
            }else if(tokens[i].equals("-")){
                   int v1 = s.pop();
                int v2 = s.pop();
                s.push(v2-v1);
            }else if(tokens[i].equals("*")){
                   int v1 = s.pop();
                int v2 = s.pop();
                s.push(v1*v2);
            }else if(tokens[i].equals("/")){
                   int v1 = s.pop();
                int v2 = s.pop();
                s.push(v2/v1);
            }
        }
        return s.pop();
    }
    public static void main(String[] args) {
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(evaluate(tokens)); // Output: 9
    }
}


// ✅ Infix Expression

// Definition: An infix expression is one in which the operator is written between two operands.
// Example:  A + B

// ✅ Prefix Expression

// Definition: A prefix expression is one in which the operator is written before the operands.
// Example: + A B

// ✅ Postfix Expression

// Definition: A postfix expression is one in which the operator is written after the operands.
// Example: A B +

// ✅ Operator Precedence

// Definition: Precedence decides which operator is evaluated first in an expression.
// Example: 8 + 3 * 2 = 14

// | Priority    | Operators     |
// | ----------- | ------------- |
// | 1           | `()`          |
// | 2           | `^` (power)   |
// | 3           | `*`, `/`, `%` |
// | 4           | `+`, `-`      |


// ✅ Associativity

// Definition: Associativity decides the direction of evaluation when operators have the same precedence.
// Example: 10 - 5 - 2 = 3
//          2 ^ (3 ^ 2)
//          = 2 ^ 9
//          = 512


// | Operator        | Associativity     |
// | --------------- | ----------------- |
// | `+  -  *  /  %` | **Left to Right** |
// | `^`             | **Right to Left** |



// ✅ Brackets Rule

// Definition: Brackets always override precedence and associativity.
// Example: (8 + 3) * 2 = 22

// ✅ Operand Order

// Definition: Operand order is important in prefix and postfix expressions, especially for - and /.
// Example: 8 2 - = 6

