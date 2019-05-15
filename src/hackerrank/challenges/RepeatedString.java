/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.challenges;

/**
 *
 * @author mkarsli
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen
 */
public class RepeatedString {
    // Complete the repeatedString function below.

    static long repeatedString(String s, long n) {

        int length = s.length();
        long result = -1;
        if (length < n) {
            int aCount = findLetter(s, 'a');
            long mult = n / length;
            result = aCount * mult;

            int missing = (int) (n % length);
            if (missing != 0) {
                int miss = findLetter(s.substring(0, missing), 'a');
                result += miss;
            }
        } else {
            result = findLetter(s.substring(0, (int) n), 'a');
        }
        return result;
    }

    static int findLetter(String s, char chr) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == chr) {
                count++;
            }
        }
        return count;
    }
}
