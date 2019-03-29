/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exercises1215 {
    public static void main(String[] args) {
        Exercises1215.readIns("input1.txt");
    }

    public static int[] readIns(String name) {
        In in = new In(name);
        String input = in.readAll();

        StdOut.println(input);

        String[] words = input.split("\\s+");
        StdOut.println(Arrays.toString(words));

        int[] ints = new int[words.length];

        for(int i = 0; i < words.length; i++) {
            StdOut.println(words[i]);
            ints[i] = Integer.parseInt(words[i]);
        }

        StdOut.println(Arrays.toString(ints));
        return ints;

    }
}
