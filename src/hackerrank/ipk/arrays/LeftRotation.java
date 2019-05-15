/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.ipk.arrays;

/**
 *
 * @author mkarsli
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class LeftRotation {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

        int[] result = new int[a.length];
        int rotateCount = d;
        if(d>a.length){
            rotateCount = a.length % d;
        }
        
        for (int i = 0; i < a.length; i++) {
            int index = i - rotateCount;
            if (index < 0) {
                index += a.length;
            }
            System.out.println(index);
            result[index] = a[i];
        }
        return result;
    }
    
    
}
