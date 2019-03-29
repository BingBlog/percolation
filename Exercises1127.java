/* *****************************************************************************
 *  Name:
 *  Date:
 *  Description:
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;

public class Exercises1127 {

    public static double binomial(int N, int k) {
        double p = 0.5;
        if ((N == 0) || (k < 0)) return 1.0;
        return (1.0 - p) * binomial(N-1, k) + p * binomial(N-1, k-1);
    }

    public static void main(String[] args) {
        StdOut.println("aa");
        StdOut.println(binomial(100, 50));
    }
}
