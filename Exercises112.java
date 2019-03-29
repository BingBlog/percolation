/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;


public class Exercises112 {
    static GetType typeGetter = new GetType();

    public static void main(String[] args) {
        StdOut.print((1 + 2.236) / 2);
        StdOut.print('\n');
        typeGetter.get((1 + 2.236) / 2);
    }
}

