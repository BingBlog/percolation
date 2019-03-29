
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercises1304 {

    public static void main(String[] args) {
        String in = StdIn.readString();
        Stack<String> stack = new Stack<String>();
        String top = "";
        for (int i = 0; i < in.length(); i++) {
            String s = "" + in.charAt(i);
            if (stack.isEmpty()) {
                stack.push(s);
                top = s;
            }
            else {
                top = stack.pop();
                if (s.equals("}")) {
                    if (!top.equals("{")) {
                        stack.push(top);
                        stack.push(s);
                        top = s;
                    }
                    else {
                        if (!stack.isEmpty()) {
                            top = stack.pop();
                            stack.push(top);
                        }
                        else {
                            top = "";
                        }
                    }
                }
                else if (s.equals("]")) {
                    if (!top.equals("[")) {
                        stack.push(top);
                        stack.push(s);
                        top = s;
                    }
                    else {
                        if (!stack.isEmpty()) {
                            top = stack.pop();
                            stack.push(top);
                        }
                        else {
                            top = "";
                        }
                    }
                }
                else if (s.equals(")")) {
                    if (!top.equals("(")) {
                        stack.push(top);
                        stack.push(s);
                        top = s;
                    }
                    else {
                        if (!stack.isEmpty()) {
                            top = stack.pop();
                            stack.push(top);
                        }
                        else {
                            top = "";
                        }
                    }
                }
                else {
                    stack.push(top);
                    stack.push(s);
                    top = s;
                }
            }
            StdOut.println(stack);
            StdOut.println(top);
            StdOut.println("==========");
        }


        StdOut.println(stack.isEmpty() ? "match" : "not match");
    }
}
