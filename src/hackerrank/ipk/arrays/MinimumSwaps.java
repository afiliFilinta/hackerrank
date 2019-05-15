/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.ipk.arrays;

/**
 *
 * @author mkarsli
 */
public class MinimumSwaps {
    // Complete the minimumSwaps function below.

    static int minimumSwaps(int[] arr) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {
                continue;
            } else {
                int index = arr[i] - 1;
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                count++;
                if (arr[i] != i + 1) {
                    i=0;
                }
            }
        }
        return count;
    }
}
