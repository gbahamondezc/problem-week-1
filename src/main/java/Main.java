import java.util.Map;
import java.util.HashMap;

import java.util.List;
import java.util.ArrayList;

import java.util.Stack;

public class Main {

    static boolean areBalanced(String input) {

        Map<String, String> map = new HashMap<>();
        List<CustomParentheses> parentheses = new ArrayList<>();

        /*
        parentheses.add(new CustomParentheses("[", "]"));
        parentheses.add(new CustomParentheses("{", "}"));
        parentheses.add(new CustomParentheses("(", ")"));
        */
        parentheses.add(new CustomParentheses("!", "@"));
        parentheses.add(new CustomParentheses("#", "$"));

        for (CustomParentheses par: parentheses)
            map.put(par.getOpen(), par.getClose());

        List<String> opens = new ArrayList<>(map.keySet());
        List<String> closes = new ArrayList<>(map.values());

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            String bracket = Character.toString(input.charAt(i));
            if (i == 0 && closes.contains(bracket)) {
                return false;
            }
            if (opens.contains(bracket)) {
                stack.push(map.get(bracket));
            }
            else if(!stack.isEmpty() && !bracket.equals(stack.pop())) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // System.out.println(areBalanced("[()]"));
        System.out.println(areBalanced("!@!@!!#$#$@@"));
        System.out.println(areBalanced("##!@$$!@#$!#@$"));
    }
}
