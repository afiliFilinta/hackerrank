/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerrank.ipk.dict;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author mkarsli
 */
public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

        Hashtable<String, Integer> table = new Hashtable<String, Integer>();
        for (String m : magazine) {
            if (table.containsKey(m)) {
                table.put(m, table.get(m) + 1);
            } else {
                table.put(m, 1);
            }
        }

        for (String n : note) {
            if (!table.containsKey(n)) {
                System.out.println("No");
                return;
            }

            int counter = table.get(n) - 1;
            if (counter == 0) {
                table.remove(n);
            } else {
                table.put(n, counter);
            }
        }
        System.out.println("Yes");
    }
}
