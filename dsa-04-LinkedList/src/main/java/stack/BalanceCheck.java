package stack;

public class BalanceCheck {
    public static void main(String[] args) {
        String expr = "(({}))";
        boolean isBalanced = balanceCheck( expr);
        System.out.println("Is balanced " + isBalanced);
        boolean isBalanced2 = balanceCheck2(expr);
        System.out.println("Is balanced2 " + isBalanced2);


    }
    public static boolean balanceCheck2(String expr){
        // iterating over expression
        MyStack<Character> myStack = new MyStack<>();
        // iterating over expr
        for(int i = 0; i<expr.length(); i ++){
            Character ch = expr.charAt(i);
            // filter non player chars
            if(ch != '(' && ch != '[' && ch != '{' && ch != ')' && ch != '}' && ch != ']') continue;
            // if it is the symbol to be processed
            //if opening symbol push it to the stack
            if(ch == '(' || ch == '{' || ch=='['){
                myStack.push(ch);
                continue;
            }
            // at this point this is a closing symbol
            //stack shouldn't be empty
            if(myStack.isEmpty()) return false;
            switch (ch){
                case ')':
                    if(myStack.pop() != '(') return false;
                    break;
                case ']':
                    if(myStack.pop() != '[') return false;
                    break;
                case '}':
                    if(myStack.pop() != '{') return false;
                    break;
            }
        }
        return myStack.isEmpty();
    }


    public static boolean balanceCheck(String expr) {
        //create a stack to hold the open brackets
        MyStack<Character> myStack = new MyStack<>();

        // Loop through each character in the expression
        for(char ch : expr.toCharArray()){
            // push opening brackets onto the stack
        if(ch == '(' || ch=='{' || ch == '['){
            myStack.push(ch);
        }
        // If a closing bracket is found, check if it matches the last opening bracket
            else if(ch==')' || ch == '}' || ch ==']'){
                if(myStack.isEmpty()){
                    return false;// no matching opening brackets
                }
                char last = myStack.pop();
                if(!isMatchingPair(last,ch)){
                    return false;// mismatched pair
                }
            }
        }
        return myStack.isEmpty();

    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}')||
                (open == '[' && close == ']');
    }
}