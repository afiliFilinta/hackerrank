/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.ipk.dict;

/**
 *
 * @author mkarsli
 */
public class TwoStrings {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {

        int[] asci = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            asci[(int) s1.charAt(i)]++;
        }

        for (int j = 0; j < s2.length(); j++) {
            if (asci[s2.charAt(j)] != 0) {
                return "YES";
            }
        }

        return "NO";
    }
}
