package com.example.javafx_ui_controls_and_multimedia.ch20;

import java.util.Stack;

public class EvaluateExpression {
    public static void main(String[] args) {
        //check number of arguments passed
        if (args.length != 1){
            System.out.println("Usage: java EvaluateExpression \"expression\"");
            System.exit(1);
        }

        try {
            System.out.println(evaluateExpression(args[0]));
        }
        catch (Exception ex) {
            System.out.println("Wrong expression : " + args[0]);
        }
    }

    public static int evaluateExpression(String expression){
        //Stack for storing operands
        Stack<Integer> operandStack = new Stack<>();

        //Stack for storing operators
        Stack<Character> operatorStack = new Stack<>();

        //Insert blanks around (, ), _, -< /, amd *
        expression = insertBlanks(expression);

        //Extract operands and operators
        String[] tokens = expression.split(" ");

        //phase 1 : scan tokens
        for (String token : tokens) {
            if (token.length() == 0) //blank space
                continue;
            else if (token.charAt(0) == '+' || token.charAt(0) == '-') {
                //process all +, -, /, * in the top of the operator stack
                while (!operatorStack.isEmpty() &&
                        (operatorStack.peek() == '+' ||
                        operatorStack.peek() == '-' ||
                        operatorStack.peek() == '*' ||
                        operatorStack.peek() == '/')){
                    processAnOperator(operandStack, operatorStack);
                }

                //push the + or - operator onto the operator stack
                operatorStack.push(token.charAt(0));
            }
            else if (token.charAt(0) == '*' || token.charAt(0) == '/'){
                //process all *, / in the top of the operator stack
                while (!operatorStack.isEmpty() && (
                        operatorStack.peek() == '*' || operatorStack.peek() == '/')){
                    processAnOperator(operandStack, operatorStack);
                }

                operatorStack.push(token.charAt(0));
            }
            else if(token.trim().charAt(0) == '('){
                operatorStack.push('('); // push '(' to stack
            }

            else if (token.trim().charAt(0) == ')') {
                //process all the operators in the stack until seeing '('
                while (operatorStack.peek() != '(') {
                    processAnOperator(operandStack, operatorStack);
                }

                operatorStack.pop();
            }
            else { //an operand scanned
                //push an operand to the stack
                operandStack.push(new Integer(token));
            }
        }

        //Phase 2 : process all the remaining operators in the stack
        while (!operatorStack.isEmpty()) {
            processAnOperator(operandStack, operatorStack);
        }
        //return result
        return operandStack.pop();

    }

    //Process one operator : take an operator from operatorStack and apply it on the operands in the operandStack
    public static void processAnOperator(Stack<Integer> operandStack, Stack<Character> operatorStack){
        char op = operatorStack.pop();
        int op1 = operatorStack.pop();
        int op2 = operandStack.pop();
        if (op == '+') operandStack.push(op2 + op1);
        else if (op == '-') operandStack.push(op2 - op1);
        else if (op == '*') operandStack.push(op2 * op1);
        else if (op == '/') operandStack.push(op2 / op1);
    }

    public static String insertBlanks(String s){
        String result = "";

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == ')' || s.charAt(i) == '+' || s.charAt(i) == '-' ||
            s.charAt(i) == '*' || s.charAt(i) == '/') result += " " + s.charAt(i) + " ";
            else result += s.charAt(i);
        }

        return result;
    }
}
