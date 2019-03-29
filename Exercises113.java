/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Exercises113 {
    public static void main(String[] args) {
        StdOut.print("请输入第一个数字：");
        int a = StdIn.readInt();
        StdOut.print("请输入第二个数字：");
        int b = StdIn.readInt();
        StdOut.print("请输入第三个数字：");
        int c = StdIn.readInt();
        if (a ==b && b == c) {
            StdOut.print("equal");
        }
        else {
            StdOut.print("not equal");
        }
    }
}
