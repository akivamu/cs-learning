package com.akivamu.cs.dp.lis;

import java.util.ArrayList;

public class V1 extends Solution {
    @Override
    public int solve() {
        // Init LIS
        for (int i = 0; i < n; i++) {
            lisEndWith[i] = 1;
        }

        // lisEndWith[i] is longest seq length ONLY FOR seqs that ended by arr[i]
        // lisEndWith[i] is NOT solution for seqs that NOT ENDED by arr[i]
        for (int i = 1; i < n; i++) {
            /*
             1. Find all elements less than arr[i]
             2. Among them, find element at k that has max lisEndWith[k]
             3. lisEndWith[i] = lisEndWith[k] + 1
             */

            // 1. Find all elements less than arr[i]
            ArrayList<Integer> lessThanArr_iIndexes = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    lessThanArr_iIndexes.add(j);
                }
            }

            // 2. Among them, find element at k that has max lisEndWith[k]
            if (lessThanArr_iIndexes.isEmpty()) {
                lisEndWith[i] = 1;
            } else {
                int k = lessThanArr_iIndexes.get(0);
                for (int index : lessThanArr_iIndexes) {
                    if (lisEndWith[index] > lisEndWith[k]) k = index;
                }

                // 3.
                lisEndWith[i] = lisEndWith[k] + 1;
            }
        }

        int result = lisEndWith[0];
        for (int i = 1; i < n; i++) {
            if (lisEndWith[i] > result) result = lisEndWith[i];
        }

        System.out.println(result);
        return result;
    }

}
