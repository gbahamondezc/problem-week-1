import java.util.Map;
import java.util.HashMap;

import java.util.List;
import java.util.ArrayList;

import java.util.Stack;

public class Main {

    private static boolean isBalanced(String input, List<CustomParentheses> parentheses) {
        Map<String, String> map = new HashMap<>();

        // Adding possible parentheses to the map
        for (CustomParentheses par: parentheses) {
            map.put(par.getOpen(), par.getClose());
        }

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            String bracket = Character.toString(input.charAt(i));
            // when the first item its not an open char
            if (i == 0 && map.get(bracket) == null) {
                return false;
            }
            if (map.get(bracket) != null) {
                stack.push(map.get(bracket));
            }
            else if(!stack.isEmpty() && !bracket.equals(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        List<CustomParentheses> parentheses = new ArrayList<>();

        parentheses.add(new CustomParentheses("!", "@"));
        parentheses.add(new CustomParentheses("#", "$"));

        System.out.println(isBalanced("!@!@!!#$#$@@", parentheses));
        System.out.println(isBalanced("##!@$$!@#$!#@$", parentheses));
    }
}
