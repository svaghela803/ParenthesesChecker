import java.util.Stack;

public class ParenthesesChecker {


//    Passes for empty string test
    boolean checkParentheses(String String){
        return String.isEmpty();
    }

    static boolean ispar(String x){
    Stack<Character> stacksOfBrackets = new Stack<>();
    for (int i =0; i < x.length(); i++){
        if (x.charAt(i) == '('){
            stacksOfBrackets.push(x.charAt(i));
        } else if (x.charAt(i) == ')'){

           if(stacksOfBrackets.size() == 0)
               return false;
           else if(stacksOfBrackets.peek() != '(') {
               return false;
           } else {
               stacksOfBrackets.pop();
           }

     }
    }
    if(stacksOfBrackets.size() == 0)
        return true;
    else
        return false;

    }

}



