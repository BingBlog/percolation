/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercises1304Second {
    public static void main(String[] args) {
        String in = StdIn.readString();
        Boolean is = Exercises1304Second.isParentness(in);
        StdOut.println(is);
    }

    public static Boolean isParentness(String in) {
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < in.length(); i++) {
            String s = Character.toString(in.charAt(i));
            if (s.equals("}") || s.equals("]") || s.equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                }
                String top = stack.pop();
                if (top.equals("{") && !s.equals("}")
                || top.equals("[") && !s.equals("]")
                || top.equals("(") && !s.equals(")")) {
                    return false;
                }
            }
            else {
                stack.push(s);
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
}
