/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.challenges;

/**
 *
 * @author mkarsli
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SockMerchant {
    // Complete the sockMerchant function below.

    static int sockMerchant(int n, int[] ar) {

        int result = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] == ar[j]) {
                    int temp = ar[i + 1];
                    ar[i + 1] = ar[j];
                    ar[j] = temp;
                    i++;
                    result++;
                    System.out.println("i: " + i + " j:" + j);
                    break;
                }
            }
        }
        return result;
    }
}
