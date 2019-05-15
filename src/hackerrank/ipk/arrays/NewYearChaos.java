/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.ipk.arrays;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 *
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 *
 * @author mkarsli
 */
public class NewYearChaos {

    private static final Scanner scanner = new Scanner(System.in);

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
        int bribe = 0;
        boolean chaotic = false;
        int n = q.length;
        for (int i = 0; i < n; i++) {
            if (q[i] - (i + 1) > 2) {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, q[i] - 1 - 1); j < i; j++) {
                if (q[j] > q[i]) {
                    bribe++;
                }
            }
        }
        if (chaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribe);
        }
    }
}
