import java.util.Stack;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println(isValid("[()]"));
    }
    private static boolean isValid(String s) {
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<Character>();
        if(array[0] == ')' || array[0] == ']' || array[0] == '}' || array.length <= 1 || array.length%2 != 0) {
            return false;
        }
        for(var i = 0; i<array.length; i++) {
            if(array[i] == '(' || array[i] == '{' || array[i] == '[') {
                stack.push(array[i]);
            }
            else {
                if(s.charAt(i) == ')' && stack.pop() != '(') {
                    return false;
                }
                if(s.charAt(i) == '}' && stack.pop() != '{') {
                    return false;
                }
                if(s.charAt(i) == ']' && stack.pop() != '[') {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    
    }
    
}