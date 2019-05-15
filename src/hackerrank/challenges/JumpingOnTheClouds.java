/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.challenges;

/**
 *
 * @author mkarsli
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
 */
public class JumpingOnTheClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int jumpCount = 0;
        int currentState = 0;
        while (true) {
            if (currentState >= c.length - 3) {
                jumpCount++;
                break;
            }
            if (c[currentState + 2] == 0) {
                jumpCount++;
                currentState += 2;
            } else if (c[currentState + 1] == 0) {
                jumpCount++;
                currentState += 1;
            }
        }
        return jumpCount;
    }
}
