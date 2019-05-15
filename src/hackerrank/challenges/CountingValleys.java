/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.challenges;

/**
 *
 * @author mkarsli
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValleys {
    // Complete the countingValleys function below.

    static int countingValleys(int n, String s) {

        int seaLevel = 0;
        int result = 0;
        for (int i = 0; i < n; i++) {
            char chr = s.charAt(i);
            if (chr == 'U') {
                seaLevel++;
                if (seaLevel == 0) {
                    result++;
                }
            } else if (chr == 'D') {
                seaLevel--;
            }
        }
        return result;
    }
}
